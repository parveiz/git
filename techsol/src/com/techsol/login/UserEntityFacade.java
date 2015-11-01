package com.techsol.login;

import java.util.List;
import java.util.logging.Level;

import javax.ejb.Stateless;
import javax.persistence.EntityGraph;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.techsol.claims.entity.LogUtil;

@Stateless
public class UserEntityFacade {

	public static final String USERNAME = "username";
	public static final String PASSWORD = "password";
	

	@PersistenceContext
	private EntityManager entityManager;

public void save(UserEntity entity) {
		LogUtil.log("saving User instance", Level.INFO, null);
		try {
			entityManager.persist(entity);
			LogUtil.log("save successful", Level.INFO, null);
		} catch (RuntimeException re) {
			LogUtil.log("save failed", Level.SEVERE, re);
			throw re;
		}
	}

	public void delete(UserEntity entity) {
		LogUtil.log("deleting User instance", Level.INFO, null);
		try {
			entity = entityManager.getReference(UserEntity.class, entity.getUsername());
			entityManager.remove(entity);
			LogUtil.log("delete successful", Level.INFO, null);
		} catch (RuntimeException re) {
			LogUtil.log("delete failed", Level.SEVERE, re);
			throw re;
		}
	}

	public UserEntity update(UserEntity entity) {
		LogUtil.log("updating User instance", Level.INFO, null);
		try {
			UserEntity result = entityManager.merge(entity);
			LogUtil.log("update successful", Level.INFO, null);
			return result;
		} catch (RuntimeException re) {
			LogUtil.log("update failed", Level.SEVERE, re);
			throw re;
		}
	}

	public UserEntity findById(String id) {
		LogUtil.log("finding User instance with id: " + id, Level.INFO, null);
		try {
			UserEntity instance = entityManager.find(UserEntity.class, id);
			return instance;
		} catch (RuntimeException re) {
			LogUtil.log("find failed", Level.SEVERE, re);
			throw re;
		}
	}

	@SuppressWarnings("unchecked")
	public List<UserEntity> findAll() {
		LogUtil.log("finding all User instances", Level.INFO, null);
		try {
			final String queryString = "select model from UserEntity model";
			Query query = entityManager.createQuery(queryString);
			return query.getResultList();
		} catch (RuntimeException re) {
			LogUtil.log("find all failed", Level.SEVERE, re);
			throw re;
		}
	}

	public UserEntity login(String username, String password) {
		LogUtil.log("finding User instance with property: " + USERNAME
				+ ", value: " + username, Level.INFO, null);
		try {
			final String queryString = "select model from UserEntity model where model."
					+ USERNAME + "= :username and "
					+ PASSWORD + "= password(:password)";
			EntityGraph<UserEntity> userGraph = entityManager.createEntityGraph(UserEntity.class);
			TypedQuery<UserEntity> userQuery =  entityManager.createQuery(queryString, UserEntity.class)
					.setHint("javax.persistence.fetchgraph", userGraph);
			userQuery.setParameter(USERNAME, username);
			userQuery.setParameter(PASSWORD, password);
			return userQuery.getSingleResult();
		} catch (RuntimeException re) {
			LogUtil.log("find by user failed", Level.SEVERE, re);
			return null;
		}
	}

}
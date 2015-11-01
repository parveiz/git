package com.techsol.login;

import java.util.logging.Level;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PrePersist;
import javax.persistence.Query;

import com.techsol.claims.entity.LogUtil;

public class UserEntityListener {

	@PersistenceContext
	private EntityManager entityManager;

	@PrePersist
	public void toEncryptedPassword(UserEntity entity)
	{
		try {
			final String queryString = "select PASSWORD(:Pwd)";
			Query query = entityManager.createNativeQuery(queryString);
			query.setParameter("Pwd", entity.getPassword());
			Object result = query.getSingleResult();
			String encryptedPassword=result.toString();
			entity.setPassword(encryptedPassword);
		} catch (RuntimeException re) {
			LogUtil.log("encryption failed", Level.SEVERE, re);
			throw re;
		}
	}
}

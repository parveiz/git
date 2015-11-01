package com.techsol.claims.entity;
// default package

import java.util.List;
import java.util.logging.Level;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 * Facade for entity Reglensspec.
 * 
 * @see .Reglensspec
 * @author MyEclipse Persistence Tools
 */
@Stateless
public class ReglensspecFacade {
	// property constants

	@PersistenceContext
	private EntityManager entityManager;

	/**
	 * Perform an initial save of a previously unsaved Reglensspec entity. All
	 * subsequent persist actions of this entity should use the #update()
	 * method.
	 * 
	 * @param entity
	 *            Reglensspec entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(Reglensspec entity) {
		LogUtil.log("saving Reglensspec instance", Level.INFO, null);
		try {
			entityManager.persist(entity);
			LogUtil.log("save successful", Level.INFO, null);
		} catch (RuntimeException re) {
			LogUtil.log("save failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Delete a persistent Reglensspec entity.
	 * 
	 * @param entity
	 *            Reglensspec entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(Reglensspec entity) {
		LogUtil.log("deleting Reglensspec instance", Level.INFO, null);
		try {
			entity = entityManager.getReference(Reglensspec.class,
					entity.getId());
			entityManager.remove(entity);
			LogUtil.log("delete successful", Level.INFO, null);
		} catch (RuntimeException re) {
			LogUtil.log("delete failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Persist a previously saved Reglensspec entity and return it or a copy of
	 * it to the sender. A copy of the Reglensspec entity parameter is returned
	 * when the JPA persistence mechanism has not previously been tracking the
	 * updated entity.
	 * 
	 * @param entity
	 *            Reglensspec entity to update
	 * @return Reglensspec the persisted Reglensspec entity instance, may not be
	 *         the same
	 * @throws RuntimeException
	 *             if the operation fails
	 */
	public Reglensspec update(Reglensspec entity) {
		LogUtil.log("updating Reglensspec instance", Level.INFO, null);
		try {
			Reglensspec result = entityManager.merge(entity);
			LogUtil.log("update successful", Level.INFO, null);
			return result;
		} catch (RuntimeException re) {
			LogUtil.log("update failed", Level.SEVERE, re);
			throw re;
		}
	}

	public Reglensspec findById(ReglensspecId id) {
		LogUtil.log("finding Reglensspec instance with id: " + id, Level.INFO,
				null);
		try {
			Reglensspec instance = entityManager.find(Reglensspec.class, id);
			return instance;
		} catch (RuntimeException re) {
			LogUtil.log("find failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Find all Reglensspec entities with a specific property value.
	 * 
	 * @param propertyName
	 *            the name of the Reglensspec property to query
	 * @param value
	 *            the property value to match
	 * @return List<Reglensspec> found by query
	 */
	@SuppressWarnings("unchecked")
	public List<Reglensspec> findByProperty(String propertyName,
			final Object value) {
		LogUtil.log("finding Reglensspec instance with property: "
				+ propertyName + ", value: " + value, Level.INFO, null);
		try {
			final String queryString = "select model from Reglensspec model where model."
					+ propertyName + "= :propertyValue";
			Query query = entityManager.createQuery(queryString);
			query.setParameter("propertyValue", value);
			return query.getResultList();
		} catch (RuntimeException re) {
			LogUtil.log("find by property name failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Find all Reglensspec entities.
	 * 
	 * @return List<Reglensspec> all Reglensspec entities
	 */
	@SuppressWarnings("unchecked")
	public List<Reglensspec> findAll() {
		LogUtil.log("finding all Reglensspec instances", Level.INFO, null);
		try {
			final String queryString = "select model from Reglensspec model";
			Query query = entityManager.createQuery(queryString);
			return query.getResultList();
		} catch (RuntimeException re) {
			LogUtil.log("find all failed", Level.SEVERE, re);
			throw re;
		}
	}

}
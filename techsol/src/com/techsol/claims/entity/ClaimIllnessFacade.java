package com.techsol.claims.entity;
// default package

import java.util.List;
import java.util.logging.Level;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 * Facade for entity ClaimIllness.
 * 
 * @see .ClaimIllness
 * @author MyEclipse Persistence Tools
 */
@Stateless
public class ClaimIllnessFacade {
	// property constants

	@PersistenceContext
	private EntityManager entityManager;

	/**
	 * Perform an initial save of a previously unsaved ClaimIllness entity. All
	 * subsequent persist actions of this entity should use the #update()
	 * method.
	 * 
	 * @param entity
	 *            ClaimIllness entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(ClaimIllness entity) {
		LogUtil.log("saving ClaimIllness instance", Level.INFO, null);
		try {
			entityManager.persist(entity);
			LogUtil.log("save successful", Level.INFO, null);
		} catch (RuntimeException re) {
			LogUtil.log("save failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Delete a persistent ClaimIllness entity.
	 * 
	 * @param entity
	 *            ClaimIllness entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(ClaimIllness entity) {
		LogUtil.log("deleting ClaimIllness instance", Level.INFO, null);
		try {
			entity = entityManager.getReference(ClaimIllness.class,
					entity.getId());
			entityManager.remove(entity);
			LogUtil.log("delete successful", Level.INFO, null);
		} catch (RuntimeException re) {
			LogUtil.log("delete failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Persist a previously saved ClaimIllness entity and return it or a copy of
	 * it to the sender. A copy of the ClaimIllness entity parameter is returned
	 * when the JPA persistence mechanism has not previously been tracking the
	 * updated entity.
	 * 
	 * @param entity
	 *            ClaimIllness entity to update
	 * @return ClaimIllness the persisted ClaimIllness entity instance, may not
	 *         be the same
	 * @throws RuntimeException
	 *             if the operation fails
	 */
	public ClaimIllness update(ClaimIllness entity) {
		LogUtil.log("updating ClaimIllness instance", Level.INFO, null);
		try {
			ClaimIllness result = entityManager.merge(entity);
			LogUtil.log("update successful", Level.INFO, null);
			return result;
		} catch (RuntimeException re) {
			LogUtil.log("update failed", Level.SEVERE, re);
			throw re;
		}
	}

	public ClaimIllness findById(ClaimIllnessId id) {
		LogUtil.log("finding ClaimIllness instance with id: " + id, Level.INFO,
				null);
		try {
			ClaimIllness instance = entityManager.find(ClaimIllness.class, id);
			return instance;
		} catch (RuntimeException re) {
			LogUtil.log("find failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Find all ClaimIllness entities with a specific property value.
	 * 
	 * @param propertyName
	 *            the name of the ClaimIllness property to query
	 * @param value
	 *            the property value to match
	 * @return List<ClaimIllness> found by query
	 */
	@SuppressWarnings("unchecked")
	public List<ClaimIllness> findByProperty(String propertyName,
			final Object value) {
		LogUtil.log("finding ClaimIllness instance with property: "
				+ propertyName + ", value: " + value, Level.INFO, null);
		try {
			final String queryString = "select model from ClaimIllness model where model."
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
	 * Find all ClaimIllness entities.
	 * 
	 * @return List<ClaimIllness> all ClaimIllness entities
	 */
	@SuppressWarnings("unchecked")
	public List<ClaimIllness> findAll() {
		LogUtil.log("finding all ClaimIllness instances", Level.INFO, null);
		try {
			final String queryString = "select model from ClaimIllness model";
			Query query = entityManager.createQuery(queryString);
			return query.getResultList();
		} catch (RuntimeException re) {
			LogUtil.log("find all failed", Level.SEVERE, re);
			throw re;
		}
	}

}
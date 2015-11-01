package com.techsol.claims.entity;
// default package

import java.util.List;
import java.util.logging.Level;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 * Facade for entity ClaimDiagnosis.
 * 
 * @see .ClaimDiagnosis
 * @author MyEclipse Persistence Tools
 */
@Stateless
public class ClaimDiagnosisFacade {
	// property constants
	public static final String DIAGNOSISDESC = "diagnosisdesc";

	@PersistenceContext
	private EntityManager entityManager;

	/**
	 * Perform an initial save of a previously unsaved ClaimDiagnosis entity.
	 * All subsequent persist actions of this entity should use the #update()
	 * method.
	 * 
	 * @param entity
	 *            ClaimDiagnosis entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(ClaimDiagnosis entity) {
		LogUtil.log("saving ClaimDiagnosis instance", Level.INFO, null);
		try {
			entityManager.persist(entity);
			LogUtil.log("save successful", Level.INFO, null);
		} catch (RuntimeException re) {
			LogUtil.log("save failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Delete a persistent ClaimDiagnosis entity.
	 * 
	 * @param entity
	 *            ClaimDiagnosis entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(ClaimDiagnosis entity) {
		LogUtil.log("deleting ClaimDiagnosis instance", Level.INFO, null);
		try {
			entity = entityManager.getReference(ClaimDiagnosis.class,
					entity.getId());
			entityManager.remove(entity);
			LogUtil.log("delete successful", Level.INFO, null);
		} catch (RuntimeException re) {
			LogUtil.log("delete failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Persist a previously saved ClaimDiagnosis entity and return it or a copy
	 * of it to the sender. A copy of the ClaimDiagnosis entity parameter is
	 * returned when the JPA persistence mechanism has not previously been
	 * tracking the updated entity.
	 * 
	 * @param entity
	 *            ClaimDiagnosis entity to update
	 * @return ClaimDiagnosis the persisted ClaimDiagnosis entity instance, may
	 *         not be the same
	 * @throws RuntimeException
	 *             if the operation fails
	 */
	public ClaimDiagnosis update(ClaimDiagnosis entity) {
		LogUtil.log("updating ClaimDiagnosis instance", Level.INFO, null);
		try {
			ClaimDiagnosis result = entityManager.merge(entity);
			LogUtil.log("update successful", Level.INFO, null);
			return result;
		} catch (RuntimeException re) {
			LogUtil.log("update failed", Level.SEVERE, re);
			throw re;
		}
	}

	public ClaimDiagnosis findById(ClaimDiagnosisId id) {
		LogUtil.log("finding ClaimDiagnosis instance with id: " + id,
				Level.INFO, null);
		try {
			ClaimDiagnosis instance = entityManager.find(ClaimDiagnosis.class,
					id);
			return instance;
		} catch (RuntimeException re) {
			LogUtil.log("find failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Find all ClaimDiagnosis entities with a specific property value.
	 * 
	 * @param propertyName
	 *            the name of the ClaimDiagnosis property to query
	 * @param value
	 *            the property value to match
	 * @return List<ClaimDiagnosis> found by query
	 */
	@SuppressWarnings("unchecked")
	public List<ClaimDiagnosis> findByProperty(String propertyName,
			final Object value) {
		LogUtil.log("finding ClaimDiagnosis instance with property: "
				+ propertyName + ", value: " + value, Level.INFO, null);
		try {
			final String queryString = "select model from ClaimDiagnosis model where model."
					+ propertyName + "= :propertyValue";
			Query query = entityManager.createQuery(queryString);
			query.setParameter("propertyValue", value);
			return query.getResultList();
		} catch (RuntimeException re) {
			LogUtil.log("find by property name failed", Level.SEVERE, re);
			throw re;
		}
	}

	public List<ClaimDiagnosis> findByDiagnosisdesc(Object diagnosisdesc) {
		return findByProperty(DIAGNOSISDESC, diagnosisdesc);
	}

	/**
	 * Find all ClaimDiagnosis entities.
	 * 
	 * @return List<ClaimDiagnosis> all ClaimDiagnosis entities
	 */
	@SuppressWarnings("unchecked")
	public List<ClaimDiagnosis> findAll() {
		LogUtil.log("finding all ClaimDiagnosis instances", Level.INFO, null);
		try {
			final String queryString = "select model from ClaimDiagnosis model";
			Query query = entityManager.createQuery(queryString);
			return query.getResultList();
		} catch (RuntimeException re) {
			LogUtil.log("find all failed", Level.SEVERE, re);
			throw re;
		}
	}

}
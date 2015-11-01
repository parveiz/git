package com.techsol.claims.entity;
// default package

import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 * Facade for entity LabResult.
 * 
 * @see .LabResult
 * @author MyEclipse Persistence Tools
 */
@Stateless
public class LabResultFacade {
	// property constants
	public static final String LABDESC = "labdesc";

	@PersistenceContext
	private EntityManager entityManager;

	/**
	 * Perform an initial save of a previously unsaved LabResult entity. All
	 * subsequent persist actions of this entity should use the #update()
	 * method.
	 * 
	 * @param entity
	 *            LabResult entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(LabResult entity) {
		LogUtil.log("saving LabResult instance", Level.INFO, null);
		try {
			entityManager.persist(entity);
			LogUtil.log("save successful", Level.INFO, null);
		} catch (RuntimeException re) {
			LogUtil.log("save failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Delete a persistent LabResult entity.
	 * 
	 * @param entity
	 *            LabResult entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(LabResult entity) {
		LogUtil.log("deleting LabResult instance", Level.INFO, null);
		try {
			entity = entityManager
					.getReference(LabResult.class, entity.getId());
			entityManager.remove(entity);
			LogUtil.log("delete successful", Level.INFO, null);
		} catch (RuntimeException re) {
			LogUtil.log("delete failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Persist a previously saved LabResult entity and return it or a copy of it
	 * to the sender. A copy of the LabResult entity parameter is returned when
	 * the JPA persistence mechanism has not previously been tracking the
	 * updated entity.
	 * 
	 * @param entity
	 *            LabResult entity to update
	 * @return LabResult the persisted LabResult entity instance, may not be the
	 *         same
	 * @throws RuntimeException
	 *             if the operation fails
	 */
	public LabResult update(LabResult entity) {
		LogUtil.log("updating LabResult instance", Level.INFO, null);
		try {
			LabResult result = entityManager.merge(entity);
			LogUtil.log("update successful", Level.INFO, null);
			return result;
		} catch (RuntimeException re) {
			LogUtil.log("update failed", Level.SEVERE, re);
			throw re;
		}
	}

	public LabResult findById(LabResultId id) {
		LogUtil.log("finding LabResult instance with id: " + id, Level.INFO,
				null);
		try {
			LabResult instance = entityManager.find(LabResult.class, id);
			return instance;
		} catch (RuntimeException re) {
			LogUtil.log("find failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Find all LabResult entities with a specific property value.
	 * 
	 * @param propertyName
	 *            the name of the LabResult property to query
	 * @param value
	 *            the property value to match
	 * @return List<LabResult> found by query
	 */
	@SuppressWarnings("unchecked")
	public List<LabResult> findByProperty(String propertyName,
			final Object value) {
		LogUtil.log("finding LabResult instance with property: " + propertyName
				+ ", value: " + value, Level.INFO, null);
		try {
			final String queryString = "select model from LabResult model where model."
					+ propertyName + "= :propertyValue";
			Query query = entityManager.createQuery(queryString);
			query.setParameter("propertyValue", value);
			return query.getResultList();
		} catch (RuntimeException re) {
			LogUtil.log("find by property name failed", Level.SEVERE, re);
			throw re;
		}
	}

	public List<LabResult> findByLabdesc(Object labdesc) {
		return findByProperty(LABDESC, labdesc);
	}

	/**
	 * Find all LabResult entities.
	 * 
	 * @return List<LabResult> all LabResult entities
	 */
	@SuppressWarnings("unchecked")
	public List<LabResult> findAll() {
		LogUtil.log("finding all LabResult instances", Level.INFO, null);
		try {
			final String queryString = "select model from LabResult model";
			Query query = entityManager.createQuery(queryString);
			return query.getResultList();
		} catch (RuntimeException re) {
			LogUtil.log("find all failed", Level.SEVERE, re);
			throw re;
		}
	}

}
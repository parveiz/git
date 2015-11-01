package com.techsol.claims.entity;
// default package

import java.util.List;
import java.util.logging.Level;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 * Facade for entity ServiceDetails.
 * 
 * @see .ServiceDetails
 * @author MyEclipse Persistence Tools
 */
@Stateless
public class ServiceDetailsFacade {
	// property constants

	@PersistenceContext
	private EntityManager entityManager;

	/**
	 * Perform an initial save of a previously unsaved ServiceDetails entity.
	 * All subsequent persist actions of this entity should use the #update()
	 * method.
	 * 
	 * @param entity
	 *            ServiceDetails entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(ServiceDetails entity) {
		LogUtil.log("saving ServiceDetails instance", Level.INFO, null);
		try {
			entityManager.persist(entity);
			LogUtil.log("save successful", Level.INFO, null);
		} catch (RuntimeException re) {
			LogUtil.log("save failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Delete a persistent ServiceDetails entity.
	 * 
	 * @param entity
	 *            ServiceDetails entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(ServiceDetails entity) {
		LogUtil.log("deleting ServiceDetails instance", Level.INFO, null);
		try {
			entity = entityManager.getReference(ServiceDetails.class,
					entity.getId());
			entityManager.remove(entity);
			LogUtil.log("delete successful", Level.INFO, null);
		} catch (RuntimeException re) {
			LogUtil.log("delete failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Persist a previously saved ServiceDetails entity and return it or a copy
	 * of it to the sender. A copy of the ServiceDetails entity parameter is
	 * returned when the JPA persistence mechanism has not previously been
	 * tracking the updated entity.
	 * 
	 * @param entity
	 *            ServiceDetails entity to update
	 * @return ServiceDetails the persisted ServiceDetails entity instance, may
	 *         not be the same
	 * @throws RuntimeException
	 *             if the operation fails
	 */
	public ServiceDetails update(ServiceDetails entity) {
		LogUtil.log("updating ServiceDetails instance", Level.INFO, null);
		try {
			ServiceDetails result = entityManager.merge(entity);
			LogUtil.log("update successful", Level.INFO, null);
			return result;
		} catch (RuntimeException re) {
			LogUtil.log("update failed", Level.SEVERE, re);
			throw re;
		}
	}

	public ServiceDetails findById(ServiceDetailsId id) {
		LogUtil.log("finding ServiceDetails instance with id: " + id,
				Level.INFO, null);
		try {
			ServiceDetails instance = entityManager.find(ServiceDetails.class,
					id);
			return instance;
		} catch (RuntimeException re) {
			LogUtil.log("find failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Find all ServiceDetails entities with a specific property value.
	 * 
	 * @param propertyName
	 *            the name of the ServiceDetails property to query
	 * @param value
	 *            the property value to match
	 * @return List<ServiceDetails> found by query
	 */
	@SuppressWarnings("unchecked")
	public List<ServiceDetails> findByProperty(String propertyName,
			final Object value) {
		LogUtil.log("finding ServiceDetails instance with property: "
				+ propertyName + ", value: " + value, Level.INFO, null);
		try {
			final String queryString = "select model from ServiceDetails model where model."
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
	 * Find all ServiceDetails entities.
	 * 
	 * @return List<ServiceDetails> all ServiceDetails entities
	 */
	@SuppressWarnings("unchecked")
	public List<ServiceDetails> findAll() {
		LogUtil.log("finding all ServiceDetails instances", Level.INFO, null);
		try {
			final String queryString = "select model from ServiceDetails model";
			Query query = entityManager.createQuery(queryString);
			return query.getResultList();
		} catch (RuntimeException re) {
			LogUtil.log("find all failed", Level.SEVERE, re);
			throw re;
		}
	}

}
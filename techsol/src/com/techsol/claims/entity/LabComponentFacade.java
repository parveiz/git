package com.techsol.claims.entity;
// default package

import java.util.List;
import java.util.logging.Level;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 * Facade for entity LabComponent.
 * 
 * @see .LabComponent
 * @author MyEclipse Persistence Tools
 */
@Stateless
public class LabComponentFacade {
	// property constants
	public static final String LABCOMPDESC = "labcompdesc";
	public static final String LABRESULT = "labresult";
	public static final String LABRESULTUNIT = "labresultunit";
	public static final String LABRESULTCOMMENT = "labresultcomment";

	@PersistenceContext
	private EntityManager entityManager;

	/**
	 * Perform an initial save of a previously unsaved LabComponent entity. All
	 * subsequent persist actions of this entity should use the #update()
	 * method.
	 * 
	 * @param entity
	 *            LabComponent entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(LabComponent entity) {
		LogUtil.log("saving LabComponent instance", Level.INFO, null);
		try {
			entityManager.persist(entity);
			LogUtil.log("save successful", Level.INFO, null);
		} catch (RuntimeException re) {
			LogUtil.log("save failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Delete a persistent LabComponent entity.
	 * 
	 * @param entity
	 *            LabComponent entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(LabComponent entity) {
		LogUtil.log("deleting LabComponent instance", Level.INFO, null);
		try {
			entity = entityManager.getReference(LabComponent.class,
					entity.getId());
			entityManager.remove(entity);
			LogUtil.log("delete successful", Level.INFO, null);
		} catch (RuntimeException re) {
			LogUtil.log("delete failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Persist a previously saved LabComponent entity and return it or a copy of
	 * it to the sender. A copy of the LabComponent entity parameter is returned
	 * when the JPA persistence mechanism has not previously been tracking the
	 * updated entity.
	 * 
	 * @param entity
	 *            LabComponent entity to update
	 * @return LabComponent the persisted LabComponent entity instance, may not
	 *         be the same
	 * @throws RuntimeException
	 *             if the operation fails
	 */
	public LabComponent update(LabComponent entity) {
		LogUtil.log("updating LabComponent instance", Level.INFO, null);
		try {
			LabComponent result = entityManager.merge(entity);
			LogUtil.log("update successful", Level.INFO, null);
			return result;
		} catch (RuntimeException re) {
			LogUtil.log("update failed", Level.SEVERE, re);
			throw re;
		}
	}

	public LabComponent findById(LabComponentId id) {
		LogUtil.log("finding LabComponent instance with id: " + id, Level.INFO,
				null);
		try {
			LabComponent instance = entityManager.find(LabComponent.class, id);
			return instance;
		} catch (RuntimeException re) {
			LogUtil.log("find failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Find all LabComponent entities with a specific property value.
	 * 
	 * @param propertyName
	 *            the name of the LabComponent property to query
	 * @param value
	 *            the property value to match
	 * @return List<LabComponent> found by query
	 */
	@SuppressWarnings("unchecked")
	public List<LabComponent> findByProperty(String propertyName,
			final Object value) {
		LogUtil.log("finding LabComponent instance with property: "
				+ propertyName + ", value: " + value, Level.INFO, null);
		try {
			final String queryString = "select model from LabComponent model where model."
					+ propertyName + "= :propertyValue";
			Query query = entityManager.createQuery(queryString);
			query.setParameter("propertyValue", value);
			return query.getResultList();
		} catch (RuntimeException re) {
			LogUtil.log("find by property name failed", Level.SEVERE, re);
			throw re;
		}
	}

	public List<LabComponent> findByLabcompdesc(Object labcompdesc) {
		return findByProperty(LABCOMPDESC, labcompdesc);
	}

	public List<LabComponent> findByLabresult(Object labresult) {
		return findByProperty(LABRESULT, labresult);
	}

	public List<LabComponent> findByLabresultunit(Object labresultunit) {
		return findByProperty(LABRESULTUNIT, labresultunit);
	}

	public List<LabComponent> findByLabresultcomment(Object labresultcomment) {
		return findByProperty(LABRESULTCOMMENT, labresultcomment);
	}

	/**
	 * Find all LabComponent entities.
	 * 
	 * @return List<LabComponent> all LabComponent entities
	 */
	@SuppressWarnings("unchecked")
	public List<LabComponent> findAll() {
		LogUtil.log("finding all LabComponent instances", Level.INFO, null);
		try {
			final String queryString = "select model from LabComponent model";
			Query query = entityManager.createQuery(queryString);
			return query.getResultList();
		} catch (RuntimeException re) {
			LogUtil.log("find all failed", Level.SEVERE, re);
			throw re;
		}
	}

}
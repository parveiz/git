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
 * Facade for entity ServiceOptical.
 * 
 * @see .ServiceOptical
 * @author MyEclipse Persistence Tools
 */
@Stateless
public class ServiceOpticalFacade {
	// property constants
	public static final String LENSESTYPE = "lensestype";
	public static final String REGLENSESTYPE = "reglensestype";
	public static final String CONLENSESTYPE = "conlensestype";
	public static final String NOOFPAIRS = "noofpairs";
	public static final String LENSESGRSAMT = "lensesgrsamt";
	public static final String LENSESDISC = "lensesdisc";
	public static final String LENSESPATSHARE = "lensespatshare";
	public static final String LENSESNETAMT = "lensesnetamt";
	public static final String FRAMEGRSAMT = "framegrsamt";
	public static final String FRAMEDISC = "framedisc";
	public static final String FRAMEPATSHARE = "framepatshare";
	public static final String FRAMENETAMT = "framenetamt";

	@PersistenceContext
	private EntityManager entityManager;

	/**
	 * Perform an initial save of a previously unsaved ServiceOptical entity.
	 * All subsequent persist actions of this entity should use the #update()
	 * method.
	 * 
	 * @param entity
	 *            ServiceOptical entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(ServiceOptical entity) {
		LogUtil.log("saving ServiceOptical instance", Level.INFO, null);
		try {
			entityManager.persist(entity);
			LogUtil.log("save successful", Level.INFO, null);
		} catch (RuntimeException re) {
			LogUtil.log("save failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Delete a persistent ServiceOptical entity.
	 * 
	 * @param entity
	 *            ServiceOptical entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(ServiceOptical entity) {
		LogUtil.log("deleting ServiceOptical instance", Level.INFO, null);
		try {
			entity = entityManager.getReference(ServiceOptical.class,
					entity.getId());
			entityManager.remove(entity);
			LogUtil.log("delete successful", Level.INFO, null);
		} catch (RuntimeException re) {
			LogUtil.log("delete failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Persist a previously saved ServiceOptical entity and return it or a copy
	 * of it to the sender. A copy of the ServiceOptical entity parameter is
	 * returned when the JPA persistence mechanism has not previously been
	 * tracking the updated entity.
	 * 
	 * @param entity
	 *            ServiceOptical entity to update
	 * @return ServiceOptical the persisted ServiceOptical entity instance, may
	 *         not be the same
	 * @throws RuntimeException
	 *             if the operation fails
	 */
	public ServiceOptical update(ServiceOptical entity) {
		LogUtil.log("updating ServiceOptical instance", Level.INFO, null);
		try {
			ServiceOptical result = entityManager.merge(entity);
			LogUtil.log("update successful", Level.INFO, null);
			return result;
		} catch (RuntimeException re) {
			LogUtil.log("update failed", Level.SEVERE, re);
			throw re;
		}
	}

	public ServiceOptical findById(ServiceOpticalId id) {
		LogUtil.log("finding ServiceOptical instance with id: " + id,
				Level.INFO, null);
		try {
			ServiceOptical instance = entityManager.find(ServiceOptical.class,
					id);
			return instance;
		} catch (RuntimeException re) {
			LogUtil.log("find failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Find all ServiceOptical entities with a specific property value.
	 * 
	 * @param propertyName
	 *            the name of the ServiceOptical property to query
	 * @param value
	 *            the property value to match
	 * @return List<ServiceOptical> found by query
	 */
	@SuppressWarnings("unchecked")
	public List<ServiceOptical> findByProperty(String propertyName,
			final Object value) {
		LogUtil.log("finding ServiceOptical instance with property: "
				+ propertyName + ", value: " + value, Level.INFO, null);
		try {
			final String queryString = "select model from ServiceOptical model where model."
					+ propertyName + "= :propertyValue";
			Query query = entityManager.createQuery(queryString);
			query.setParameter("propertyValue", value);
			return query.getResultList();
		} catch (RuntimeException re) {
			LogUtil.log("find by property name failed", Level.SEVERE, re);
			throw re;
		}
	}

	public List<ServiceOptical> findByLensestype(Object lensestype) {
		return findByProperty(LENSESTYPE, lensestype);
	}

	public List<ServiceOptical> findByReglensestype(Object reglensestype) {
		return findByProperty(REGLENSESTYPE, reglensestype);
	}

	public List<ServiceOptical> findByConlensestype(Object conlensestype) {
		return findByProperty(CONLENSESTYPE, conlensestype);
	}

	public List<ServiceOptical> findByNoofpairs(Object noofpairs) {
		return findByProperty(NOOFPAIRS, noofpairs);
	}

	public List<ServiceOptical> findByLensesgrsamt(Object lensesgrsamt) {
		return findByProperty(LENSESGRSAMT, lensesgrsamt);
	}

	public List<ServiceOptical> findByLensesdisc(Object lensesdisc) {
		return findByProperty(LENSESDISC, lensesdisc);
	}

	public List<ServiceOptical> findByLensespatshare(Object lensespatshare) {
		return findByProperty(LENSESPATSHARE, lensespatshare);
	}

	public List<ServiceOptical> findByLensesnetamt(Object lensesnetamt) {
		return findByProperty(LENSESNETAMT, lensesnetamt);
	}

	public List<ServiceOptical> findByFramegrsamt(Object framegrsamt) {
		return findByProperty(FRAMEGRSAMT, framegrsamt);
	}

	public List<ServiceOptical> findByFramedisc(Object framedisc) {
		return findByProperty(FRAMEDISC, framedisc);
	}

	public List<ServiceOptical> findByFramepatshare(Object framepatshare) {
		return findByProperty(FRAMEPATSHARE, framepatshare);
	}

	public List<ServiceOptical> findByFramenetamt(Object framenetamt) {
		return findByProperty(FRAMENETAMT, framenetamt);
	}

	/**
	 * Find all ServiceOptical entities.
	 * 
	 * @return List<ServiceOptical> all ServiceOptical entities
	 */
	@SuppressWarnings("unchecked")
	public List<ServiceOptical> findAll() {
		LogUtil.log("finding all ServiceOptical instances", Level.INFO, null);
		try {
			final String queryString = "select model from ServiceOptical model";
			Query query = entityManager.createQuery(queryString);
			return query.getResultList();
		} catch (RuntimeException re) {
			LogUtil.log("find all failed", Level.SEVERE, re);
			throw re;
		}
	}

}
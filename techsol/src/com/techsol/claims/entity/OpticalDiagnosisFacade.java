package com.techsol.claims.entity;
// default package

import java.util.List;
import java.util.logging.Level;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 * Facade for entity OpticalDiagnosis.
 * 
 * @see .OpticalDiagnosis
 * @author MyEclipse Persistence Tools
 */
@Stateless
public class OpticalDiagnosisFacade {
	// property constants
	public static final String RIGHTEYESPHEREDIST = "righteyespheredist";
	public static final String RIGHTEYECYLDIST = "righteyecyldist";
	public static final String RIGHTEYESPHERENEAR = "righteyespherenear";
	public static final String RIGHTEYECYLNEAR = "righteyecylnear";
	public static final String LEFTEYESPHEREDIST = "lefteyespheredist";
	public static final String LEFTEYECYLDIST = "lefteyecyldist";
	public static final String LEFTEYESPHERENEAR = "lefteyespherenear";
	public static final String LEFTEYECYLNEAR = "lefteyecylnear";

	@PersistenceContext
	private EntityManager entityManager;

	/**
	 * Perform an initial save of a previously unsaved OpticalDiagnosis entity.
	 * All subsequent persist actions of this entity should use the #update()
	 * method.
	 * 
	 * @param entity
	 *            OpticalDiagnosis entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(OpticalDiagnosis entity) {
		LogUtil.log("saving OpticalDiagnosis instance", Level.INFO, null);
		try {
			entityManager.persist(entity);
			LogUtil.log("save successful", Level.INFO, null);
		} catch (RuntimeException re) {
			LogUtil.log("save failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Delete a persistent OpticalDiagnosis entity.
	 * 
	 * @param entity
	 *            OpticalDiagnosis entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(OpticalDiagnosis entity) {
		LogUtil.log("deleting OpticalDiagnosis instance", Level.INFO, null);
		try {
			entity = entityManager.getReference(OpticalDiagnosis.class,
					entity.getProvclaimno());
			entityManager.remove(entity);
			LogUtil.log("delete successful", Level.INFO, null);
		} catch (RuntimeException re) {
			LogUtil.log("delete failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Persist a previously saved OpticalDiagnosis entity and return it or a
	 * copy of it to the sender. A copy of the OpticalDiagnosis entity parameter
	 * is returned when the JPA persistence mechanism has not previously been
	 * tracking the updated entity.
	 * 
	 * @param entity
	 *            OpticalDiagnosis entity to update
	 * @return OpticalDiagnosis the persisted OpticalDiagnosis entity instance,
	 *         may not be the same
	 * @throws RuntimeException
	 *             if the operation fails
	 */
	public OpticalDiagnosis update(OpticalDiagnosis entity) {
		LogUtil.log("updating OpticalDiagnosis instance", Level.INFO, null);
		try {
			OpticalDiagnosis result = entityManager.merge(entity);
			LogUtil.log("update successful", Level.INFO, null);
			return result;
		} catch (RuntimeException re) {
			LogUtil.log("update failed", Level.SEVERE, re);
			throw re;
		}
	}

	public OpticalDiagnosis findById(String id) {
		LogUtil.log("finding OpticalDiagnosis instance with id: " + id,
				Level.INFO, null);
		try {
			OpticalDiagnosis instance = entityManager.find(
					OpticalDiagnosis.class, id);
			return instance;
		} catch (RuntimeException re) {
			LogUtil.log("find failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Find all OpticalDiagnosis entities with a specific property value.
	 * 
	 * @param propertyName
	 *            the name of the OpticalDiagnosis property to query
	 * @param value
	 *            the property value to match
	 * @return List<OpticalDiagnosis> found by query
	 */
	@SuppressWarnings("unchecked")
	public List<OpticalDiagnosis> findByProperty(String propertyName,
			final Object value) {
		LogUtil.log("finding OpticalDiagnosis instance with property: "
				+ propertyName + ", value: " + value, Level.INFO, null);
		try {
			final String queryString = "select model from OpticalDiagnosis model where model."
					+ propertyName + "= :propertyValue";
			Query query = entityManager.createQuery(queryString);
			query.setParameter("propertyValue", value);
			return query.getResultList();
		} catch (RuntimeException re) {
			LogUtil.log("find by property name failed", Level.SEVERE, re);
			throw re;
		}
	}

	public List<OpticalDiagnosis> findByRighteyespheredist(
			Object righteyespheredist) {
		return findByProperty(RIGHTEYESPHEREDIST, righteyespheredist);
	}

	public List<OpticalDiagnosis> findByRighteyecyldist(Object righteyecyldist) {
		return findByProperty(RIGHTEYECYLDIST, righteyecyldist);
	}

	public List<OpticalDiagnosis> findByRighteyespherenear(
			Object righteyespherenear) {
		return findByProperty(RIGHTEYESPHERENEAR, righteyespherenear);
	}

	public List<OpticalDiagnosis> findByRighteyecylnear(Object righteyecylnear) {
		return findByProperty(RIGHTEYECYLNEAR, righteyecylnear);
	}

	public List<OpticalDiagnosis> findByLefteyespheredist(
			Object lefteyespheredist) {
		return findByProperty(LEFTEYESPHEREDIST, lefteyespheredist);
	}

	public List<OpticalDiagnosis> findByLefteyecyldist(Object lefteyecyldist) {
		return findByProperty(LEFTEYECYLDIST, lefteyecyldist);
	}

	public List<OpticalDiagnosis> findByLefteyespherenear(
			Object lefteyespherenear) {
		return findByProperty(LEFTEYESPHERENEAR, lefteyespherenear);
	}

	public List<OpticalDiagnosis> findByLefteyecylnear(Object lefteyecylnear) {
		return findByProperty(LEFTEYECYLNEAR, lefteyecylnear);
	}

	/**
	 * Find all OpticalDiagnosis entities.
	 * 
	 * @return List<OpticalDiagnosis> all OpticalDiagnosis entities
	 */
	@SuppressWarnings("unchecked")
	public List<OpticalDiagnosis> findAll() {
		LogUtil.log("finding all OpticalDiagnosis instances", Level.INFO, null);
		try {
			final String queryString = "select model from OpticalDiagnosis model";
			Query query = entityManager.createQuery(queryString);
			return query.getResultList();
		} catch (RuntimeException re) {
			LogUtil.log("find all failed", Level.SEVERE, re);
			throw re;
		}
	}

}
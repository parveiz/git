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
 * Facade for entity Invoices.
 * 
 * @see .Invoices
 * @author MyEclipse Persistence Tools
 */
@Stateless
public class InvoicesFacade {
	// property constants
	public static final String PROVCLAIMNO = "provclaimno";
	public static final String INVOICEDEPT = "invoicedept";
	public static final String TOTINVGRSAMT = "totinvgrsamt";
	public static final String TOTINVDISC = "totinvdisc";
	public static final String TOTINVPATSHARE = "totinvpatshare";
	public static final String TOTINVNETAMT = "totinvnetamt";

	@PersistenceContext
	private EntityManager entityManager;

	/**
	 * Perform an initial save of a previously unsaved Invoices entity. All
	 * subsequent persist actions of this entity should use the #update()
	 * method.
	 * 
	 * @param entity
	 *            Invoices entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(Invoices entity) {
		LogUtil.log("saving Invoices instance", Level.INFO, null);
		try {
			entityManager.persist(entity);
			LogUtil.log("save successful", Level.INFO, null);
		} catch (RuntimeException re) {
			LogUtil.log("save failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Delete a persistent Invoices entity.
	 * 
	 * @param entity
	 *            Invoices entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(Invoices entity) {
		LogUtil.log("deleting Invoices instance", Level.INFO, null);
		try {
			entity = entityManager.getReference(Invoices.class,
					entity.getInvoiceno());
			entityManager.remove(entity);
			LogUtil.log("delete successful", Level.INFO, null);
		} catch (RuntimeException re) {
			LogUtil.log("delete failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Persist a previously saved Invoices entity and return it or a copy of it
	 * to the sender. A copy of the Invoices entity parameter is returned when
	 * the JPA persistence mechanism has not previously been tracking the
	 * updated entity.
	 * 
	 * @param entity
	 *            Invoices entity to update
	 * @return Invoices the persisted Invoices entity instance, may not be the
	 *         same
	 * @throws RuntimeException
	 *             if the operation fails
	 */
	public Invoices update(Invoices entity) {
		LogUtil.log("updating Invoices instance", Level.INFO, null);
		try {
			Invoices result = entityManager.merge(entity);
			LogUtil.log("update successful", Level.INFO, null);
			return result;
		} catch (RuntimeException re) {
			LogUtil.log("update failed", Level.SEVERE, re);
			throw re;
		}
	}

	public Invoices findById(String id) {
		LogUtil.log("finding Invoices instance with id: " + id, Level.INFO,
				null);
		try {
			Invoices instance = entityManager.find(Invoices.class, id);
			return instance;
		} catch (RuntimeException re) {
			LogUtil.log("find failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Find all Invoices entities with a specific property value.
	 * 
	 * @param propertyName
	 *            the name of the Invoices property to query
	 * @param value
	 *            the property value to match
	 * @return List<Invoices> found by query
	 */
	@SuppressWarnings("unchecked")
	public List<Invoices> findByProperty(String propertyName, final Object value) {
		LogUtil.log("finding Invoices instance with property: " + propertyName
				+ ", value: " + value, Level.INFO, null);
		try {
			final String queryString = "select model from Invoices model where model."
					+ propertyName + "= :propertyValue";
			Query query = entityManager.createQuery(queryString);
			query.setParameter("propertyValue", value);
			return query.getResultList();
		} catch (RuntimeException re) {
			LogUtil.log("find by property name failed", Level.SEVERE, re);
			throw re;
		}
	}

	public List<Invoices> findByProvclaimno(Object provclaimno) {
		return findByProperty(PROVCLAIMNO, provclaimno);
	}

	public List<Invoices> findByInvoicedept(Object invoicedept) {
		return findByProperty(INVOICEDEPT, invoicedept);
	}

	public List<Invoices> findByTotinvgrsamt(Object totinvgrsamt) {
		return findByProperty(TOTINVGRSAMT, totinvgrsamt);
	}

	public List<Invoices> findByTotinvdisc(Object totinvdisc) {
		return findByProperty(TOTINVDISC, totinvdisc);
	}

	public List<Invoices> findByTotinvpatshare(Object totinvpatshare) {
		return findByProperty(TOTINVPATSHARE, totinvpatshare);
	}

	public List<Invoices> findByTotinvnetamt(Object totinvnetamt) {
		return findByProperty(TOTINVNETAMT, totinvnetamt);
	}

	/**
	 * Find all Invoices entities.
	 * 
	 * @return List<Invoices> all Invoices entities
	 */
	@SuppressWarnings("unchecked")
	public List<Invoices> findAll() {
		LogUtil.log("finding all Invoices instances", Level.INFO, null);
		try {
			final String queryString = "select model from Invoices model";
			Query query = entityManager.createQuery(queryString);
			return query.getResultList();
		} catch (RuntimeException re) {
			LogUtil.log("find all failed", Level.SEVERE, re);
			throw re;
		}
	}

}
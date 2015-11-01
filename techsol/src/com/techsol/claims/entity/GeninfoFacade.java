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
 * Facade for entity Geninfo.
 * 
 * @see .Geninfo
 * @author MyEclipse Persistence Tools
 */
@Stateless
public class GeninfoFacade {
	// property constants
	public static final String PAYERID = "payerid";
	public static final String TPAID = "tpaid";
	public static final String PROVCLAIMNO = "provclaimno";
	public static final String MEMBERID = "memberid";
	public static final String POLICYNO = "policyno";
	public static final String PLANTYPE = "plantype";
	public static final String FULLNAME = "fullname";
	public static final String FIRSTNAME = "firstname";
	public static final String MIDDLENAME = "middlename";
	public static final String LASTNAME = "lastname";
	public static final String PATFILENO = "patfileno";
	public static final String ACCCODE = "acccode";
	public static final String MEMBERAGE = "memberage";
	public static final String UNITAGE = "unitage";
	public static final String GENDER = "gender";
	public static final String NATIONALITY = "nationality";
	public static final String PHYID = "phyid";
	public static final String PHYNAME = "phyname";
	public static final String PHYCATEGORY = "phycategory";
	public static final String DEPTCODE = "deptcode";
	public static final String VISITTYPE = "visittype";
	public static final String CLAIMTYPE = "claimtype";
	public static final String MAINCLAIMREFNO = "mainclaimrefno";
	public static final String ELIGREFNO = "eligrefno";
	public static final String APPREFNO = "apprefno";
	public static final String LENGTHOFSTAY = "lengthofstay";
	public static final String UNITOFSTAY = "unitofstay";
	public static final String ROOMNO = "roomno";
	public static final String BEDNO = "bedno";
	public static final String MAINSYMPTOM = "mainsymptom";
	public static final String SIGNIFICANTSIGN = "significantsign";
	public static final String OTHERCOND = "othercond";
	public static final String DURATIONOFILLNESS = "durationofillness";
	public static final String UNITOFDURATION = "unitofduration";
	public static final String TEMPERATURE = "temperature";
	public static final String BLOODPRESSURE = "bloodpressure";
	public static final String PULSE = "pulse";
	public static final String RESPIRATORYRATE = "respiratoryrate";
	public static final String WEIGH = "weigh";
	public static final String TOTCLAIMGRSAMT = "totclaimgrsamt";
	public static final String TOTCLAIMDISC = "totclaimdisc";
	public static final String TOTCLAIMPATSHARE = "totclaimpatshare";
	public static final String TOTCLAIMNETAMT = "totclaimnetamt";
	public static final String RADIOREPORT = "radioreport";
	public static final String COMMREPORT = "commreport";

	@PersistenceContext
	private EntityManager entityManager;

	/**
	 * Perform an initial save of a previously unsaved Geninfo entity. All
	 * subsequent persist actions of this entity should use the #update()
	 * method.
	 * 
	 * @param entity
	 *            Geninfo entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(Geninfo entity) {
		LogUtil.log("saving Geninfo instance", Level.INFO, null);
		try {
			entityManager.persist(entity);
			LogUtil.log("save successful", Level.INFO, null);
		} catch (RuntimeException re) {
			LogUtil.log("save failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Delete a persistent Geninfo entity.
	 * 
	 * @param entity
	 *            Geninfo entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(Geninfo entity) {
		LogUtil.log("deleting Geninfo instance", Level.INFO, null);
		try {
			entity = entityManager.getReference(Geninfo.class,
					entity.getProviderid());
			entityManager.remove(entity);
			LogUtil.log("delete successful", Level.INFO, null);
		} catch (RuntimeException re) {
			LogUtil.log("delete failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Persist a previously saved Geninfo entity and return it or a copy of it
	 * to the sender. A copy of the Geninfo entity parameter is returned when
	 * the JPA persistence mechanism has not previously been tracking the
	 * updated entity.
	 * 
	 * @param entity
	 *            Geninfo entity to update
	 * @return Geninfo the persisted Geninfo entity instance, may not be the
	 *         same
	 * @throws RuntimeException
	 *             if the operation fails
	 */
	public Geninfo update(Geninfo entity) {
		LogUtil.log("updating Geninfo instance", Level.INFO, null);
		try {
			Geninfo result = entityManager.merge(entity);
			LogUtil.log("update successful", Level.INFO, null);
			return result;
		} catch (RuntimeException re) {
			LogUtil.log("update failed", Level.SEVERE, re);
			throw re;
		}
	}

	public Geninfo findById(String id) {
		LogUtil.log("finding Geninfo instance with id: " + id, Level.INFO, null);
		try {
			Geninfo instance = entityManager.find(Geninfo.class, id);
			return instance;
		} catch (RuntimeException re) {
			LogUtil.log("find failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Find all Geninfo entities with a specific property value.
	 * 
	 * @param propertyName
	 *            the name of the Geninfo property to query
	 * @param value
	 *            the property value to match
	 * @return List<Geninfo> found by query
	 */
	@SuppressWarnings("unchecked")
	public List<Geninfo> findByProperty(String propertyName, final Object value) {
		LogUtil.log("finding Geninfo instance with property: " + propertyName
				+ ", value: " + value, Level.INFO, null);
		try {
			final String queryString = "select model from Geninfo model where model."
					+ propertyName + "= :propertyValue";
			Query query = entityManager.createQuery(queryString);
			query.setParameter("propertyValue", value);
			return query.getResultList();
		} catch (RuntimeException re) {
			LogUtil.log("find by property name failed", Level.SEVERE, re);
			throw re;
		}
	}

	public List<Geninfo> findByPayerid(Object payerid) {
		return findByProperty(PAYERID, payerid);
	}

	public List<Geninfo> findByTpaid(Object tpaid) {
		return findByProperty(TPAID, tpaid);
	}

	public List<Geninfo> findByProvclaimno(Object provclaimno) {
		return findByProperty(PROVCLAIMNO, provclaimno);
	}

	public List<Geninfo> findByMemberid(Object memberid) {
		return findByProperty(MEMBERID, memberid);
	}

	public List<Geninfo> findByPolicyno(Object policyno) {
		return findByProperty(POLICYNO, policyno);
	}

	public List<Geninfo> findByPlantype(Object plantype) {
		return findByProperty(PLANTYPE, plantype);
	}

	public List<Geninfo> findByFullname(Object fullname) {
		return findByProperty(FULLNAME, fullname);
	}

	public List<Geninfo> findByFirstname(Object firstname) {
		return findByProperty(FIRSTNAME, firstname);
	}

	public List<Geninfo> findByMiddlename(Object middlename) {
		return findByProperty(MIDDLENAME, middlename);
	}

	public List<Geninfo> findByLastname(Object lastname) {
		return findByProperty(LASTNAME, lastname);
	}

	public List<Geninfo> findByPatfileno(Object patfileno) {
		return findByProperty(PATFILENO, patfileno);
	}

	public List<Geninfo> findByAcccode(Object acccode) {
		return findByProperty(ACCCODE, acccode);
	}

	public List<Geninfo> findByMemberage(Object memberage) {
		return findByProperty(MEMBERAGE, memberage);
	}

	public List<Geninfo> findByUnitage(Object unitage) {
		return findByProperty(UNITAGE, unitage);
	}

	public List<Geninfo> findByGender(Object gender) {
		return findByProperty(GENDER, gender);
	}

	public List<Geninfo> findByNationality(Object nationality) {
		return findByProperty(NATIONALITY, nationality);
	}

	public List<Geninfo> findByPhyid(Object phyid) {
		return findByProperty(PHYID, phyid);
	}

	public List<Geninfo> findByPhyname(Object phyname) {
		return findByProperty(PHYNAME, phyname);
	}

	public List<Geninfo> findByPhycategory(Object phycategory) {
		return findByProperty(PHYCATEGORY, phycategory);
	}

	public List<Geninfo> findByDeptcode(Object deptcode) {
		return findByProperty(DEPTCODE, deptcode);
	}

	public List<Geninfo> findByVisittype(Object visittype) {
		return findByProperty(VISITTYPE, visittype);
	}

	public List<Geninfo> findByClaimtype(Object claimtype) {
		return findByProperty(CLAIMTYPE, claimtype);
	}

	public List<Geninfo> findByMainclaimrefno(Object mainclaimrefno) {
		return findByProperty(MAINCLAIMREFNO, mainclaimrefno);
	}

	public List<Geninfo> findByEligrefno(Object eligrefno) {
		return findByProperty(ELIGREFNO, eligrefno);
	}

	public List<Geninfo> findByApprefno(Object apprefno) {
		return findByProperty(APPREFNO, apprefno);
	}

	public List<Geninfo> findByLengthofstay(Object lengthofstay) {
		return findByProperty(LENGTHOFSTAY, lengthofstay);
	}

	public List<Geninfo> findByUnitofstay(Object unitofstay) {
		return findByProperty(UNITOFSTAY, unitofstay);
	}

	public List<Geninfo> findByRoomno(Object roomno) {
		return findByProperty(ROOMNO, roomno);
	}

	public List<Geninfo> findByBedno(Object bedno) {
		return findByProperty(BEDNO, bedno);
	}

	public List<Geninfo> findByMainsymptom(Object mainsymptom) {
		return findByProperty(MAINSYMPTOM, mainsymptom);
	}

	public List<Geninfo> findBySignificantsign(Object significantsign) {
		return findByProperty(SIGNIFICANTSIGN, significantsign);
	}

	public List<Geninfo> findByOthercond(Object othercond) {
		return findByProperty(OTHERCOND, othercond);
	}

	public List<Geninfo> findByDurationofillness(Object durationofillness) {
		return findByProperty(DURATIONOFILLNESS, durationofillness);
	}

	public List<Geninfo> findByUnitofduration(Object unitofduration) {
		return findByProperty(UNITOFDURATION, unitofduration);
	}

	public List<Geninfo> findByTemperature(Object temperature) {
		return findByProperty(TEMPERATURE, temperature);
	}

	public List<Geninfo> findByBloodpressure(Object bloodpressure) {
		return findByProperty(BLOODPRESSURE, bloodpressure);
	}

	public List<Geninfo> findByPulse(Object pulse) {
		return findByProperty(PULSE, pulse);
	}

	public List<Geninfo> findByRespiratoryrate(Object respiratoryrate) {
		return findByProperty(RESPIRATORYRATE, respiratoryrate);
	}

	public List<Geninfo> findByWeigh(Object weigh) {
		return findByProperty(WEIGH, weigh);
	}

	public List<Geninfo> findByTotclaimgrsamt(Object totclaimgrsamt) {
		return findByProperty(TOTCLAIMGRSAMT, totclaimgrsamt);
	}

	public List<Geninfo> findByTotclaimdisc(Object totclaimdisc) {
		return findByProperty(TOTCLAIMDISC, totclaimdisc);
	}

	public List<Geninfo> findByTotclaimpatshare(Object totclaimpatshare) {
		return findByProperty(TOTCLAIMPATSHARE, totclaimpatshare);
	}

	public List<Geninfo> findByTotclaimnetamt(Object totclaimnetamt) {
		return findByProperty(TOTCLAIMNETAMT, totclaimnetamt);
	}

	public List<Geninfo> findByRadioreport(Object radioreport) {
		return findByProperty(RADIOREPORT, radioreport);
	}

	public List<Geninfo> findByCommreport(Object commreport) {
		return findByProperty(COMMREPORT, commreport);
	}

	/**
	 * Find all Geninfo entities.
	 * 
	 * @return List<Geninfo> all Geninfo entities
	 */
	@SuppressWarnings("unchecked")
	public List<Geninfo> findAll() {
		LogUtil.log("finding all Geninfo instances", Level.INFO, null);
		try {
			final String queryString = "select model from Geninfo model";
			Query query = entityManager.createQuery(queryString);
			return query.getResultList();
		} catch (RuntimeException re) {
			LogUtil.log("find all failed", Level.SEVERE, re);
			throw re;
		}
	}

}
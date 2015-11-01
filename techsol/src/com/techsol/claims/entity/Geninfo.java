package com.techsol.claims.entity;
// default package

import java.util.Date;

import javax.inject.Named;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Geninfo entity. @author MyEclipse Persistence Tools
 */
@Named
@Entity
@Table(name = "geninfo", catalog = "techsol")
public class Geninfo implements java.io.Serializable {

	// Fields

	private String providerid;
	private String payerid;
	private String tpaid;
	private String provclaimno;
	private String memberid;
	private String policyno;
	private String plantype;
	private String fullname;
	private String firstname;
	private String middlename;
	private String lastname;
	private String patfileno;
	private String acccode;
	private Date memberdob;
	private Integer memberage;
	private String unitage;
	private String gender;
	private String nationality;
	private String phyid;
	private String phyname;
	private String phycategory;
	private String deptcode;
	private String visittype;
	private Date claimdate;
	private String claimtype;
	private String mainclaimrefno;
	private String eligrefno;
	private String apprefno;
	private Date admissiondate;
	private Date admissiontime;
	private Date dischargedate;
	private Date dischargetime;
	private Integer lengthofstay;
	private String unitofstay;
	private String roomno;
	private String bedno;
	private String mainsymptom;
	private String significantsign;
	private String othercond;
	private Integer durationofillness;
	private String unitofduration;
	private Double temperature;
	private String bloodpressure;
	private Integer pulse;
	private Integer respiratoryrate;
	private Integer weigh;
	private Date lastmenstruationperiod;
	private Double totclaimgrsamt;
	private Double totclaimdisc;
	private Double totclaimpatshare;
	private Double totclaimnetamt;
	private String radioreport;
	private String commreport;
	private Date extractionDate;

	// Constructors

	/** default constructor */
	public Geninfo() {
	}

	/** minimal constructor */
	public Geninfo(String providerid, String provclaimno, String patfileno,
			String phyid, Date claimdate) {
		this.providerid = providerid;
		this.provclaimno = provclaimno;
		this.patfileno = patfileno;
		this.phyid = phyid;
		this.claimdate = claimdate;
	}

	/** full constructor */
	public Geninfo(String providerid, String payerid, String tpaid,
			String provclaimno, String memberid, String policyno,
			String plantype, String fullname, String firstname,
			String middlename, String lastname, String patfileno,
			String acccode, Date memberdob, Integer memberage, String unitage,
			String gender, String nationality, String phyid, String phyname,
			String phycategory, String deptcode, String visittype,
			Date claimdate, String claimtype, String mainclaimrefno,
			String eligrefno, String apprefno, Date admissiondate,
			Date admissiontime, Date dischargedate, Date dischargetime,
			Integer lengthofstay, String unitofstay, String roomno,
			String bedno, String mainsymptom, String significantsign,
			String othercond, Integer durationofillness, String unitofduration,
			Double temperature, String bloodpressure, Integer pulse,
			Integer respiratoryrate, Integer weigh,
			Date lastmenstruationperiod, Double totclaimgrsamt,
			Double totclaimdisc, Double totclaimpatshare,
			Double totclaimnetamt, String radioreport, String commreport,
			Date extractionDate) {
		this.providerid = providerid;
		this.payerid = payerid;
		this.tpaid = tpaid;
		this.provclaimno = provclaimno;
		this.memberid = memberid;
		this.policyno = policyno;
		this.plantype = plantype;
		this.fullname = fullname;
		this.firstname = firstname;
		this.middlename = middlename;
		this.lastname = lastname;
		this.patfileno = patfileno;
		this.acccode = acccode;
		this.memberdob = memberdob;
		this.memberage = memberage;
		this.unitage = unitage;
		this.gender = gender;
		this.nationality = nationality;
		this.phyid = phyid;
		this.phyname = phyname;
		this.phycategory = phycategory;
		this.deptcode = deptcode;
		this.visittype = visittype;
		this.claimdate = claimdate;
		this.claimtype = claimtype;
		this.mainclaimrefno = mainclaimrefno;
		this.eligrefno = eligrefno;
		this.apprefno = apprefno;
		this.admissiondate = admissiondate;
		this.admissiontime = admissiontime;
		this.dischargedate = dischargedate;
		this.dischargetime = dischargetime;
		this.lengthofstay = lengthofstay;
		this.unitofstay = unitofstay;
		this.roomno = roomno;
		this.bedno = bedno;
		this.mainsymptom = mainsymptom;
		this.significantsign = significantsign;
		this.othercond = othercond;
		this.durationofillness = durationofillness;
		this.unitofduration = unitofduration;
		this.temperature = temperature;
		this.bloodpressure = bloodpressure;
		this.pulse = pulse;
		this.respiratoryrate = respiratoryrate;
		this.weigh = weigh;
		this.lastmenstruationperiod = lastmenstruationperiod;
		this.totclaimgrsamt = totclaimgrsamt;
		this.totclaimdisc = totclaimdisc;
		this.totclaimpatshare = totclaimpatshare;
		this.totclaimnetamt = totclaimnetamt;
		this.radioreport = radioreport;
		this.commreport = commreport;
		this.extractionDate = extractionDate;
	}

	// Property accessors
	@Id
	@Column(name = "providerid", unique = true, nullable = false, length = 20)
	public String getProviderid() {
		return this.providerid;
	}

	public void setProviderid(String providerid) {
		this.providerid = providerid;
	}

	@Column(name = "PAYERID", length = 20)
	public String getPayerid() {
		return this.payerid;
	}

	public void setPayerid(String payerid) {
		this.payerid = payerid;
	}

	@Column(name = "TPAID", length = 30)
	public String getTpaid() {
		return this.tpaid;
	}

	public void setTpaid(String tpaid) {
		this.tpaid = tpaid;
	}

	@Column(name = "PROVCLAIMNO", nullable = false, length = 16)
	public String getProvclaimno() {
		return this.provclaimno;
	}

	public void setProvclaimno(String provclaimno) {
		this.provclaimno = provclaimno;
	}

	@Column(name = "MEMBERID", length = 30)
	public String getMemberid() {
		return this.memberid;
	}

	public void setMemberid(String memberid) {
		this.memberid = memberid;
	}

	@Column(name = "POLICYNO", length = 20)
	public String getPolicyno() {
		return this.policyno;
	}

	public void setPolicyno(String policyno) {
		this.policyno = policyno;
	}

	@Column(name = "PLANTYPE", length = 40)
	public String getPlantype() {
		return this.plantype;
	}

	public void setPlantype(String plantype) {
		this.plantype = plantype;
	}

	@Column(name = "FULLNAME", length = 100)
	public String getFullname() {
		return this.fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	@Column(name = "FIRSTNAME", length = 30)
	public String getFirstname() {
		return this.firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	@Column(name = "MIDDLENAME", length = 30)
	public String getMiddlename() {
		return this.middlename;
	}

	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}

	@Column(name = "LASTNAME", length = 30)
	public String getLastname() {
		return this.lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	@Column(name = "PATFILENO", nullable = false, length = 30)
	public String getPatfileno() {
		return this.patfileno;
	}

	public void setPatfileno(String patfileno) {
		this.patfileno = patfileno;
	}

	@Column(name = "ACCCODE", length = 200)
	public String getAcccode() {
		return this.acccode;
	}

	public void setAcccode(String acccode) {
		this.acccode = acccode;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "MEMBERDOB", length = 10)
	public Date getMemberdob() {
		return this.memberdob;
	}

	public void setMemberdob(Date memberdob) {
		this.memberdob = memberdob;
	}

	@Column(name = "MEMBERAGE")
	public Integer getMemberage() {
		return this.memberage;
	}

	public void setMemberage(Integer memberage) {
		this.memberage = memberage;
	}

	@Column(name = "UNITAGE", length = 20)
	public String getUnitage() {
		return this.unitage;
	}

	public void setUnitage(String unitage) {
		this.unitage = unitage;
	}

	@Column(name = "GENDER", length = 20)
	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Column(name = "NATIONALITY", length = 120)
	public String getNationality() {
		return this.nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	@Column(name = "PHYID", nullable = false, length = 30)
	public String getPhyid() {
		return this.phyid;
	}

	public void setPhyid(String phyid) {
		this.phyid = phyid;
	}

	@Column(name = "PHYNAME", length = 60)
	public String getPhyname() {
		return this.phyname;
	}

	public void setPhyname(String phyname) {
		this.phyname = phyname;
	}

	@Column(name = "PHYCATEGORY", length = 60)
	public String getPhycategory() {
		return this.phycategory;
	}

	public void setPhycategory(String phycategory) {
		this.phycategory = phycategory;
	}

	@Column(name = "DEPTCODE", length = 60)
	public String getDeptcode() {
		return this.deptcode;
	}

	public void setDeptcode(String deptcode) {
		this.deptcode = deptcode;
	}

	@Column(name = "VISITTYPE", length = 20)
	public String getVisittype() {
		return this.visittype;
	}

	public void setVisittype(String visittype) {
		this.visittype = visittype;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "CLAIMDATE", nullable = false, length = 10)
	public Date getClaimdate() {
		return this.claimdate;
	}

	public void setClaimdate(Date claimdate) {
		this.claimdate = claimdate;
	}

	@Column(name = "CLAIMTYPE", length = 20)
	public String getClaimtype() {
		return this.claimtype;
	}

	public void setClaimtype(String claimtype) {
		this.claimtype = claimtype;
	}

	@Column(name = "MAINCLAIMREFNO", length = 30)
	public String getMainclaimrefno() {
		return this.mainclaimrefno;
	}

	public void setMainclaimrefno(String mainclaimrefno) {
		this.mainclaimrefno = mainclaimrefno;
	}

	@Column(name = "ELIGREFNO", length = 20)
	public String getEligrefno() {
		return this.eligrefno;
	}

	public void setEligrefno(String eligrefno) {
		this.eligrefno = eligrefno;
	}

	@Column(name = "APPREFNO", length = 20)
	public String getApprefno() {
		return this.apprefno;
	}

	public void setApprefno(String apprefno) {
		this.apprefno = apprefno;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "ADMISSIONDATE", length = 10)
	public Date getAdmissiondate() {
		return this.admissiondate;
	}

	public void setAdmissiondate(Date admissiondate) {
		this.admissiondate = admissiondate;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "ADMISSIONTIME", length = 10)
	public Date getAdmissiontime() {
		return this.admissiontime;
	}

	public void setAdmissiontime(Date admissiontime) {
		this.admissiontime = admissiontime;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DISCHARGEDATE", length = 10)
	public Date getDischargedate() {
		return this.dischargedate;
	}

	public void setDischargedate(Date dischargedate) {
		this.dischargedate = dischargedate;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DISCHARGETIME", length = 10)
	public Date getDischargetime() {
		return this.dischargetime;
	}

	public void setDischargetime(Date dischargetime) {
		this.dischargetime = dischargetime;
	}

	@Column(name = "LENGTHOFSTAY")
	public Integer getLengthofstay() {
		return this.lengthofstay;
	}

	public void setLengthofstay(Integer lengthofstay) {
		this.lengthofstay = lengthofstay;
	}

	@Column(name = "UNITOFSTAY", length = 15)
	public String getUnitofstay() {
		return this.unitofstay;
	}

	public void setUnitofstay(String unitofstay) {
		this.unitofstay = unitofstay;
	}

	@Column(name = "ROOMNO", length = 15)
	public String getRoomno() {
		return this.roomno;
	}

	public void setRoomno(String roomno) {
		this.roomno = roomno;
	}

	@Column(name = "BEDNO", length = 10)
	public String getBedno() {
		return this.bedno;
	}

	public void setBedno(String bedno) {
		this.bedno = bedno;
	}

	@Column(name = "MAINSYMPTOM", length = 1000)
	public String getMainsymptom() {
		return this.mainsymptom;
	}

	public void setMainsymptom(String mainsymptom) {
		this.mainsymptom = mainsymptom;
	}

	@Column(name = "SIGNIFICANTSIGN", length = 200)
	public String getSignificantsign() {
		return this.significantsign;
	}

	public void setSignificantsign(String significantsign) {
		this.significantsign = significantsign;
	}

	@Column(name = "OTHERCOND", length = 1000)
	public String getOthercond() {
		return this.othercond;
	}

	public void setOthercond(String othercond) {
		this.othercond = othercond;
	}

	@Column(name = "DURATIONOFILLNESS")
	public Integer getDurationofillness() {
		return this.durationofillness;
	}

	public void setDurationofillness(Integer durationofillness) {
		this.durationofillness = durationofillness;
	}

	@Column(name = "UNITOFDURATION", length = 20)
	public String getUnitofduration() {
		return this.unitofduration;
	}

	public void setUnitofduration(String unitofduration) {
		this.unitofduration = unitofduration;
	}

	@Column(name = "TEMPERATURE", precision = 4, scale = 1)
	public Double getTemperature() {
		return this.temperature;
	}

	public void setTemperature(Double temperature) {
		this.temperature = temperature;
	}

	@Column(name = "BLOODPRESSURE", length = 10)
	public String getBloodpressure() {
		return this.bloodpressure;
	}

	public void setBloodpressure(String bloodpressure) {
		this.bloodpressure = bloodpressure;
	}

	@Column(name = "PULSE")
	public Integer getPulse() {
		return this.pulse;
	}

	public void setPulse(Integer pulse) {
		this.pulse = pulse;
	}

	@Column(name = "RESPIRATORYRATE")
	public Integer getRespiratoryrate() {
		return this.respiratoryrate;
	}

	public void setRespiratoryrate(Integer respiratoryrate) {
		this.respiratoryrate = respiratoryrate;
	}

	@Column(name = "WEIGH")
	public Integer getWeigh() {
		return this.weigh;
	}

	public void setWeigh(Integer weigh) {
		this.weigh = weigh;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "LASTMENSTRUATIONPERIOD", length = 10)
	public Date getLastmenstruationperiod() {
		return this.lastmenstruationperiod;
	}

	public void setLastmenstruationperiod(Date lastmenstruationperiod) {
		this.lastmenstruationperiod = lastmenstruationperiod;
	}

	@Column(name = "TOTCLAIMGRSAMT", precision = 14)
	public Double getTotclaimgrsamt() {
		return this.totclaimgrsamt;
	}

	public void setTotclaimgrsamt(Double totclaimgrsamt) {
		this.totclaimgrsamt = totclaimgrsamt;
	}

	@Column(name = "TOTCLAIMDISC", precision = 14)
	public Double getTotclaimdisc() {
		return this.totclaimdisc;
	}

	public void setTotclaimdisc(Double totclaimdisc) {
		this.totclaimdisc = totclaimdisc;
	}

	@Column(name = "TOTCLAIMPATSHARE", precision = 14)
	public Double getTotclaimpatshare() {
		return this.totclaimpatshare;
	}

	public void setTotclaimpatshare(Double totclaimpatshare) {
		this.totclaimpatshare = totclaimpatshare;
	}

	@Column(name = "TOTCLAIMNETAMT", precision = 14)
	public Double getTotclaimnetamt() {
		return this.totclaimnetamt;
	}

	public void setTotclaimnetamt(Double totclaimnetamt) {
		this.totclaimnetamt = totclaimnetamt;
	}

	@Column(name = "RADIOREPORT")
	public String getRadioreport() {
		return this.radioreport;
	}

	public void setRadioreport(String radioreport) {
		this.radioreport = radioreport;
	}

	@Column(name = "COMMREPORT")
	public String getCommreport() {
		return this.commreport;
	}

	public void setCommreport(String commreport) {
		this.commreport = commreport;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "EXTRACTION_DATE", length = 10)
	public Date getExtractionDate() {
		return this.extractionDate;
	}

	public void setExtractionDate(Date extractionDate) {
		this.extractionDate = extractionDate;
	}

}
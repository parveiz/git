package com.techsol.claims.entity;
// default package

import java.util.Date;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * ServiceOptical entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "service_optical", catalog = "techsol")
public class ServiceOptical implements java.io.Serializable {

	// Fields

	private ServiceOpticalId id;
	private String lensestype;
	private Date servicedate;
	private String reglensestype;
	private String conlensestype;
	private Integer noofpairs;
	private Double lensesgrsamt;
	private Double lensesdisc;
	private Double lensespatshare;
	private Double lensesnetamt;
	private Double framegrsamt;
	private Double framedisc;
	private Double framepatshare;
	private Double framenetamt;

	// Constructors

	/** default constructor */
	public ServiceOptical() {
	}

	/** minimal constructor */
	public ServiceOptical(ServiceOpticalId id, String lensestype,
			Date servicedate) {
		this.id = id;
		this.lensestype = lensestype;
		this.servicedate = servicedate;
	}

	/** full constructor */
	public ServiceOptical(ServiceOpticalId id, String lensestype,
			Date servicedate, String reglensestype, String conlensestype,
			Integer noofpairs, Double lensesgrsamt, Double lensesdisc,
			Double lensespatshare, Double lensesnetamt, Double framegrsamt,
			Double framedisc, Double framepatshare, Double framenetamt) {
		this.id = id;
		this.lensestype = lensestype;
		this.servicedate = servicedate;
		this.reglensestype = reglensestype;
		this.conlensestype = conlensestype;
		this.noofpairs = noofpairs;
		this.lensesgrsamt = lensesgrsamt;
		this.lensesdisc = lensesdisc;
		this.lensespatshare = lensespatshare;
		this.lensesnetamt = lensesnetamt;
		this.framegrsamt = framegrsamt;
		this.framedisc = framedisc;
		this.framepatshare = framepatshare;
		this.framenetamt = framenetamt;
	}

	// Property accessors
	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "invoiceno", column = @Column(name = "INVOICENO", nullable = false, length = 20)),
			@AttributeOverride(name = "servicetype", column = @Column(name = "SERVICETYPE", nullable = false, length = 20)) })
	public ServiceOpticalId getId() {
		return this.id;
	}

	public void setId(ServiceOpticalId id) {
		this.id = id;
	}

	@Column(name = "LENSESTYPE", nullable = false, length = 25)
	public String getLensestype() {
		return this.lensestype;
	}

	public void setLensestype(String lensestype) {
		this.lensestype = lensestype;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "SERVICEDATE", nullable = false, length = 10)
	public Date getServicedate() {
		return this.servicedate;
	}

	public void setServicedate(Date servicedate) {
		this.servicedate = servicedate;
	}

	@Column(name = "REGLENSESTYPE", length = 20)
	public String getReglensestype() {
		return this.reglensestype;
	}

	public void setReglensestype(String reglensestype) {
		this.reglensestype = reglensestype;
	}

	@Column(name = "CONLENSESTYPE", length = 20)
	public String getConlensestype() {
		return this.conlensestype;
	}

	public void setConlensestype(String conlensestype) {
		this.conlensestype = conlensestype;
	}

	@Column(name = "NOOFPAIRS")
	public Integer getNoofpairs() {
		return this.noofpairs;
	}

	public void setNoofpairs(Integer noofpairs) {
		this.noofpairs = noofpairs;
	}

	@Column(name = "LENSESGRSAMT", precision = 14)
	public Double getLensesgrsamt() {
		return this.lensesgrsamt;
	}

	public void setLensesgrsamt(Double lensesgrsamt) {
		this.lensesgrsamt = lensesgrsamt;
	}

	@Column(name = "LENSESDISC", precision = 14)
	public Double getLensesdisc() {
		return this.lensesdisc;
	}

	public void setLensesdisc(Double lensesdisc) {
		this.lensesdisc = lensesdisc;
	}

	@Column(name = "LENSESPATSHARE", precision = 14)
	public Double getLensespatshare() {
		return this.lensespatshare;
	}

	public void setLensespatshare(Double lensespatshare) {
		this.lensespatshare = lensespatshare;
	}

	@Column(name = "LENSESNETAMT", precision = 14)
	public Double getLensesnetamt() {
		return this.lensesnetamt;
	}

	public void setLensesnetamt(Double lensesnetamt) {
		this.lensesnetamt = lensesnetamt;
	}

	@Column(name = "FRAMEGRSAMT", precision = 14)
	public Double getFramegrsamt() {
		return this.framegrsamt;
	}

	public void setFramegrsamt(Double framegrsamt) {
		this.framegrsamt = framegrsamt;
	}

	@Column(name = "FRAMEDISC", precision = 14)
	public Double getFramedisc() {
		return this.framedisc;
	}

	public void setFramedisc(Double framedisc) {
		this.framedisc = framedisc;
	}

	@Column(name = "FRAMEPATSHARE", precision = 14)
	public Double getFramepatshare() {
		return this.framepatshare;
	}

	public void setFramepatshare(Double framepatshare) {
		this.framepatshare = framepatshare;
	}

	@Column(name = "FRAMENETAMT", precision = 14)
	public Double getFramenetamt() {
		return this.framenetamt;
	}

	public void setFramenetamt(Double framenetamt) {
		this.framenetamt = framenetamt;
	}

}
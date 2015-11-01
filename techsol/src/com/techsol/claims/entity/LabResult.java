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
 * LabResult entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "lab_result", catalog = "techsol")
public class LabResult implements java.io.Serializable {

	// Fields

	private LabResultId id;
	private Date labtestdate;
	private String labdesc;

	// Constructors

	/** default constructor */
	public LabResult() {
	}

	/** minimal constructor */
	public LabResult(LabResultId id, Date labtestdate) {
		this.id = id;
		this.labtestdate = labtestdate;
	}

	/** full constructor */
	public LabResult(LabResultId id, Date labtestdate, String labdesc) {
		this.id = id;
		this.labtestdate = labtestdate;
		this.labdesc = labdesc;
	}

	// Property accessors
	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "provclaimno", column = @Column(name = "PROVCLAIMNO", nullable = false, length = 16)),
			@AttributeOverride(name = "labtestcode", column = @Column(name = "LABTESTCODE", nullable = false, length = 15)),
			@AttributeOverride(name = "serial", column = @Column(name = "SERIAL", nullable = false)) })
	public LabResultId getId() {
		return this.id;
	}

	public void setId(LabResultId id) {
		this.id = id;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "LABTESTDATE", nullable = false, length = 10)
	public Date getLabtestdate() {
		return this.labtestdate;
	}

	public void setLabtestdate(Date labtestdate) {
		this.labtestdate = labtestdate;
	}

	@Column(name = "LABDESC")
	public String getLabdesc() {
		return this.labdesc;
	}

	public void setLabdesc(String labdesc) {
		this.labdesc = labdesc;
	}

}
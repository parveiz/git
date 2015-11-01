package com.techsol.claims.entity;
// default package

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * LabComponent entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "lab_component", catalog = "techsol")
public class LabComponent implements java.io.Serializable {

	// Fields

	private LabComponentId id;
	private String labcompdesc;
	private String labresult;
	private String labresultunit;
	private String labresultcomment;

	// Constructors

	/** default constructor */
	public LabComponent() {
	}

	/** minimal constructor */
	public LabComponent(LabComponentId id) {
		this.id = id;
	}

	/** full constructor */
	public LabComponent(LabComponentId id, String labcompdesc,
			String labresult, String labresultunit, String labresultcomment) {
		this.id = id;
		this.labcompdesc = labcompdesc;
		this.labresult = labresult;
		this.labresultunit = labresultunit;
		this.labresultcomment = labresultcomment;
	}

	// Property accessors
	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "labtestcode", column = @Column(name = "LABTESTCODE", nullable = false, length = 15)),
			@AttributeOverride(name = "provclaimno", column = @Column(name = "PROVCLAIMNO", nullable = false, length = 16)),
			@AttributeOverride(name = "serial", column = @Column(name = "SERIAL", nullable = false)),
			@AttributeOverride(name = "labcompcode", column = @Column(name = "LABCOMPCODE", nullable = false, length = 15)) })
	public LabComponentId getId() {
		return this.id;
	}

	public void setId(LabComponentId id) {
		this.id = id;
	}

	@Column(name = "LABCOMPDESC", length = 256)
	public String getLabcompdesc() {
		return this.labcompdesc;
	}

	public void setLabcompdesc(String labcompdesc) {
		this.labcompdesc = labcompdesc;
	}

	@Column(name = "LABRESULT", length = 15)
	public String getLabresult() {
		return this.labresult;
	}

	public void setLabresult(String labresult) {
		this.labresult = labresult;
	}

	@Column(name = "LABRESULTUNIT", length = 15)
	public String getLabresultunit() {
		return this.labresultunit;
	}

	public void setLabresultunit(String labresultunit) {
		this.labresultunit = labresultunit;
	}

	@Column(name = "LABRESULTCOMMENT", length = 128)
	public String getLabresultcomment() {
		return this.labresultcomment;
	}

	public void setLabresultcomment(String labresultcomment) {
		this.labresultcomment = labresultcomment;
	}

}
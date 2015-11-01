package com.techsol.claims.entity;
// default package

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * OpticalDiagnosis entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "optical_diagnosis", catalog = "techsol")
public class OpticalDiagnosis implements java.io.Serializable {

	// Fields

	private String provclaimno;
	private String righteyespheredist;
	private String righteyecyldist;
	private String righteyespherenear;
	private String righteyecylnear;
	private String lefteyespheredist;
	private String lefteyecyldist;
	private String lefteyespherenear;
	private String lefteyecylnear;

	// Constructors

	/** default constructor */
	public OpticalDiagnosis() {
	}

	/** minimal constructor */
	public OpticalDiagnosis(String provclaimno) {
		this.provclaimno = provclaimno;
	}

	/** full constructor */
	public OpticalDiagnosis(String provclaimno, String righteyespheredist,
			String righteyecyldist, String righteyespherenear,
			String righteyecylnear, String lefteyespheredist,
			String lefteyecyldist, String lefteyespherenear,
			String lefteyecylnear) {
		this.provclaimno = provclaimno;
		this.righteyespheredist = righteyespheredist;
		this.righteyecyldist = righteyecyldist;
		this.righteyespherenear = righteyespherenear;
		this.righteyecylnear = righteyecylnear;
		this.lefteyespheredist = lefteyespheredist;
		this.lefteyecyldist = lefteyecyldist;
		this.lefteyespherenear = lefteyespherenear;
		this.lefteyecylnear = lefteyecylnear;
	}

	// Property accessors
	@Id
	@Column(name = "PROVCLAIMNO", unique = true, nullable = false, length = 16)
	public String getProvclaimno() {
		return this.provclaimno;
	}

	public void setProvclaimno(String provclaimno) {
		this.provclaimno = provclaimno;
	}

	@Column(name = "RIGHTEYESPHEREDIST", length = 7)
	public String getRighteyespheredist() {
		return this.righteyespheredist;
	}

	public void setRighteyespheredist(String righteyespheredist) {
		this.righteyespheredist = righteyespheredist;
	}

	@Column(name = "RIGHTEYECYLDIST", length = 7)
	public String getRighteyecyldist() {
		return this.righteyecyldist;
	}

	public void setRighteyecyldist(String righteyecyldist) {
		this.righteyecyldist = righteyecyldist;
	}

	@Column(name = "RIGHTEYESPHERENEAR", length = 7)
	public String getRighteyespherenear() {
		return this.righteyespherenear;
	}

	public void setRighteyespherenear(String righteyespherenear) {
		this.righteyespherenear = righteyespherenear;
	}

	@Column(name = "RIGHTEYECYLNEAR", length = 7)
	public String getRighteyecylnear() {
		return this.righteyecylnear;
	}

	public void setRighteyecylnear(String righteyecylnear) {
		this.righteyecylnear = righteyecylnear;
	}

	@Column(name = "LEFTEYESPHEREDIST", length = 7)
	public String getLefteyespheredist() {
		return this.lefteyespheredist;
	}

	public void setLefteyespheredist(String lefteyespheredist) {
		this.lefteyespheredist = lefteyespheredist;
	}

	@Column(name = "LEFTEYECYLDIST", length = 7)
	public String getLefteyecyldist() {
		return this.lefteyecyldist;
	}

	public void setLefteyecyldist(String lefteyecyldist) {
		this.lefteyecyldist = lefteyecyldist;
	}

	@Column(name = "LEFTEYESPHERENEAR", length = 7)
	public String getLefteyespherenear() {
		return this.lefteyespherenear;
	}

	public void setLefteyespherenear(String lefteyespherenear) {
		this.lefteyespherenear = lefteyespherenear;
	}

	@Column(name = "LEFTEYECYLNEAR", length = 7)
	public String getLefteyecylnear() {
		return this.lefteyecylnear;
	}

	public void setLefteyecylnear(String lefteyecylnear) {
		this.lefteyecylnear = lefteyecylnear;
	}

}
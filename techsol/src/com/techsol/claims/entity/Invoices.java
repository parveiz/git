package com.techsol.claims.entity;

import java.util.Date;

import javax.inject.Named;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Named
@Entity
@Table(name = "invoices", catalog = "techsol")
public class Invoices implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	private String invoiceno;
	private String provclaimno;
	private Date invoicedate;
	private String invoicedept;
	private Double totinvgrsamt;
	private Double totinvdisc;
	private Double totinvpatshare;
	private Double totinvnetamt;


	/** default constructor */
	public Invoices() {
	}

	/** minimal constructor */
	public Invoices(String invoiceno) {
		this.invoiceno = invoiceno;
	}

	/** full constructor */
	public Invoices(String invoiceno, String provclaimno, Date invoicedate,
			String invoicedept, Double totinvgrsamt, Double totinvdisc,
			Double totinvpatshare, Double totinvnetamt) {
		this.invoiceno = invoiceno;
		this.provclaimno = provclaimno;
		this.invoicedate = invoicedate;
		this.invoicedept = invoicedept;
		this.totinvgrsamt = totinvgrsamt;
		this.totinvdisc = totinvdisc;
		this.totinvpatshare = totinvpatshare;
		this.totinvnetamt = totinvnetamt;
	}

	// Property accessors
	@Id
	@Column(name = "INVOICENO", unique = true, nullable = false, length = 20)
	public String getInvoiceno() {
		return this.invoiceno;
	}

	public void setInvoiceno(String invoiceno) {
		this.invoiceno = invoiceno;
	}

	@Column(name = "PROVCLAIMNO", length = 16)
	public String getProvclaimno() {
		return this.provclaimno;
	}

	public void setProvclaimno(String provclaimno) {
		this.provclaimno = provclaimno;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "INVOICEDATE", length = 10)
	public Date getInvoicedate() {
		return this.invoicedate;
	}

	public void setInvoicedate(Date invoicedate) {
		this.invoicedate = invoicedate;
	}

	@Column(name = "INVOICEDEPT", length = 20)
	public String getInvoicedept() {
		return this.invoicedept;
	}

	public void setInvoicedept(String invoicedept) {
		this.invoicedept = invoicedept;
	}

	@Column(name = "TOTINVGRSAMT", precision = 14)
	public Double getTotinvgrsamt() {
		return this.totinvgrsamt;
	}

	public void setTotinvgrsamt(Double totinvgrsamt) {
		this.totinvgrsamt = totinvgrsamt;
	}

	@Column(name = "TOTINVDISC", precision = 14)
	public Double getTotinvdisc() {
		return this.totinvdisc;
	}

	public void setTotinvdisc(Double totinvdisc) {
		this.totinvdisc = totinvdisc;
	}

	@Column(name = "TOTINVPATSHARE", precision = 14)
	public Double getTotinvpatshare() {
		return this.totinvpatshare;
	}

	public void setTotinvpatshare(Double totinvpatshare) {
		this.totinvpatshare = totinvpatshare;
	}

	@Column(name = "TOTINVNETAMT", precision = 14)
	public Double getTotinvnetamt() {
		return this.totinvnetamt;
	}

	public void setTotinvnetamt(Double totinvnetamt) {
		this.totinvnetamt = totinvnetamt;
	}

}
package com.techsol.claims.entity;
// default package

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * ServiceDetailsId entity. @author MyEclipse Persistence Tools
 */
@Embeddable
public class ServiceDetailsId implements java.io.Serializable {

	// Fields

	private String invoiceno;
	private String servicecode;
	private Date servicedate;
	private String servicedesc;
	private Double unitserviceprice;
	private String unitservicetype;
	private Integer qty;
	private String toothno;
	private Double totservicegrsamt;
	private Double totservicedisc;
	private Double totservicepatshare;
	private Double totservicenetamt;

	// Constructors

	/** default constructor */
	public ServiceDetailsId() {
	}

	/** minimal constructor */
	public ServiceDetailsId(String invoiceno, String servicecode) {
		this.invoiceno = invoiceno;
		this.servicecode = servicecode;
	}

	/** full constructor */
	public ServiceDetailsId(String invoiceno, String servicecode,
			Date servicedate, String servicedesc, Double unitserviceprice,
			String unitservicetype, Integer qty, String toothno,
			Double totservicegrsamt, Double totservicedisc,
			Double totservicepatshare, Double totservicenetamt) {
		this.invoiceno = invoiceno;
		this.servicecode = servicecode;
		this.servicedate = servicedate;
		this.servicedesc = servicedesc;
		this.unitserviceprice = unitserviceprice;
		this.unitservicetype = unitservicetype;
		this.qty = qty;
		this.toothno = toothno;
		this.totservicegrsamt = totservicegrsamt;
		this.totservicedisc = totservicedisc;
		this.totservicepatshare = totservicepatshare;
		this.totservicenetamt = totservicenetamt;
	}

	// Property accessors

	@Column(name = "INVOICENO", nullable = false, length = 20)
	public String getInvoiceno() {
		return this.invoiceno;
	}

	public void setInvoiceno(String invoiceno) {
		this.invoiceno = invoiceno;
	}

	@Column(name = "SERVICECODE", nullable = false, length = 20)
	public String getServicecode() {
		return this.servicecode;
	}

	public void setServicecode(String servicecode) {
		this.servicecode = servicecode;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "SERVICEDATE", length = 10)
	public Date getServicedate() {
		return this.servicedate;
	}

	public void setServicedate(Date servicedate) {
		this.servicedate = servicedate;
	}

	@Column(name = "SERVICEDESC", length = 80)
	public String getServicedesc() {
		return this.servicedesc;
	}

	public void setServicedesc(String servicedesc) {
		this.servicedesc = servicedesc;
	}

	@Column(name = "UNITSERVICEPRICE", precision = 14)
	public Double getUnitserviceprice() {
		return this.unitserviceprice;
	}

	public void setUnitserviceprice(Double unitserviceprice) {
		this.unitserviceprice = unitserviceprice;
	}

	@Column(name = "UNITSERVICETYPE", length = 40)
	public String getUnitservicetype() {
		return this.unitservicetype;
	}

	public void setUnitservicetype(String unitservicetype) {
		this.unitservicetype = unitservicetype;
	}

	@Column(name = "QTY")
	public Integer getQty() {
		return this.qty;
	}

	public void setQty(Integer qty) {
		this.qty = qty;
	}

	@Column(name = "TOOTHNO", length = 10)
	public String getToothno() {
		return this.toothno;
	}

	public void setToothno(String toothno) {
		this.toothno = toothno;
	}

	@Column(name = "TOTSERVICEGRSAMT", precision = 14)
	public Double getTotservicegrsamt() {
		return this.totservicegrsamt;
	}

	public void setTotservicegrsamt(Double totservicegrsamt) {
		this.totservicegrsamt = totservicegrsamt;
	}

	@Column(name = "TOTSERVICEDISC", precision = 14)
	public Double getTotservicedisc() {
		return this.totservicedisc;
	}

	public void setTotservicedisc(Double totservicedisc) {
		this.totservicedisc = totservicedisc;
	}

	@Column(name = "TOTSERVICEPATSHARE", precision = 14)
	public Double getTotservicepatshare() {
		return this.totservicepatshare;
	}

	public void setTotservicepatshare(Double totservicepatshare) {
		this.totservicepatshare = totservicepatshare;
	}

	@Column(name = "TOTSERVICENETAMT", precision = 14)
	public Double getTotservicenetamt() {
		return this.totservicenetamt;
	}

	public void setTotservicenetamt(Double totservicenetamt) {
		this.totservicenetamt = totservicenetamt;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ServiceDetailsId))
			return false;
		ServiceDetailsId castOther = (ServiceDetailsId) other;

		return ((this.getInvoiceno() == castOther.getInvoiceno()) || (this
				.getInvoiceno() != null && castOther.getInvoiceno() != null && this
				.getInvoiceno().equals(castOther.getInvoiceno())))
				&& ((this.getServicecode() == castOther.getServicecode()) || (this
						.getServicecode() != null
						&& castOther.getServicecode() != null && this
						.getServicecode().equals(castOther.getServicecode())))
				&& ((this.getServicedate() == castOther.getServicedate()) || (this
						.getServicedate() != null
						&& castOther.getServicedate() != null && this
						.getServicedate().equals(castOther.getServicedate())))
				&& ((this.getServicedesc() == castOther.getServicedesc()) || (this
						.getServicedesc() != null
						&& castOther.getServicedesc() != null && this
						.getServicedesc().equals(castOther.getServicedesc())))
				&& ((this.getUnitserviceprice() == castOther
						.getUnitserviceprice()) || (this.getUnitserviceprice() != null
						&& castOther.getUnitserviceprice() != null && this
						.getUnitserviceprice().equals(
								castOther.getUnitserviceprice())))
				&& ((this.getUnitservicetype() == castOther
						.getUnitservicetype()) || (this.getUnitservicetype() != null
						&& castOther.getUnitservicetype() != null && this
						.getUnitservicetype().equals(
								castOther.getUnitservicetype())))
				&& ((this.getQty() == castOther.getQty()) || (this.getQty() != null
						&& castOther.getQty() != null && this.getQty().equals(
						castOther.getQty())))
				&& ((this.getToothno() == castOther.getToothno()) || (this
						.getToothno() != null && castOther.getToothno() != null && this
						.getToothno().equals(castOther.getToothno())))
				&& ((this.getTotservicegrsamt() == castOther
						.getTotservicegrsamt()) || (this.getTotservicegrsamt() != null
						&& castOther.getTotservicegrsamt() != null && this
						.getTotservicegrsamt().equals(
								castOther.getTotservicegrsamt())))
				&& ((this.getTotservicedisc() == castOther.getTotservicedisc()) || (this
						.getTotservicedisc() != null
						&& castOther.getTotservicedisc() != null && this
						.getTotservicedisc().equals(
								castOther.getTotservicedisc())))
				&& ((this.getTotservicepatshare() == castOther
						.getTotservicepatshare()) || (this
						.getTotservicepatshare() != null
						&& castOther.getTotservicepatshare() != null && this
						.getTotservicepatshare().equals(
								castOther.getTotservicepatshare())))
				&& ((this.getTotservicenetamt() == castOther
						.getTotservicenetamt()) || (this.getTotservicenetamt() != null
						&& castOther.getTotservicenetamt() != null && this
						.getTotservicenetamt().equals(
								castOther.getTotservicenetamt())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getInvoiceno() == null ? 0 : this.getInvoiceno().hashCode());
		result = 37
				* result
				+ (getServicecode() == null ? 0 : this.getServicecode()
						.hashCode());
		result = 37
				* result
				+ (getServicedate() == null ? 0 : this.getServicedate()
						.hashCode());
		result = 37
				* result
				+ (getServicedesc() == null ? 0 : this.getServicedesc()
						.hashCode());
		result = 37
				* result
				+ (getUnitserviceprice() == null ? 0 : this
						.getUnitserviceprice().hashCode());
		result = 37
				* result
				+ (getUnitservicetype() == null ? 0 : this.getUnitservicetype()
						.hashCode());
		result = 37 * result
				+ (getQty() == null ? 0 : this.getQty().hashCode());
		result = 37 * result
				+ (getToothno() == null ? 0 : this.getToothno().hashCode());
		result = 37
				* result
				+ (getTotservicegrsamt() == null ? 0 : this
						.getTotservicegrsamt().hashCode());
		result = 37
				* result
				+ (getTotservicedisc() == null ? 0 : this.getTotservicedisc()
						.hashCode());
		result = 37
				* result
				+ (getTotservicepatshare() == null ? 0 : this
						.getTotservicepatshare().hashCode());
		result = 37
				* result
				+ (getTotservicenetamt() == null ? 0 : this
						.getTotservicenetamt().hashCode());
		return result;
	}

}
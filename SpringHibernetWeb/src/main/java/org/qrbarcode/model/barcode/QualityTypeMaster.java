/**
 * 
 */
package org.qrbarcode.model.barcode;

import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;

/**
 * @author harikrishna.trivedi
 *
 */

@Entity @Table(name="QUALITY_TYPE_MST")
public class QualityTypeMaster{

	@Column(name = "SL_NO", nullable = false)
	private Integer slNo;

	@Id
	@Size(max = 15)
	@Column(name = "QTY_TYPE_CODE", nullable = false)
	private String qtyTypeCode;

	@Size(max = 100)
	@Column(name = "QTY_TYPE_NAME", nullable = false)
	private String qtyTypeName;

	@Size(max = 15)
	@Column(name = "QTY_TYPE_USER_CODE", nullable = false)
	private String qtyTypeUserCode;

	@Size(max = 1)
	@Column(name = "QTY_TYPE_STATUS", nullable = false)
	private String qtyTypeStatus;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "QTY_TYPE_DATE", nullable = true)
	private Date qtyTypeDate;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "QTY_TYPE_LAST_UPDATED_DATE", nullable = true)
	private Date qtyTypeLastUpdatedDate;
	
	@OneToMany(mappedBy="QUALITY_TEST")
	private Set<QualityTest> lstObjQualityTest;
	
	
	
	/**
	 * @return the slNo
	 */
	public Integer getSlNo() {
		return slNo;
	}



	/**
	 * @param slNo the slNo to set
	 */
	public void setSlNo(Integer slNo) {
		this.slNo = slNo;
	}



	/**
	 * @return the qtyTypeCode
	 */
	public String getQtyTypeCode() {
		return qtyTypeCode;
	}



	/**
	 * @param qtyTypeCode the qtyTypeCode to set
	 */
	public void setQtyTypeCode(String qtyTypeCode) {
		this.qtyTypeCode = qtyTypeCode;
	}



	/**
	 * @return the qtyTypeName
	 */
	public String getQtyTypeName() {
		return qtyTypeName;
	}



	/**
	 * @param qtyTypeName the qtyTypeName to set
	 */
	public void setQtyTypeName(String qtyTypeName) {
		this.qtyTypeName = qtyTypeName;
	}



	/**
	 * @return the qtyTypeUserCode
	 */
	public String getQtyTypeUserCode() {
		return qtyTypeUserCode;
	}



	/**
	 * @param qtyTypeUserCode the qtyTypeUserCode to set
	 */
	public void setQtyTypeUserCode(String qtyTypeUserCode) {
		this.qtyTypeUserCode = qtyTypeUserCode;
	}



	/**
	 * @return the qtyTypeStatus
	 */
	public String getQtyTypeStatus() {
		return qtyTypeStatus;
	}



	/**
	 * @param qtyTypeStatus the qtyTypeStatus to set
	 */
	public void setQtyTypeStatus(String qtyTypeStatus) {
		this.qtyTypeStatus = qtyTypeStatus;
	}



	/**
	 * @return the qtyTypeDate
	 */
	public Date getQtyTypeDate() {
		return qtyTypeDate;
	}



	/**
	 * @param qtyTypeDate the qtyTypeDate to set
	 */
	public void setQtyTypeDate(Date qtyTypeDate) {
		this.qtyTypeDate = qtyTypeDate;
	}



	/**
	 * @return the qtyTypeLastUpdatedDate
	 */
	public Date getQtyTypeLastUpdatedDate() {
		return qtyTypeLastUpdatedDate;
	}



	/**
	 * @param qtyTypeLastUpdatedDate the qtyTypeLastUpdatedDate to set
	 */
	public void setQtyTypeLastUpdatedDate(Date qtyTypeLastUpdatedDate) {
		this.qtyTypeLastUpdatedDate = qtyTypeLastUpdatedDate;
	}



	/**
	 * @return the lstObjQualityTest
	 */
	public Set<QualityTest> getLstObjQualityTest() {
		return lstObjQualityTest;
	}



	/**
	 * @param lstObjQualityTest the lstObjQualityTest to set
	 */
	public void setLstObjQualityTest(Set<QualityTest> lstObjQualityTest) {
		this.lstObjQualityTest = lstObjQualityTest;
	}



	@Override
	public String toString() {
		return "qualityTestMaster [slNo=" + slNo 
				+ ", qtyTypeCode=" + qtyTypeCode 
				+ ", qtyTypeName=" + qtyTypeName 
				+ ", qtyTypeUserCode=" + qtyTypeUserCode
				+ ", qtyTypeStatus=" + qtyTypeStatus 
				+ ", qtyTypeDate=" + qtyTypeDate 
				+ ", qtyTypeLastUpdatedDate=" + qtyTypeLastUpdatedDate
				+ "]";
	}
}
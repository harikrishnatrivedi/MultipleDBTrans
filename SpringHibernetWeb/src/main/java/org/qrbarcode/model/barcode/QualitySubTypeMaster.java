/**
 * 
 */
package org.qrbarcode.model.barcode;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;

/**
 * @author harikrishna.trivedi
 *
 */

@Entity @Table(name="QUALITY_SUB_TYPE_MST")
public class QualitySubTypeMaster {

	@Column(name = "SL_NO", nullable = false)
	private Integer slNo;

	@Id
	@Size(max = 15)
    @Column(name = "QTY_SUB_TYPE_CODE", nullable = false)
	private String qtySubTypeCode;

	@Size(max = 50)
	@Column(name = "QTY_SUB_TYPE_NAME", nullable = false)
	private String qtySubTypeName;

	@Size(max = 15)
	@ManyToOne
	@JoinColumn(name = "QTY_TYPE_CODE", referencedColumnName="QTY_TYPE_CODE")
	private QualityTypeMaster objQualityTypeMaster;

	@Size(max = 50)
	@Column(name = "QTY_TYPE_NAME", nullable = true)
	private String qtyTypeName;

	@Size(max = 50)
	@Column(name = "QTY_SUB_TYPE_USER_CODE", nullable = false)
	private String qtySubTypeUserCode;

	@Size(max = 1)
	@Column(name = "QTY_SUB_TYPE_STATUS", nullable = false)
	private String qtySubTypeStatus;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "QTY_SUB_TYPE_DATE", nullable = true)
	private Date qtySubTypeDate;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "QTY_SUB_TYPE_LAST_UPDATED_DATE", nullable = true)
	private Date qtySubTypeLastUpdatedDate;

	@OneToMany(mappedBy="objQtySubTypeMaster")
	private List<QualityTest> lstObjQualityTest;
	
	
	
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
	 * @return the qtySubTypeCode
	 */
	public String getQtySubTypeCode() {
		return qtySubTypeCode;
	}



	/**
	 * @param qtySubTypeCode the qtySubTypeCode to set
	 */
	public void setQtySubTypeCode(String qtySubTypeCode) {
		this.qtySubTypeCode = qtySubTypeCode;
	}



	/**
	 * @return the qtySubTypeName
	 */
	public String getQtySubTypeName() {
		return qtySubTypeName;
	}



	/**
	 * @param qtySubTypeName the qtySubTypeName to set
	 */
	public void setQtySubTypeName(String qtySubTypeName) {
		this.qtySubTypeName = qtySubTypeName;
	}



	/**
	 * @return the objQualityTypeMaster
	 */
	public QualityTypeMaster getObjQualityTypeMaster() {
		return objQualityTypeMaster;
	}



	/**
	 * @param objQualityTypeMaster the objQualityTypeMaster to set
	 */
	public void setObjQualityTypeMaster(QualityTypeMaster objQualityTypeMaster) {
		this.objQualityTypeMaster = objQualityTypeMaster;
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
	 * @return the qtySubTypeUserCode
	 */
	public String getQtySubTypeUserCode() {
		return qtySubTypeUserCode;
	}



	/**
	 * @param qtySubTypeUserCode the qtySubTypeUserCode to set
	 */
	public void setQtySubTypeUserCode(String qtySubTypeUserCode) {
		this.qtySubTypeUserCode = qtySubTypeUserCode;
	}



	/**
	 * @return the qtySubTypeStatus
	 */
	public String getQtySubTypeStatus() {
		return qtySubTypeStatus;
	}



	/**
	 * @param qtySubTypeStatus the qtySubTypeStatus to set
	 */
	public void setQtySubTypeStatus(String qtySubTypeStatus) {
		this.qtySubTypeStatus = qtySubTypeStatus;
	}



	/**
	 * @return the qtySubTypeDate
	 */
	public Date getQtySubTypeDate() {
		return qtySubTypeDate;
	}



	/**
	 * @param qtySubTypeDate the qtySubTypeDate to set
	 */
	public void setQtySubTypeDate(Date qtySubTypeDate) {
		this.qtySubTypeDate = qtySubTypeDate;
	}



	/**
	 * @return the qtySubTypeLastUpdatedDate
	 */
	public Date getQtySubTypeLastUpdatedDate() {
		return qtySubTypeLastUpdatedDate;
	}



	/**
	 * @param qtySubTypeLastUpdatedDate the qtySubTypeLastUpdatedDate to set
	 */
	public void setQtySubTypeLastUpdatedDate(Date qtySubTypeLastUpdatedDate) {
		this.qtySubTypeLastUpdatedDate = qtySubTypeLastUpdatedDate;
	}



	/**
	 * @return the lstObjQualityTest
	 */
	public List<QualityTest> getLstObjQualityTest() {
		return lstObjQualityTest;
	}



	/**
	 * @param lstObjQualityTest the lstObjQualityTest to set
	 */
	public void setLstObjQualityTest(List<QualityTest> lstObjQualityTest) {
		this.lstObjQualityTest = lstObjQualityTest;
	}



	@Override
	public String toString() {
		return "barCodeCutting [slNo=" + slNo 
				+ ", qtySubTypeCode=" + qtySubTypeCode 
				+ ", qtySubTypeName=" + qtySubTypeName 
				+ ", qtySubTypeUserCode=" + qtySubTypeUserCode
				+ ", qtySubTypeStatus=" + qtySubTypeStatus 
				+ ", qtySubTypeDate=" + qtySubTypeDate
				+ ", objQualityTypeMaster=" + objQualityTypeMaster
				+ ", qtySubTypeLastUpdatedDate=" + qtySubTypeLastUpdatedDate 
				+ "]";
	}
}
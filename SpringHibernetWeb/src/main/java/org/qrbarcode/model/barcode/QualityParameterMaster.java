/**
 * 
 */
package org.qrbarcode.model.barcode;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;

/**
 * @author harikrishna.trivedi
 *
 */
	

@Entity
@Table(name = "QUALITY_PARAMETER_MST")
public class QualityParameterMaster {

	@Column(name = "SL_NO", nullable = false)
	private Integer slNo;

	@Id
	@Size(max = 15)
	@Column(name = "QTY_PARAM_CODE", nullable = false)
	private String qtyParamCode;

	@Size(max = 100)
	@Column(name = "QTY_PARAM_NAME", nullable = false)
	private String qtyParamName;

	@Size(max = 15)
	@Column(name = "QTY_TYPE_CODE", nullable = true)
	private String qtyTypeCode;

	@ManyToOne
	@JoinColumn(name="QTY_TYPE_CODE")
	private QualityTypeMaster objQtyTypeMaster;

	@Size(max = 50)
	@Column(name = "QTY_TYPE_NAME", nullable = true)
	private String qtyTypeName;

	@ManyToOne
	@JoinColumn(name="QTY_SUB_TYPE_CODE")
	private QualitySubTypeMaster objQtySubTypeMaster;

	@Size(max = 50)
	@Column(name = "QTY_SUB_TYPE_NAME", nullable = true)
	private String qtySubTypeName;

	@OneToMany(mappedBy="QUALITY_TEST_QUALITY_PARAM_DETAILS")
	private Set<QualityParameterDetails> lstObjQualityTestQualityParamDetails;
	
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
	 * @return the qtyParamCode
	 */
	public String getQtyParamCode() {
		return qtyParamCode;
	}



	/**
	 * @param qtyParamCode the qtyParamCode to set
	 */
	public void setQtyParamCode(String qtyParamCode) {
		this.qtyParamCode = qtyParamCode;
	}



	/**
	 * @return the qtyParamName
	 */
	public String getQtyParamName() {
		return qtyParamName;
	}



	/**
	 * @param qtyParamName the qtyParamName to set
	 */
	public void setQtyParamName(String qtyParamName) {
		this.qtyParamName = qtyParamName;
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
	 * @return the objQtyTypeMaster
	 */
	public QualityTypeMaster getObjQtyTypeMaster() {
		return objQtyTypeMaster;
	}



	/**
	 * @param objQtyTypeMaster the objQtyTypeMaster to set
	 */
	public void setObjQtyTypeMaster(QualityTypeMaster objQtyTypeMaster) {
		this.objQtyTypeMaster = objQtyTypeMaster;
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
	 * @return the objQtySubTypeMaster
	 */
	public QualitySubTypeMaster getObjQtySubTypeMaster() {
		return objQtySubTypeMaster;
	}



	/**
	 * @param objQtySubTypeMaster the objQtySubTypeMaster to set
	 */
	public void setObjQtySubTypeMaster(QualitySubTypeMaster objQtySubTypeMaster) {
		this.objQtySubTypeMaster = objQtySubTypeMaster;
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



	@Override
	public String toString() {
		return "barCodeCutting [slNo=" + slNo +
				", qtyParamCode=" + qtyParamCode +
				", qtyParamName=" + qtyParamName +
				", qtyTypeCode=" + qtyTypeCode +
				", objQtyTypeMaster=" + objQtyTypeMaster +
				", qtyTypeName=" + qtyTypeName +
				", objQtySubTypeMaster=" + objQtySubTypeMaster +
				", qtySubTypeName=" + qtySubTypeName +
				"]";
	}
}
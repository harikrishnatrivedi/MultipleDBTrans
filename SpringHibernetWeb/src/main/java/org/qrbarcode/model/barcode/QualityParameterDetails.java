/**
 * 
 */
package org.qrbarcode.model.barcode;

import java.math.BigDecimal;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 * @author harikrishna.trivedi
 *
 */

@Entity
@Table(name = "QUALITY_PARAMETER_DETAILS")
public class QualityParameterDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "qtpm_id", nullable = false)
	private Integer qtpmId;

	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name="qtpm_quality_test_code", referencedColumnName="QTY_TEST_CODE")
//	@Column(name = "qtpm_quality_test_code", nullable = false)
	private QualityTest objQyalityTest;
	
	@ManyToOne
	@JoinColumn(name="qtpm_quality_param_code", referencedColumnName="QTY_PARAM_CODE")
//	@Column(name = "qtpm_quality_param_code", nullable = false)
	private QualityParameterMaster objQualityParameterMst;
	
	@Column(name = "qtpm_quality_param_minvalue", precision = 18, scale = 3, nullable = true)
	private BigDecimal qtpmQualityParamMinValue;
	
	@Column(name = "qtpm_quality_param_maxvalue", precision = 18, scale = 3, nullable = true)
	private BigDecimal qtpmQualityParamMaxValue;
	
	@Transient
	private String qtyParamCode;
	
	
	
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
	 * @return the qtpmId
	 */
	public Integer getQtpmId() {
		return qtpmId;
	}



	/**
	 * @param qtpmId the qtpmId to set
	 */
	public void setQtpmId(Integer qtpmId) {
		this.qtpmId = qtpmId;
	}



	/**
	 * @return the objQyalityTest
	 */
	public QualityTest getObjQyalityTest() {
		return objQyalityTest;
	}



	/**
	 * @param objQyalityTest the objQyalityTest to set
	 */
	public void setObjQyalityTest(QualityTest objQyalityTest) {
		this.objQyalityTest = objQyalityTest;
	}



	/**
	 * @return the objQualityParameterMst
	 */
	public QualityParameterMaster getObjQualityParameterMst() {
		return objQualityParameterMst;
	}



	/**
	 * @param objQualityParameterMst the objQualityParameterMst to set
	 */
	public void setObjQualityParameterMst(QualityParameterMaster objQualityParameterMst) {
		this.objQualityParameterMst = objQualityParameterMst;
	}



	/**
	 * @return the qtpmQualityParamMinValue
	 */
	public BigDecimal getQtpmQualityParamMinValue() {
		return qtpmQualityParamMinValue;
	}



	/**
	 * @param qtpmQualityParamMinValue the qtpmQualityParamMinValue to set
	 */
	public void setQtpmQualityParamMinValue(BigDecimal qtpmQualityParamMinValue) {
		this.qtpmQualityParamMinValue = qtpmQualityParamMinValue;
	}



	/**
	 * @return the qtpmQualityParamMaxValue
	 */
	public BigDecimal getQtpmQualityParamMaxValue() {
		return qtpmQualityParamMaxValue;
	}



	/**
	 * @param qtpmQualityParamMaxValue the qtpmQualityParamMaxValue to set
	 */
	public void setQtpmQualityParamMaxValue(BigDecimal qtpmQualityParamMaxValue) {
		this.qtpmQualityParamMaxValue = qtpmQualityParamMaxValue;
	}



	@Override
	public String toString() {
		return "QualityParameterDetails [qtpmId=" + qtpmId +
//				", objQyalityTest=" + objQyalityTest +
				", qtyParamCode=" + qtyParamCode +
				", objQualityParameterMst=" + objQualityParameterMst +
				", qtpmQualityParamMinValue=" + qtpmQualityParamMinValue +
				", qtpmQualityParamMaxValue=" + qtpmQualityParamMaxValue +
				"]";
	}
}
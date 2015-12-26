/**
 * 
 */
package org.qrbarcode.model.barcode;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author harikrishna.trivedi
 *
 */

@Entity
@Table(name = "QUALITY_TEST_QUALITY_PARAM_DETAILS")
public class QualityTestQualityParamDetails {
	
	@Id
	@Column(name = "qtpm_id", nullable = false)
	private Integer qtpmId;

	@ManyToOne
	@JoinColumn(name="QTY_TEST_CODE")
	@Column(name = "qtpm_quality_test_code", nullable = false)
	private QualityTest objQyalityTest;
	
	@ManyToOne
	@JoinColumn(name="QTY_PARAM_CODE")
	@Column(name = "qtpm_quality_param_code", nullable = false)
	private QualityParameterMst objQualityParameterMst;
	
	@Column(name = "qtpm_quality_param_value", precision = 18, scale = 3, nullable = true)
	private BigDecimal qtpmQualityParamValue;
	
	@Override
	public String toString() {
		return "barCodeCutting [qtpmId=" + qtpmId +
				", objQyalityTest=" + objQyalityTest.toString() +
				", objQualityParameterMst=" + objQualityParameterMst.toString() +
				", qtpmQualityParamValue=" + qtpmQualityParamValue +
				"]";
	}
}
/**
 * 
 */
package org.qrbarcode.model.barcode;

import java.util.Date;
import java.util.Set;

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

@Entity
@Table(name = "QUALITY_TEST")
public class QualityTest {

	@Column(name = "SL_NO", nullable = false)
	private Integer slNo;

	@Id
	@Size(max = 15)
	@Column(name = "QTY_TEST_CODE", nullable = false)
	private String qtyTestCode;

	@Size(max = 25)
	@Column(name = "BARCODE", nullable = false)
	private String mrnNo;

	@Size(max = 20)
	@Column(name = "ITEM_CODE", nullable = true)
	private String itemCode;

	@Size(max = 100)
	@Column(name = "ITEM_DESC", nullable = true)
	private String itemDesc;

	@Size(max = 20)
	@Column(name = "MRN_NUMBER", nullable = true)
	private String mrnNumber;

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

	@Size(max = 50)
	@Column(name = "HEAT_NO", nullable = true)
	private String heatNo;

	@Size(max = 50)
	@Column(name = "CONTROL_NO", nullable = true)
	private String controlNo;

	/*@Column(name = "PIPE_OUTSIDE_DIA_MIN", precision = 18, scale = 3, nullable = true)
	private BigDecimal pipeOutsideDiaMin;

	@Column(name = "PIPE_OUTSIDE_DIA_MAX", precision = 18, scale = 3, nullable = true)
	private BigDecimal pipeOutsideDiaMax;

	@Column(name = "PIPE_THIKNESS_MIN", precision = 18, scale = 3, nullable = true)
	private BigDecimal pipeThiknessMin;

	@Column(name = "PIPE_LENGTH", precision = 18, scale = 3, nullable = true)
	private BigDecimal pipeLength;

	@Column(name = "FLANGE_OUTSIDE_DIA", precision = 18, scale = 3, nullable = true)
	private BigDecimal flangeOutsideDia;

	@Column(name = "FLANGE_PCD", precision = 18, scale = 3, nullable = true)
	private BigDecimal flangePCD;

	@Column(name = "FLANGE_HOLE_DIA", precision = 18, scale = 3, nullable = true)
	private BigDecimal flangeHoldDia;

	@Column(name = "FLANGE_THIKNESS", precision = 18, scale = 3, nullable = true)
	private BigDecimal flangeThikness;

	@Column(name = "FLANGE_ID_OD", precision = 18, scale = 3, nullable = true)
	private BigDecimal flangeIdOd;

	@Column(name = "FLANGE_HOLE_NO", precision = 18, scale = 3, nullable = true)
	private BigDecimal flangeHoleNo;

	@Column(name = "FLANGE_Y_LENGTH_WIDTH", precision = 18, scale = 3, nullable = true)
	private BigDecimal flangeYLengthWidth;

	@Column(name = "FLANGE_RTJ_DIA", precision = 18, scale = 3, nullable = true)
	private BigDecimal flangeRtjDia;

	@Column(name = "FITTING_OUTSIDE_DIA_MIN_1", precision = 18, scale = 3, nullable = true)
	private BigDecimal fittingOutsideDiaMin1;

	@Column(name = "FITTING_OUTSIDE_DIA_MAX_1", precision = 18, scale = 3, nullable = true)
	private BigDecimal fittingOutsideDiaMax1;

	@Column(name = "FITTING_INSIDE_DIA_MIN_1", precision = 18, scale = 3, nullable = true)
	private BigDecimal fittingInsideDiaMin1;

	@Column(name = "FITTING_INSIDE_DIA_MAX_1", precision = 18, scale = 3, nullable = true)
	private BigDecimal fittingInsideDiaMax1;

	@Column(name = "FITTING_THIKNESS_MIN_1", precision = 18, scale = 3, nullable = true)
	private BigDecimal fittingThiknessMin1;

	@Column(name = "FITTING_THIKNESS_MAX_1", precision = 18, scale = 3, nullable = true)
	private BigDecimal fittingThiknessMax1;

	@Column(name = "FITTING_OUTSIDE_DIA_MIN_2", precision = 18, scale = 3, nullable = true)
	private BigDecimal fittingOutsideDiaMin2;

	@Column(name = "FITTING_OUTSIDE_DIA_MAX_2", precision = 18, scale = 3, nullable = true)
	private BigDecimal fittingOutsideDiaMax2;

	@Column(name = "FITTING_INSIDE_DIA_MIN_2", precision = 18, scale = 3, nullable = true)
	private BigDecimal fittingInsideDiaMin2;

	@Column(name = "FITTING_INSIDE_DIA_MAX_2", precision = 18, scale = 3, nullable = true)
	private BigDecimal fittingInsideDiaMax2;

	@Column(name = "FITTING_THIKNESS_MIN_2", precision = 18, scale = 3, nullable = true)
	private BigDecimal fittingThiknessMin2;

	@Column(name = "FITTING_THIKNESS_MAX_2", precision = 18, scale = 3, nullable = true)
	private BigDecimal fittingThiknessMax2;

	@Column(name = "FITTING_HEIGHT_MM_MIN", precision = 18, scale = 3, nullable = true)
	private BigDecimal fittingHeightMmMin;

	@Column(name = "FITTING_HEIGHT_MM_MAX", precision = 18, scale = 3, nullable = true)
	private BigDecimal fittingHeightMmMax;

	@Column(name = "FITTING_HEIGHT_MIN", precision = 18, scale = 3, nullable = true)
	private BigDecimal fittingHeightMin;

	@Column(name = "FITTING_HEIGHT_MAX", precision = 18, scale = 3, nullable = true)
	private BigDecimal fittingHeightMax;*/

	@Size(max = 1)
	@Column(name = "QTY_STATUS", nullable = true)
	private String qtyStatus;

	@Size(max = 1)
	@Column(name = "QTY_REG_FLAG", nullable = true)
	private String qtyRegFlag;

	@Size(max = 150)
	@Column(name = "QTY_REG_REMARKS", nullable = true)
	private String qtyRegRemarks;

	@Column(name = "QTY_TEST_DATE", nullable = true)
	@Temporal(TemporalType.TIMESTAMP)
	private Date qtyTestDate;

	@Size(max = 15)
	@Column(name = "QTY_TEST_TIME", nullable = true)
	private String qtyTestTime;

	@Size(max = 20)
	@Column(name = "MRN_ISSUE_DATE", nullable = true)
	private String mrnIssueDate;

	@Size(max = 1)
	@Column(name = "QTY_ALL", nullable = true)
	private String qtyAll;
	
	@OneToMany(mappedBy="QUALITY_TEST_QUALITY_PARAM_DETAILS")
	private Set<QualityTestQualityParamDetails> lstObjQualityTestQualityParamDetails;
	
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
	 * @return the qtyTestCode
	 */
	public String getQtyTestCode() {
		return qtyTestCode;
	}

	/**
	 * @param qtyTestCode the qtyTestCode to set
	 */
	public void setQtyTestCode(String qtyTestCode) {
		this.qtyTestCode = qtyTestCode;
	}

	/**
	 * @return the mrnNo
	 */
	public String getMrnNo() {
		return mrnNo;
	}

	/**
	 * @param mrnNo the mrnNo to set
	 */
	public void setMrnNo(String mrnNo) {
		this.mrnNo = mrnNo;
	}

	/**
	 * @return the itemCode
	 */
	public String getItemCode() {
		return itemCode;
	}

	/**
	 * @param itemCode the itemCode to set
	 */
	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	/**
	 * @return the itemDesc
	 */
	public String getItemDesc() {
		return itemDesc;
	}

	/**
	 * @param itemDesc the itemDesc to set
	 */
	public void setItemDesc(String itemDesc) {
		this.itemDesc = itemDesc;
	}

	/**
	 * @return the mrnNumber
	 */
	public String getMrnNumber() {
		return mrnNumber;
	}

	/**
	 * @param mrnNumber the mrnNumber to set
	 */
	public void setMrnNumber(String mrnNumber) {
		this.mrnNumber = mrnNumber;
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

	/**
	 * @return the heatNo
	 */
	public String getHeatNo() {
		return heatNo;
	}

	/**
	 * @param heatNo the heatNo to set
	 */
	public void setHeatNo(String heatNo) {
		this.heatNo = heatNo;
	}

	/**
	 * @return the controlNo
	 */
	public String getControlNo() {
		return controlNo;
	}

	/**
	 * @param controlNo the controlNo to set
	 */
	public void setControlNo(String controlNo) {
		this.controlNo = controlNo;
	}

	/**
	 * @return the pipeOutsideDiaMin
	 *//*
	public BigDecimal getPipeOutsideDiaMin() {
		return pipeOutsideDiaMin;
	}

	*//**
	 * @param pipeOutsideDiaMin the pipeOutsideDiaMin to set
	 *//*
	public void setPipeOutsideDiaMin(BigDecimal pipeOutsideDiaMin) {
		this.pipeOutsideDiaMin = pipeOutsideDiaMin;
	}

	*//**
	 * @return the pipeOutsideDiaMax
	 *//*
	public BigDecimal getPipeOutsideDiaMax() {
		return pipeOutsideDiaMax;
	}

	*//**
	 * @param pipeOutsideDiaMax the pipeOutsideDiaMax to set
	 *//*
	public void setPipeOutsideDiaMax(BigDecimal pipeOutsideDiaMax) {
		this.pipeOutsideDiaMax = pipeOutsideDiaMax;
	}

	*//**
	 * @return the pipeThiknessMin
	 *//*
	public BigDecimal getPipeThiknessMin() {
		return pipeThiknessMin;
	}

	*//**
	 * @param pipeThiknessMin the pipeThiknessMin to set
	 *//*
	public void setPipeThiknessMin(BigDecimal pipeThiknessMin) {
		this.pipeThiknessMin = pipeThiknessMin;
	}

	*//**
	 * @return the pipeLength
	 *//*
	public BigDecimal getPipeLength() {
		return pipeLength;
	}

	*//**
	 * @param pipeLength the pipeLength to set
	 *//*
	public void setPipeLength(BigDecimal pipeLength) {
		this.pipeLength = pipeLength;
	}

	*//**
	 * @return the flangeOutsideDia
	 *//*
	public BigDecimal getFlangeOutsideDia() {
		return flangeOutsideDia;
	}

	*//**
	 * @param flangeOutsideDia the flangeOutsideDia to set
	 *//*
	public void setFlangeOutsideDia(BigDecimal flangeOutsideDia) {
		this.flangeOutsideDia = flangeOutsideDia;
	}

	*//**
	 * @return the flangePCD
	 *//*
	public BigDecimal getFlangePCD() {
		return flangePCD;
	}

	*//**
	 * @param flangePCD the flangePCD to set
	 *//*
	public void setFlangePCD(BigDecimal flangePCD) {
		this.flangePCD = flangePCD;
	}

	*//**
	 * @return the flangeHoldDia
	 *//*
	public BigDecimal getFlangeHoldDia() {
		return flangeHoldDia;
	}

	*//**
	 * @param flangeHoldDia the flangeHoldDia to set
	 *//*
	public void setFlangeHoldDia(BigDecimal flangeHoldDia) {
		this.flangeHoldDia = flangeHoldDia;
	}

	*//**
	 * @return the flangeThikness
	 *//*
	public BigDecimal getFlangeThikness() {
		return flangeThikness;
	}

	*//**
	 * @param flangeThikness the flangeThikness to set
	 *//*
	public void setFlangeThikness(BigDecimal flangeThikness) {
		this.flangeThikness = flangeThikness;
	}

	*//**
	 * @return the flangeIdOd
	 *//*
	public BigDecimal getFlangeIdOd() {
		return flangeIdOd;
	}

	*//**
	 * @param flangeIdOd the flangeIdOd to set
	 *//*
	public void setFlangeIdOd(BigDecimal flangeIdOd) {
		this.flangeIdOd = flangeIdOd;
	}

	*//**
	 * @return the flangeHoleNo
	 *//*
	public BigDecimal getFlangeHoleNo() {
		return flangeHoleNo;
	}

	*//**
	 * @param flangeHoleNo the flangeHoleNo to set
	 *//*
	public void setFlangeHoleNo(BigDecimal flangeHoleNo) {
		this.flangeHoleNo = flangeHoleNo;
	}

	*//**
	 * @return the flangeYLengthWidth
	 *//*
	public BigDecimal getFlangeYLengthWidth() {
		return flangeYLengthWidth;
	}

	*//**
	 * @param flangeYLengthWidth the flangeYLengthWidth to set
	 *//*
	public void setFlangeYLengthWidth(BigDecimal flangeYLengthWidth) {
		this.flangeYLengthWidth = flangeYLengthWidth;
	}

	*//**
	 * @return the flangeRtjDia
	 *//*
	public BigDecimal getFlangeRtjDia() {
		return flangeRtjDia;
	}

	*//**
	 * @param flangeRtjDia the flangeRtjDia to set
	 *//*
	public void setFlangeRtjDia(BigDecimal flangeRtjDia) {
		this.flangeRtjDia = flangeRtjDia;
	}

	*//**
	 * @return the fittingOutsideDiaMin1
	 *//*
	public BigDecimal getFittingOutsideDiaMin1() {
		return fittingOutsideDiaMin1;
	}

	*//**
	 * @param fittingOutsideDiaMin1 the fittingOutsideDiaMin1 to set
	 *//*
	public void setFittingOutsideDiaMin1(BigDecimal fittingOutsideDiaMin1) {
		this.fittingOutsideDiaMin1 = fittingOutsideDiaMin1;
	}

	*//**
	 * @return the fittingOutsideDiaMax1
	 *//*
	public BigDecimal getFittingOutsideDiaMax1() {
		return fittingOutsideDiaMax1;
	}

	*//**
	 * @param fittingOutsideDiaMax1 the fittingOutsideDiaMax1 to set
	 *//*
	public void setFittingOutsideDiaMax1(BigDecimal fittingOutsideDiaMax1) {
		this.fittingOutsideDiaMax1 = fittingOutsideDiaMax1;
	}

	*//**
	 * @return the fittingInsideDiaMin1
	 *//*
	public BigDecimal getFittingInsideDiaMin1() {
		return fittingInsideDiaMin1;
	}

	*//**
	 * @param fittingInsideDiaMin1 the fittingInsideDiaMin1 to set
	 *//*
	public void setFittingInsideDiaMin1(BigDecimal fittingInsideDiaMin1) {
		this.fittingInsideDiaMin1 = fittingInsideDiaMin1;
	}

	*//**
	 * @return the fittingInsideDiaMax1
	 *//*
	public BigDecimal getFittingInsideDiaMax1() {
		return fittingInsideDiaMax1;
	}

	*//**
	 * @param fittingInsideDiaMax1 the fittingInsideDiaMax1 to set
	 *//*
	public void setFittingInsideDiaMax1(BigDecimal fittingInsideDiaMax1) {
		this.fittingInsideDiaMax1 = fittingInsideDiaMax1;
	}

	*//**
	 * @return the fittingThiknessMin1
	 *//*
	public BigDecimal getFittingThiknessMin1() {
		return fittingThiknessMin1;
	}

	*//**
	 * @param fittingThiknessMin1 the fittingThiknessMin1 to set
	 *//*
	public void setFittingThiknessMin1(BigDecimal fittingThiknessMin1) {
		this.fittingThiknessMin1 = fittingThiknessMin1;
	}

	*//**
	 * @return the fittingThiknessMax1
	 *//*
	public BigDecimal getFittingThiknessMax1() {
		return fittingThiknessMax1;
	}

	*//**
	 * @param fittingThiknessMax1 the fittingThiknessMax1 to set
	 *//*
	public void setFittingThiknessMax1(BigDecimal fittingThiknessMax1) {
		this.fittingThiknessMax1 = fittingThiknessMax1;
	}

	*//**
	 * @return the fittingOutsideDiaMin2
	 *//*
	public BigDecimal getFittingOutsideDiaMin2() {
		return fittingOutsideDiaMin2;
	}

	*//**
	 * @param fittingOutsideDiaMin2 the fittingOutsideDiaMin2 to set
	 *//*
	public void setFittingOutsideDiaMin2(BigDecimal fittingOutsideDiaMin2) {
		this.fittingOutsideDiaMin2 = fittingOutsideDiaMin2;
	}

	*//**
	 * @return the fittingOutsideDiaMax2
	 *//*
	public BigDecimal getFittingOutsideDiaMax2() {
		return fittingOutsideDiaMax2;
	}

	*//**
	 * @param fittingOutsideDiaMax2 the fittingOutsideDiaMax2 to set
	 *//*
	public void setFittingOutsideDiaMax2(BigDecimal fittingOutsideDiaMax2) {
		this.fittingOutsideDiaMax2 = fittingOutsideDiaMax2;
	}

	*//**
	 * @return the fittingInsideDiaMin2
	 *//*
	public BigDecimal getFittingInsideDiaMin2() {
		return fittingInsideDiaMin2;
	}

	*//**
	 * @param fittingInsideDiaMin2 the fittingInsideDiaMin2 to set
	 *//*
	public void setFittingInsideDiaMin2(BigDecimal fittingInsideDiaMin2) {
		this.fittingInsideDiaMin2 = fittingInsideDiaMin2;
	}

	*//**
	 * @return the fittingInsideDiaMax2
	 *//*
	public BigDecimal getFittingInsideDiaMax2() {
		return fittingInsideDiaMax2;
	}

	*//**
	 * @param fittingInsideDiaMax2 the fittingInsideDiaMax2 to set
	 *//*
	public void setFittingInsideDiaMax2(BigDecimal fittingInsideDiaMax2) {
		this.fittingInsideDiaMax2 = fittingInsideDiaMax2;
	}

	*//**
	 * @return the fittingThiknessMin2
	 *//*
	public BigDecimal getFittingThiknessMin2() {
		return fittingThiknessMin2;
	}

	*//**
	 * @param fittingThiknessMin2 the fittingThiknessMin2 to set
	 *//*
	public void setFittingThiknessMin2(BigDecimal fittingThiknessMin2) {
		this.fittingThiknessMin2 = fittingThiknessMin2;
	}

	*//**
	 * @return the fittingThiknessMax2
	 *//*
	public BigDecimal getFittingThiknessMax2() {
		return fittingThiknessMax2;
	}

	*//**
	 * @param fittingThiknessMax2 the fittingThiknessMax2 to set
	 *//*
	public void setFittingThiknessMax2(BigDecimal fittingThiknessMax2) {
		this.fittingThiknessMax2 = fittingThiknessMax2;
	}

	*//**
	 * @return the fittingHeightMmMin
	 *//*
	public BigDecimal getFittingHeightMmMin() {
		return fittingHeightMmMin;
	}

	*//**
	 * @param fittingHeightMmMin the fittingHeightMmMin to set
	 *//*
	public void setFittingHeightMmMin(BigDecimal fittingHeightMmMin) {
		this.fittingHeightMmMin = fittingHeightMmMin;
	}

	*//**
	 * @return the fittingHeightMmMax
	 *//*
	public BigDecimal getFittingHeightMmMax() {
		return fittingHeightMmMax;
	}

	*//**
	 * @param fittingHeightMmMax the fittingHeightMmMax to set
	 *//*
	public void setFittingHeightMmMax(BigDecimal fittingHeightMmMax) {
		this.fittingHeightMmMax = fittingHeightMmMax;
	}

	*//**
	 * @return the fittingHeightMin
	 *//*
	public BigDecimal getFittingHeightMin() {
		return fittingHeightMin;
	}

	*//**
	 * @param fittingHeightMin the fittingHeightMin to set
	 *//*
	public void setFittingHeightMin(BigDecimal fittingHeightMin) {
		this.fittingHeightMin = fittingHeightMin;
	}

	*//**
	 * @return the fittingHeightMax
	 *//*
	public BigDecimal getFittingHeightMax() {
		return fittingHeightMax;
	}

	*//**
	 * @param fittingHeightMax the fittingHeightMax to set
	 *//*
	public void setFittingHeightMax(BigDecimal fittingHeightMax) {
		this.fittingHeightMax = fittingHeightMax;
	}*/

	/**
	 * @return the qtyStatus
	 */
	public String getQtyStatus() {
		return qtyStatus;
	}

	/**
	 * @param qtyStatus the qtyStatus to set
	 */
	public void setQtyStatus(String qtyStatus) {
		this.qtyStatus = qtyStatus;
	}

	/**
	 * @return the qtyRegFlag
	 */
	public String getQtyRegFlag() {
		return qtyRegFlag;
	}

	/**
	 * @param qtyRegFlag the qtyRegFlag to set
	 */
	public void setQtyRegFlag(String qtyRegFlag) {
		this.qtyRegFlag = qtyRegFlag;
	}

	/**
	 * @return the qtyRegRemarks
	 */
	public String getQtyRegRemarks() {
		return qtyRegRemarks;
	}

	/**
	 * @param qtyRegRemarks the qtyRegRemarks to set
	 */
	public void setQtyRegRemarks(String qtyRegRemarks) {
		this.qtyRegRemarks = qtyRegRemarks;
	}

	/**
	 * @return the qtyTestDate
	 */
	public Date getQtyTestDate() {
		return qtyTestDate;
	}

	/**
	 * @param qtyTestDate the qtyTestDate to set
	 */
	public void setQtyTestDate(Date qtyTestDate) {
		this.qtyTestDate = qtyTestDate;
	}

	/**
	 * @return the qtyTestTime
	 */
	public String getQtyTestTime() {
		return qtyTestTime;
	}

	/**
	 * @param qtyTestTime the qtyTestTime to set
	 */
	public void setQtyTestTime(String qtyTestTime) {
		this.qtyTestTime = qtyTestTime;
	}

	/**
	 * @return the mrnIssueDate
	 */
	public String getMrnIssueDate() {
		return mrnIssueDate;
	}

	/**
	 * @param mrnIssueDate the mrnIssueDate to set
	 */
	public void setMrnIssueDate(String mrnIssueDate) {
		this.mrnIssueDate = mrnIssueDate;
	}

	/**
	 * @return the qtyAll
	 */
	public String getQtyAll() {
		return qtyAll;
	}

	/**
	 * @param qtyAll the qtyAll to set
	 */
	public void setQtyAll(String qtyAll) {
		this.qtyAll = qtyAll;
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

	@Override
	public String toString() {
		return "barCodeCutting [slNo=" + slNo +
				", qtyTestCode=" + qtyTestCode +
				", mrnNo=" + mrnNo +
				", itemCode=" + itemCode +
				", itemDesc=" + itemDesc +
				", mrnNumber=" + mrnNumber +
				", objQtyTypeMaster=" + objQtyTypeMaster.toString() +
				", qtyTypeName=" + qtyTypeName +
				", objQtySubTypeMaster=" + objQtySubTypeMaster.toString() +
				", qtySubTypeName=" + qtySubTypeName +
				", heatNo=" + heatNo +
				", controlNo=" + controlNo +
	/*			", pipeOutsideDiaMin=" + pipeOutsideDiaMin +
				", pipeOutsideDiaMax=" + pipeOutsideDiaMax +
				", pipeThiknessMin=" + pipeThiknessMin +
				", pipeLength=" + pipeLength +
				", flangeOutsideDia=" + flangeOutsideDia +
				", flangePCD=" + flangePCD +
				", flangeHoldDia=" + flangeHoldDia +
				", flangeThikness=" + flangeThikness +
				", flangeIdOd=" + flangeIdOd +
				", flangeHoleNo=" + flangeHoleNo +
				", flangeYLengthWidth=" + flangeYLengthWidth +
				", fittingOutsideDiaMin1=" + fittingOutsideDiaMin1 +
				", fittingOutsideDiaMax1=" + fittingOutsideDiaMax1 +
				", fittingInsideDiaMin1=" + fittingInsideDiaMin1 +
				", fittingInsideDiaMax1=" + fittingInsideDiaMax1 +
				", fittingThiknessMin1=" + fittingThiknessMin1 +
				", fittingThiknessMax1=" + fittingThiknessMax1 +
				", fittingOutsideDiaMin2=" + fittingOutsideDiaMin2 +
				", fittingOutsideDiaMax2=" + fittingOutsideDiaMax2 +
				", fittingInsideDiaMin2=" + fittingInsideDiaMin2 +
				", fittingInsideDiaMax2=" + fittingInsideDiaMax2 +
				", fittingThiknessMin2=" + fittingThiknessMin2 +
				", fittingThiknessMax2=" + fittingThiknessMax2 +
				", fittingHeightMmMax=" + fittingHeightMmMax +
				", fittingHeightMin=" + fittingHeightMin +
				", fittingHeightMax=" + fittingHeightMax +*/
				", qtyStatus=" + qtyStatus +
				", qtyRegFlag=" + qtyRegFlag +
				", qtyRegRemarks=" + qtyRegRemarks +
				", qtyTestDate=" + qtyTestDate +
				", qtyTestTime=" + qtyTestTime +
				", mrnIssueDate=" + mrnIssueDate +
				", qtyAll=" + qtyAll +
				"]";
	}
}
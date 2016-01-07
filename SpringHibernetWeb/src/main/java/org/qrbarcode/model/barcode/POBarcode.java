/**
 * 
 */
package org.qrbarcode.model.barcode;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.validation.constraints.Size;



/**
 * @author harikrishna.trivedi
 *
 */

@Entity @Table(name="Po_barcode")
public class POBarcode {

	@Column(name = "DOC_no", nullable = true)
	private Integer docNo;

	@Id
    @Column(name = "S_NO", nullable = false)
	private Integer sNo;

	@Transient
	@Size(max = 1500)
	private String commonError;
	
	@Size(max = 50)
	@Column(name = "MrnNo", nullable = true)
	private String mrnNo;

	@Size(max = 50)
	@Column(name = "GrnNo", nullable = true)
	private String grnNo;

	@Size(max = 50)
	@Column(name = "ProductName", nullable = true)
	private String productName;

	@Size(max = 50)
	@Column(name = "OrderNo", nullable = true)
	private String orderNo;

	@Column(name = "JobNo", nullable = true)
	@Size(max = 50)
	private String jobNo;

	@Column(name = "barcode", nullable = true)
	@Size(max = 50)
	private String barCode;

	@Column(name = "width", precision = 14, scale = 4, nullable = true)
	private BigDecimal width;

	@Column(name = "length", precision = 14, scale = 4, nullable = true)
	private BigDecimal length;

	@Column(name = "remain_length", precision = 14, scale = 4, nullable = true)
	private BigDecimal remainLength;

	@Column(name = "Dimeter", nullable = true)
	@Size(max = 50)
	private String dimeter;

	@Size(max = 50)
	@Column(name = "qty_check", nullable = true)
	private String qtyCheck;

	@Column(name = "control_id", nullable = true)
	@Size(max = 50)
	private String controlId;

	@Column(name = "status", nullable = true)
	@Size(max = 50)
	private String status;

	@Column(name = "print_status", nullable = true)
	@Size(max = 50)
	private String printStatus;

	@Column(name = "location", nullable = true)
	@Size(max = 50)
	private String location;

	@Column(name = "remarks", nullable = true)
	@Size(max = 50)
	private String remarks;

	@Column(name = "Batch_no", nullable = true)
	@Size(max = 50)
	private String batchNo;

	@Column(name = "item", nullable = true)
	@Size(max = 50)
	private String item;

	@Column(name = "make", nullable = true)
	@Size(max = 50)
	private String make;

	@Column(name = "heat_no", nullable = true)
	@Size(max = 50)
	private String heatNo;

	@Column(name = "issue_no", nullable = true)
	@Size(max = 250)
	private String issueNo;

	@Column(name = "Line_no", nullable = true)
	@Size(max = 50)
	private String lineNo;

	@Column(name = "MRN_ISSUE_DATE", nullable = true)
	@Temporal(TemporalType.TIMESTAMP)
	private Date mrnIssueDate;

	@Column(name = "USER_ID", nullable = true)
	@Size(max = 20)
	private String userId;

	@Column(name = "LAST_UPDATED_DATE", nullable = true)
	@Temporal(TemporalType.TIMESTAMP)
	private Date lastUpdatedDate;

	@Column(name = "CUTTING_STATUS", nullable = true)
	@Size(max = 1)
	private String cuttingStatus;

	@Column(name = "MANUAL_ISSUE_FLAG", nullable = true)
	@Size(max = 1)
	private String manualIssueFlag;

	@Column(name = "BARCODE_SL_NO", nullable = true)
	private Integer barcodeSlNo;

	@Column(name = "[SL_NO_1x1]", nullable = true)
	private Integer slNo1x1;

	@Column(name = "NEW_CONTROL", nullable = true)
	@Size(max = 20)
	private String newControl;

	@Column(name = "NEW_HEAT", nullable = true)
	@Size(max = 20)
	private String newHeat;

	@Column(name = "TC_NO", nullable = true)
	@Size(max = 50)
	private String tcNo;

	/**
	 * @return the docNo
	 */
	public Integer getDocNo() {
		return docNo;
	}

	/**
	 * @param docNo
	 *            the docNo to set
	 */
	public void setDocNo(Integer docNo) {
		this.docNo = docNo;
	}

	/**
	 * @return the sNo
	 */
	public Integer getsNo() {
		return sNo;
	}

	/**
	 * @param sNo
	 *            the sNo to set
	 */
	public void setsNo(Integer sNo) {
		this.sNo = sNo;
	}

	/**
	 * @return the mrnNo
	 */
	public String getMrnNo() {
		return mrnNo;
	}

	/**
	 * @param mrnNo
	 *            the mrnNo to set
	 */
	public void setMrnNo(String mrnNo) {
		this.mrnNo = mrnNo;
	}

	/**
	 * @return the grnNo
	 */
	public String getGrnNo() {
		return grnNo;
	}

	/**
	 * @param grnNo
	 *            the grnNo to set
	 */
	public void setGrnNo(String grnNo) {
		this.grnNo = grnNo;
	}

	/**
	 * @return the productName
	 */
	public String getProductName() {
		return productName;
	}

	/**
	 * @param productName
	 *            the productName to set
	 */
	public void setProductName(String productName) {
		this.productName = productName;
	}

	/**
	 * @return the orderNo
	 */
	public String getOrderNo() {
		return orderNo;
	}

	/**
	 * @param orderNo
	 *            the orderNo to set
	 */
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	/**
	 * @return the jobNo
	 */
	public String getJobNo() {
		return jobNo;
	}

	/**
	 * @param jobNo
	 *            the jobNo to set
	 */
	public void setJobNo(String jobNo) {
		this.jobNo = jobNo;
	}

	/**
	 * @return the barCode
	 */
	public String getBarCode() {
		return barCode;
	}

	/**
	 * @param barCode
	 *            the barCode to set
	 */
	public void setBarCode(String barCode) {
		this.barCode = barCode;
	}

	/**
	 * @return the width
	 */
	public BigDecimal getWidth() {
		return width;
	}

	/**
	 * @param width
	 *            the width to set
	 */
	public void setWidth(BigDecimal width) {
		this.width = width;
	}

	/**
	 * @return the length
	 */
	public BigDecimal getLength() {
		return length;
	}

	/**
	 * @param length
	 *            the length to set
	 */
	public void setLength(BigDecimal length) {
		this.length = length;
	}

	/**
	 * @return the remainLength
	 */
	public BigDecimal getRemainLength() {
		return remainLength;
	}

	/**
	 * @param remainLength
	 *            the remainLength to set
	 */
	public void setRemainLength(BigDecimal remainLength) {
		this.remainLength = remainLength;
	}

	/**
	 * @return the dimeter
	 */
	public String getDimeter() {
		return dimeter;
	}

	/**
	 * @param dimeter
	 *            the dimeter to set
	 */
	public void setDimeter(String dimeter) {
		this.dimeter = dimeter;
	}

	/**
	 * @return the qtyCheck
	 */
	public String getQtyCheck() {
		return qtyCheck;
	}

	/**
	 * @param qtyCheck
	 *            the qtyCheck to set
	 */
	public void setQtyCheck(String qtyCheck) {
		this.qtyCheck = qtyCheck;
	}

	/**
	 * @return the controlId
	 */
	public String getControlId() {
		return controlId;
	}

	/**
	 * @param controlId
	 *            the controlId to set
	 */
	public void setControlId(String controlId) {
		this.controlId = controlId;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status
	 *            the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @return the printStatus
	 */
	public String getPrintStatus() {
		return printStatus;
	}

	/**
	 * @param printStatus
	 *            the printStatus to set
	 */
	public void setPrintStatus(String printStatus) {
		this.printStatus = printStatus;
	}

	/**
	 * @return the location
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * @param location
	 *            the location to set
	 */
	public void setLocation(String location) {
		this.location = location;
	}

	/**
	 * @return the remarks
	 */
	public String getRemarks() {
		return remarks;
	}

	/**
	 * @param remarks
	 *            the remarks to set
	 */
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	/**
	 * @return the batchNo
	 */
	public String getBatchNo() {
		return batchNo;
	}

	/**
	 * @param batchNo
	 *            the batchNo to set
	 */
	public void setBatchNo(String batchNo) {
		this.batchNo = batchNo;
	}

	/**
	 * @return the item
	 */
	public String getItem() {
		return item;
	}

	/**
	 * @param item
	 *            the item to set
	 */
	public void setItem(String item) {
		this.item = item;
	}

	/**
	 * @return the make
	 */
	public String getMake() {
		return make;
	}

	/**
	 * @param make
	 *            the make to set
	 */
	public void setMake(String make) {
		this.make = make;
	}

	/**
	 * @return the heatNo
	 */
	public String getHeatNo() {
		return heatNo;
	}

	/**
	 * @param heatNo
	 *            the heatNo to set
	 */
	public void setHeatNo(String heatNo) {
		this.heatNo = heatNo;
	}

	/**
	 * @return the issueNo
	 */
	public String getIssueNo() {
		return issueNo;
	}

	/**
	 * @param issueNo
	 *            the issueNo to set
	 */
	public void setIssueNo(String issueNo) {
		this.issueNo = issueNo;
	}

	/**
	 * @return the lineNo
	 */
	public String getLineNo() {
		return lineNo;
	}

	/**
	 * @param lineNo
	 *            the lineNo to set
	 */
	public void setLineNo(String lineNo) {
		this.lineNo = lineNo;
	}

	/**
	 * @return the mrnIssueDate
	 */
	public Date getMrnIssueDate() {
		return mrnIssueDate;
	}

	/**
	 * @param mrnIssueDate
	 *            the mrnIssueDate to set
	 */
	public void setMrnIssueDate(Date mrnIssueDate) {
		this.mrnIssueDate = mrnIssueDate;
	}

	/**
	 * @return the userId
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * @param userId
	 *            the userId to set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

	/**
	 * @return the lastUpdatedDate
	 */
	public Date getLastUpdatedDate() {
		return lastUpdatedDate;
	}

	/**
	 * @param lastUpdatedDate
	 *            the lastUpdatedDate to set
	 */
	public void setLastUpdatedDate(Date lastUpdatedDate) {
		this.lastUpdatedDate = lastUpdatedDate;
	}

	/**
	 * @return the cuttingStatus
	 */
	public String getCuttingStatus() {
		return cuttingStatus;
	}

	/**
	 * @param cuttingStatus
	 *            the cuttingStatus to set
	 */
	public void setCuttingStatus(String cuttingStatus) {
		this.cuttingStatus = cuttingStatus;
	}

	/**
	 * @return the manualIssueFlag
	 */
	public String getManualIssueFlag() {
		return manualIssueFlag;
	}

	/**
	 * @param manualIssueFlag
	 *            the manualIssueFlag to set
	 */
	public void setManualIssueFlag(String manualIssueFlag) {
		this.manualIssueFlag = manualIssueFlag;
	}

	/**
	 * @return the barcodeSlNo
	 */
	public Integer getBarcodeSlNo() {
		return barcodeSlNo;
	}

	/**
	 * @param barcodeSlNo
	 *            the barcodeSlNo to set
	 */
	public void setBarcodeSlNo(Integer barcodeSlNo) {
		this.barcodeSlNo = barcodeSlNo;
	}

	/**
	 * @return the slNo1x1
	 */
	public Integer getSlNo1x1() {
		return slNo1x1;
	}

	/**
	 * @param slNo1x1
	 *            the slNo1x1 to set
	 */
	public void setSlNo1x1(Integer slNo1x1) {
		this.slNo1x1 = slNo1x1;
	}

	/**
	 * @return the newControl
	 */
	public String getNewControl() {
		return newControl;
	}

	/**
	 * @param newControl
	 *            the newControl to set
	 */
	public void setNewControl(String newControl) {
		this.newControl = newControl;
	}

	/**
	 * @return the newHeat
	 */
	public String getNewHeat() {
		return newHeat;
	}

	/**
	 * @param newHeat
	 *            the newHeat to set
	 */
	public void setNewHeat(String newHeat) {
		this.newHeat = newHeat;
	}

	/**
	 * @return the tcNo
	 */
	public String getTcNo() {
		return tcNo;
	}

	/**
	 * @param tcNo
	 *            the tcNo to set
	 */
	public void setTcNo(String tcNo) {
		this.tcNo = tcNo;
	}

	@Override
	public String toString() {
		return "barCodeCutting [docNo=" + docNo 
				+ ", sNo=" + sNo 
				+ ", mrnNo=" + mrnNo 
				+ ", grnNo=" + grnNo
				+ ", productName=" + productName 
				+ ", orderNo=" + orderNo 
				+ ", jobNo=" + jobNo 
				+ ", barCode=" + barCode
				+ ", width=" + width 
				+ ", length=" + length 
				+ ", remainLength=" + remainLength 
				+ ", dimeter=" + dimeter
				+ ", qtyCheck=" + qtyCheck 
				+ ", controlId=" + controlId 
				+ ", status=" + status 
				+ ", printStatus=" + printStatus 
				+ ", location=" + location 
				+ ", remarks=" + remarks 
				+ ", batchNo=" + batchNo 
				+ ", item=" + item 
				+ ", make=" + make 
				+ ", heatNo=" + heatNo 
				+ ", issueNo=" + issueNo 
				+ ", lineNo=" + lineNo 
				+ ", mrnIssueDate=" + mrnIssueDate 
				+ ", userId=" + userId 
				+ ", lastUpdatedDate=" + lastUpdatedDate 
				+ ", cuttingStatus=" + cuttingStatus 
				+ ", manualIssueFlag=" + manualIssueFlag
				+ ", barcodeSlNo=" + barcodeSlNo 
				+ ", slNo1x1=" + slNo1x1 
				+ ", newControl=" + newControl 
				+ ", newHeat=" + newHeat 
				+ ", tcNo=" + tcNo + "]";
	}
}
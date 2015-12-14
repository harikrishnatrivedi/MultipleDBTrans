/**
 * 
 */
package org.qrbarcode.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;
import org.joda.time.DateTime;

/**
 * @author harikrishna.trivedi
 *
 */

@Entity
@Table(name = "Main_Grn")
public class MainGRN implements Serializable {

	@Id
    @Column(name = "Docno", nullable = false)
	private int docNo;

	@Size(max = 50)
	@Column(name = "GrnNo", nullable = true)
	private String grnNo;

	@Size(max = 50)
	@Column(name = "vendorNo", nullable = true)
	private String vendorNo;

	@Size(max = 50)
	@Column(name = "itemDesc", nullable = true)
	private String itemDesc;

	@Size(max = 50)
	@Column(name = "line_No", nullable = true)
	private String lineNo;

	@Size(max = 50)
	@Column(name = "item_code", nullable = true)
	private String itemCode;

	@Column(name = "po_no", nullable = true)
	@Size(max = 50)
	private String poNo;

	@Column(name = "total_kg", nullable = true)
	@Size(max = 50)
	private String totalKG;

	@Column(name = "quantity", precision = 18, scale = 4, nullable = true)
	private BigDecimal quantity;

	@Column(name = "pieces", nullable = true)
	private Integer pieces;

	@Column(name = "status", nullable = true)
	@Size(max = 50)
	private String status;

	@Column(name = "date", nullable = true)
	@Temporal(TemporalType.TIMESTAMP)
	private Date date;

	@Column(name = "Quantity_Wt", precision = 18, scale = 4, nullable = true)
	private BigDecimal quantityWT;

	@Column(name = "QTY_UPDATE_FLAG", nullable = true)
	@Size(max=1)
	private String qtyUpdateFlag;

	@Column(name = "BARCODE_USER_ID", nullable = true)
	@Size(max = 20)
	private String barCodeUserId;

	
	@Column(name = "BARCODE_GEN_DATE", nullable = true)
	@Temporal(TemporalType.TIMESTAMP)
	private Date barCodeGenDate;

	@Column(name = "MRN_RECEIVE_QTY", precision = 18, scale = 4, nullable = true)
	private BigDecimal mrnReceiveQty;

	@Column(name = "MRN_UPDATE_FLAG", nullable = true)
	private Integer mrnUpdateFlag;

	@Column(name = "TYPE", nullable = true)
	private Integer type;

	@Column(name = "MANUAL_ISSUE_FLAG", nullable = true)
	@Size(max=1)
	private String manualIssueFlag;

	/**
	 * @return the docNo
	 */
	public int getDocNo() {
		return docNo;
	}

	/**
	 * @param docNo
	 *            the docNo to set
	 */
	public void setDocNo(int docNo) {
		this.docNo = docNo;
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
	 * @return the vendorNo
	 */
	public String getVendorNo() {
		return vendorNo;
	}

	/**
	 * @param vendorNo
	 *            the vendorNo to set
	 */
	public void setVendorNo(String vendorNo) {
		this.vendorNo = vendorNo;
	}

	/**
	 * @return the itemDesc
	 */
	public String getItemDesc() {
		return itemDesc;
	}

	/**
	 * @param itemDesc
	 *            the itemDesc to set
	 */
	public void setItemDesc(String itemDesc) {
		this.itemDesc = itemDesc;
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
	 * @return the itemCode
	 */
	public String getItemCode() {
		return itemCode;
	}

	/**
	 * @param itemCode
	 *            the itemCode to set
	 */
	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	/**
	 * @return the poNo
	 */
	public String getPoNo() {
		return poNo;
	}

	/**
	 * @param poNo
	 *            the poNo to set
	 */
	public void setPoNo(String poNo) {
		this.poNo = poNo;
	}

	/**
	 * @return the totalKG
	 */
	public String getTotalKG() {
		return totalKG;
	}

	/**
	 * @param totalKG
	 *            the totalKG to set
	 */
	public void setTotalKG(String totalKG) {
		this.totalKG = totalKG;
	}

	/**
	 * @return the quantity
	 */
	public BigDecimal getQuantity() {
		return quantity;
	}

	/**
	 * @param quantity
	 *            the quantity to set
	 */
	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}

	/**
	 * @return the pieces
	 */
	public Integer getPieces() {
		return pieces;
	}

	/**
	 * @param pieces
	 *            the pieces to set
	 */
	public void setPieces(Integer pieces) {
		this.pieces = pieces;
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
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * @param date
	 *            the date to set
	 */
	public void setDate(Date date) {
		this.date = date;
	}

	/**
	 * @return the quantityWT
	 */
	public BigDecimal getQuantityWT() {
		return quantityWT;
	}

	/**
	 * @param quantityWT
	 *            the quantityWT to set
	 */
	public void setQuantityWT(BigDecimal quantityWT) {
		this.quantityWT = quantityWT;
	}

	/**
	 * @return the qtyUpdateFlag
	 */
	public String getQtyUpdateFlag() {
		return qtyUpdateFlag;
	}

	/**
	 * @param qtyUpdateFlag
	 *            the qtyUpdateFlag to set
	 */
	public void setQtyUpdateFlag(String qtyUpdateFlag) {
		this.qtyUpdateFlag = qtyUpdateFlag;
	}

	/**
	 * @return the barCodeUserId
	 */
	public String getBarCodeUserId() {
		return barCodeUserId;
	}

	/**
	 * @param barCodeUserId
	 *            the barCodeUserId to set
	 */
	public void setBarCodeUserId(String barCodeUserId) {
		this.barCodeUserId = barCodeUserId;
	}

	/**
	 * @return the barCodeGenDate
	 */
	public Date getBarCodeGenDate() {
		return barCodeGenDate;
	}

	/**
	 * @param barCodeGenDate
	 *            the barCodeGenDate to set
	 */
	public void setBarCodeGenDate(Date barCodeGenDate) {
		this.barCodeGenDate = barCodeGenDate;
	}

	/**
	 * @return the mrnReceiveQty
	 */
	public BigDecimal getMrnReceiveQty() {
		return mrnReceiveQty;
	}

	/**
	 * @param mrnReceiveQty
	 *            the mrnReceiveQty to set
	 */
	public void setMrnReceiveQty(BigDecimal mrnReceiveQty) {
		this.mrnReceiveQty = mrnReceiveQty;
	}

	/**
	 * @return the mrnUpdateFlag
	 */
	public Integer getMrnUpdateFlag() {
		return mrnUpdateFlag;
	}

	/**
	 * @param mrnUpdateFlag
	 *            the mrnUpdateFlag to set
	 */
	public void setMrnUpdateFlag(Integer mrnUpdateFlag) {
		this.mrnUpdateFlag = mrnUpdateFlag;
	}

	/**
	 * @return the type
	 */
	public int getType() {
		return type;
	}

	/**
	 * @param type
	 *            the type to set
	 */
	public void setType(int type) {
		this.type = type;
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

	@Override
	public String toString() {
		return "barCodeCutting [Docno=" + docNo 
				+ ", GrnNo=" + grnNo 
				+ ", vendorNo=" + vendorNo 
				+ ", itemDesc=" + itemDesc 
				+ ", lineNo=" + lineNo 
				+ ", itemCode=" + itemCode 
				+ ", poNo=" + poNo 
				+ ", totalKG=" + totalKG
				+ ", quantity=" + quantity 
				+ ", pieces=" + pieces 
				+ ", status=" + status 
				+ ", date=" + date
				+ ", quantityWT=" + quantityWT 
				+ ", qtyUpdateFlag=" + qtyUpdateFlag 
				+ ", barCodeUserId=" + barCodeUserId
				+ ", barCodeGenDate=" + barCodeGenDate 
				+ ", mrnReceiveQty=" + mrnReceiveQty 
				+ ", mrnUpdateFlag=" + mrnUpdateFlag 
				+ ", type=" + type 
				+ ", manualIssueFlag=" + manualIssueFlag + "]";
	}
}
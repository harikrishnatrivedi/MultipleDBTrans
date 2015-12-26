package org.qrbarcode.model.nav;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "[Dee Development Engineers Ltd_$MRN Issue]")
public class MRNIssue {
	@Id
	@Column(name = "[Entry No_]")
	private int entryNo;

	@Column(name = "[Item No_]", nullable = false)
	@Size(max = 20)
	private String itemNo;

	@Column(name = "[GE No_]", nullable = false)
	@Size(max = 20)
	private String geNo;

	@Column(name = "[No of Pcs]", nullable = false)
	private int noOdPcs;

	@Column(name = "[IM Line No]", nullable = false)
	private int imLineNo;

	@Column(name = "[Qty M]", precision = 38, scale = 20, nullable = false)
	private BigDecimal qtyM;

	@Column(name = "[Qty Kg]", precision = 38, scale = 20, nullable = false)
	private BigDecimal qtyKg;

	@Column(name = "[PO No]", nullable = false)
	@Size(max = 20)
	private String poNo;

	@Column(name = "Posted", nullable = false)
	private short posted;

	@Column(name = "Type", nullable = false)
	private int type;

	@Column(name = "[Barcode Update Qty]", precision = 38, scale = 20, nullable = false)
	private BigDecimal barcodeUpdateQty;

	@Column(name = "[FA Scanned]", nullable = false)
	private short faScanned;

	@Column(name = "[Control No_]", nullable = false)
	@Size(max = 20)
	private String controlNo;

	@Column(name = "[Heat No_]", nullable = false)
	@Size(max = 20)
	private String heatNo;

	@Column(name = "[Document Type]", nullable = false)
	private int documentType;

	@Column(name = "[FGS Transfered]", nullable = false)
	private short fgsTransfered;

	/**
	 * @return the entryNo
	 */
	public int getEntryNo() {
		return entryNo;
	}

	/**
	 * @param entryNo
	 *            the entryNo to set
	 */
	public void setEntryNo(int entryNo) {
		this.entryNo = entryNo;
	}

	/**
	 * @return the itemNo
	 */
	public String getItemNo() {
		return itemNo;
	}

	/**
	 * @param itemNo
	 *            the itemNo to set
	 */
	public void setItemNo(String itemNo) {
		this.itemNo = itemNo;
	}

	/**
	 * @return the geNo
	 */
	public String getGeNo() {
		return geNo;
	}

	/**
	 * @param geNo
	 *            the geNo to set
	 */
	public void setGeNo(String geNo) {
		this.geNo = geNo;
	}

	/**
	 * @return the noOdPcs
	 */
	public int getNoOdPcs() {
		return noOdPcs;
	}

	/**
	 * @param noOdPcs
	 *            the noOdPcs to set
	 */
	public void setNoOdPcs(int noOdPcs) {
		this.noOdPcs = noOdPcs;
	}

	/**
	 * @return the imLineNo
	 */
	public int getImLineNo() {
		return imLineNo;
	}

	/**
	 * @param imLineNo
	 *            the imLineNo to set
	 */
	public void setImLineNo(int imLineNo) {
		this.imLineNo = imLineNo;
	}

	/**
	 * @return the qtyM
	 */
	public BigDecimal getQtyM() {
		return qtyM;
	}

	/**
	 * @param qtyM
	 *            the qtyM to set
	 */
	public void setQtyM(BigDecimal qtyM) {
		this.qtyM = qtyM;
	}

	/**
	 * @return the qtyKg
	 */
	public BigDecimal getQtyKg() {
		return qtyKg;
	}

	/**
	 * @param qtyKg
	 *            the qtyKg to set
	 */
	public void setQtyKg(BigDecimal qtyKg) {
		this.qtyKg = qtyKg;
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
	 * @return the posted
	 */
	public short getPosted() {
		return posted;
	}

	/**
	 * @param posted
	 *            the posted to set
	 */
	public void setPosted(short posted) {
		this.posted = posted;
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
	 * @return the barcodeUpdateQty
	 */
	public BigDecimal getBarcodeUpdateQty() {
		return barcodeUpdateQty;
	}

	/**
	 * @param barcodeUpdateQty
	 *            the barcodeUpdateQty to set
	 */
	public void setBarcodeUpdateQty(BigDecimal barcodeUpdateQty) {
		this.barcodeUpdateQty = barcodeUpdateQty;
	}

	/**
	 * @return the faScanned
	 */
	public short getFaScanned() {
		return faScanned;
	}

	/**
	 * @param faScanned
	 *            the faScanned to set
	 */
	public void setFaScanned(short faScanned) {
		this.faScanned = faScanned;
	}

	/**
	 * @return the controlNo
	 */
	public String getControlNo() {
		return controlNo;
	}

	/**
	 * @param controlNo
	 *            the controlNo to set
	 */
	public void setControlNo(String controlNo) {
		this.controlNo = controlNo;
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
	 * @return the documentType
	 */
	public int getDocumentType() {
		return documentType;
	}

	/**
	 * @param documentType
	 *            the documentType to set
	 */
	public void setDocumentType(int documentType) {
		this.documentType = documentType;
	}

	/**
	 * @return the fgsTransfered
	 */
	public short getFgsTransfered() {
		return fgsTransfered;
	}

	/**
	 * @param fgsTransfered
	 *            the fgsTransfered to set
	 */
	public void setFgsTransfered(short fgsTransfered) {
		this.fgsTransfered = fgsTransfered;
	}

	public String toString() {
		return "entryNo=" + this.entryNo + ", itemNo=" + this.itemNo + ", geNo=" + this.geNo + ", noOdPcs="
				+ this.noOdPcs + ", imLineNo=" + this.imLineNo + ", qtyM=" + this.qtyM + ", qtyKg=" + this.qtyKg
				+ ", poNo=" + this.poNo + ", posted=" + this.posted + ", type=" + this.type + ", barcodeUpdateQty="
				+ this.barcodeUpdateQty + ", faScanned=" + this.faScanned + ", controlNo=" + this.controlNo
				+ ", heatNo=" + this.heatNo + ", documentType=" + this.documentType + ", fgsTransfered="
				+ this.fgsTransfered;
	}
}

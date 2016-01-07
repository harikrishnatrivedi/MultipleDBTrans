package org.qrbarcode.model.nav;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "[Dee Development Engineers Ltd_$Assign Heat_Control No_]")
public class AssignHeatControlNo {
	
	@EmbeddedId
	private ItemEntry objItemEntry;

	@Column(name = "[Control No_]", nullable = false)
	@Size(max = 20)
	private String controlNo;

	@Column(name = "[Heat No_]", nullable = false)
	@Size(max = 20)
	private String heatNo;

	@Column(name = "[Quantity]", precision = 38, scale = 20, nullable = false)
	private BigDecimal quantity;

	@Column(name = "[MRN]",  nullable = false)
	@Size(max = 20)
	private String mrn;

	@Column(name = "[Line No_]", nullable = false)
	private int lineNo;

	@Column(name = "[User Id]", nullable = false)
	@Size(max = 20)
	private String userId;

	@Column(name = "Reject", nullable = false)
	private short reject;

	@Column(name = "Remarks", nullable = false)
	private int type;

	
	
	/**
	 * @return the objItemEntry
	 */
	public ItemEntry getObjItemEntry() {
		return objItemEntry;
	}


	/**
	 * @param objItemEntry the objItemEntry to set
	 */
	public void setObjItemEntry(ItemEntry objItemEntry) {
		this.objItemEntry = objItemEntry;
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
	 * @return the quantity
	 */
	public BigDecimal getQuantity() {
		return quantity;
	}


	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}


	/**
	 * @return the mrn
	 */
	public String getMrn() {
		return mrn;
	}


	/**
	 * @param mrn the mrn to set
	 */
	public void setMrn(String mrn) {
		this.mrn = mrn;
	}


	/**
	 * @return the lineNo
	 */
	public int getLineNo() {
		return lineNo;
	}


	/**
	 * @param lineNo the lineNo to set
	 */
	public void setLineNo(int lineNo) {
		this.lineNo = lineNo;
	}


	/**
	 * @return the userId
	 */
	public String getUserId() {
		return userId;
	}


	/**
	 * @param userId the userId to set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}


	/**
	 * @return the reject
	 */
	public short getReject() {
		return reject;
	}


	/**
	 * @param reject the reject to set
	 */
	public void setReject(short reject) {
		this.reject = reject;
	}


	/**
	 * @return the type
	 */
	public int getType() {
		return type;
	}


	/**
	 * @param type the type to set
	 */
	public void setType(int type) {
		this.type = type;
	}


	public String toString() {
		return "";
	}
}
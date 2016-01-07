package org.qrbarcode.model.nav;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.Size;

@Embeddable
public class ItemEntry implements Serializable {
	
	
	@Column(name = "[Item No_]")
	@Size(max = 20)
	private String itemNo;
	
	@Column(name = "[Entry No_]")
	private int entryNo;

	/**
	 * @return the itemNo
	 */
	public String getItemNo() {
		return itemNo;
	}

	/**
	 * @param itemNo the itemNo to set
	 */
	public void setItemNo(String itemNo) {
		this.itemNo = itemNo;
	}

	/**
	 * @return the entryNo
	 */
	public int getEntryNo() {
		return entryNo;
	}

	/**
	 * @param entryNo the entryNo to set
	 */
	public void setEntryNo(int entryNo) {
		this.entryNo = entryNo;
	}

	
	
}
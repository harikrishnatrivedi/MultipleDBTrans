/**
 * 
 */
package org.qrbarcode.model;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Entity;
import javax.persistence.Transient;

/**
 * @author harikrishna.trivedi
 *
 */
 

public class UpdateLength implements Serializable{
 
	@Transient
    private String barCode;
 
	@Transient
	private BigDecimal oldLength;
	
	@Transient
    private String item;
    
	@Transient
    private String itemDesc;
    
	@Transient
    private BigDecimal length;

    /**
	 * @return the barCode
	 */
	public String getBarCode() {
		return barCode;
	}

	/**
	 * @param barCode the barCode to set
	 */
	public void setBarCode(String barCode) {
		this.barCode = barCode;
	}

	/**
	 * @return the item
	 */
	public String getItem() {
		return item;
	}

	/**
	 * @param item the item to set
	 */
	public void setItem(String item) {
		this.item = item;
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
	 * @return the length
	 */
	public BigDecimal getLength() {
		return length;
	}

	/**
	 * @param length the length to set
	 */
	public void setLength(BigDecimal length) {
		this.length = length;
	}

	
	/**
	 * @return the oldLength
	 */
	public BigDecimal getOldLength() {
		return oldLength;
	}

	/**
	 * @param oldLength the oldLength to set
	 */
	public void setOldLength(BigDecimal oldLength) {
		this.oldLength = oldLength;
	}

	@Override
    public String toString() {
        return "UpdateLength [barCode=" + barCode  + ", item=" + item + ", itemDesc=" + itemDesc +", length=" + length + ", oldLength=" + oldLength + "]";
    }
}
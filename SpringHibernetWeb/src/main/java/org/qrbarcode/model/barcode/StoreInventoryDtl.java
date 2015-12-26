/**
 * 
 */
package org.qrbarcode.model.barcode;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;


/**
 * @author harikrishna.trivedi
 *
 */
 
@Entity
@Table(name="STORE_INVENTORY_DTL")
public class StoreInventoryDtl {
 
    @Id
    @Size(max=20)
    @NotBlank
    @Column(name = "BARCODE")
    private String barCode;
 
    @Size(max=20)
    @NotBlank
    @Column(name = "ITEM", nullable = false)
    private String item;
    
    @Size(max=20)
    @NotBlank
    @Column(name = "SIDCODE", nullable = false)
    private String sidCode;
    
    @Size(max=20)
    @NotBlank
    @Column(name = "CONTROL", nullable = false)
    private String control;

    @Size(max=20)
    @NotBlank
    @Column(name = "HEAT", nullable = false)
    private String heat;
    
    @Column(name = "[QTY/PC]", nullable = false)
    @Digits(integer=15, fraction=3)
    private BigDecimal qtyPc;
    
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
	 * @return the sidCode
	 */
	public String getSidCode() {
		return sidCode;
	}

	/**
	 * @param sidCode the sidCode to set
	 */
	public void setSidCode(String sidCode) {
		this.sidCode = sidCode;
	}

	/**
	 * @return the control
	 */
	public String getControl() {
		return control;
	}

	/**
	 * @param control the control to set
	 */
	public void setControl(String control) {
		this.control = control;
	}

	/**
	 * @return the heat
	 */
	public String getHeat() {
		return heat;
	}

	/**
	 * @param heat the heat to set
	 */
	public void setHeat(String heat) {
		this.heat = heat;
	}

	/**
	 * @return the qtyPc
	 */
	public BigDecimal getQtyPc() {
		return qtyPc;
	}

	/**
	 * @param qtyPc the qtyPc to set
	 */
	public void setQtyPc(BigDecimal qtyPc) {
		this.qtyPc = qtyPc;
	}

	@Override
    public String toString() {
        return "StoreInventoryDtl [barCode=" + barCode  + ", item=" + item + ", sidCode=" + sidCode +", control=" + control +", heat=" + heat + ", qtyPc=" + qtyPc +"]";
    }
}
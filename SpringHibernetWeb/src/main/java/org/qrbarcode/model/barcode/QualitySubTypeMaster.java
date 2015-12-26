/**
 * 
 */
package org.qrbarcode.model.barcode;

import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;

/**
 * @author harikrishna.trivedi
 *
 */

@Entity @Table(name="QUALITY_SUB_TYPE_MST")
public class QualitySubTypeMaster {

	@Column(name = "SL_NO", nullable = false)
	private Integer slNo;

	@Id
	@Size(max = 15)
    @Column(name = "QTY_SUB_TYPE_CODE", nullable = false)
	private String qtySubTypeCode;

	@Size(max = 50)
	@Column(name = "QTY_SUB_TYPE_NAME", nullable = false)
	private String qtySubTypeName;

	@Size(max = 15)
	@Column(name = "QTY_TYPE_CODE", nullable = true)
	private String qtyTypeCode;

	@Size(max = 50)
	@Column(name = "QTY_TYPE_NAME", nullable = true)
	private String qtyTypeName;

	@Size(max = 50)
	@Column(name = "QTY_SUB_TYPE_USER_CODE", nullable = false)
	private String qtySubTypeUserCode;

	@Size(max = 1)
	@Column(name = "QTY_SUB_TYPE_STATUS", nullable = false)
	private String qtySubTypeStatus;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "QTY_SUB_TYPE_DATE", nullable = true)
	private Date qtySubTypeDate;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "QTY_SUB_TYPE_LAST_UPDATED_DATE", nullable = true)
	private Date qtySubTypeLastUpdatedDate;

	@OneToMany(mappedBy="QUALITY_TEST")
	private Set<QualityTest> lstObjQualityTest;
	
	@Override
	public String toString() {
		return "barCodeCutting [slNo=" + slNo 
				+ ", qtySubTypeCode=" + qtySubTypeCode 
				+ ", qtySubTypeName=" + qtySubTypeName 
				+ ", qtySubTypeUserCode=" + qtySubTypeUserCode
				+ ", qtySubTypeStatus=" + qtySubTypeStatus 
				+ ", qtySubTypeDate=" + qtySubTypeDate 
				+ ", qtySubTypeLastUpdatedDate=" + qtySubTypeLastUpdatedDate 
				+ "]";
	}
}
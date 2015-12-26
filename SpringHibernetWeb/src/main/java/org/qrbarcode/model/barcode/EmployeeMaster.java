/**
 * 
 */
package org.qrbarcode.model.barcode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;
import org.joda.time.DateTime;

/**
 * @author harikrishna.trivedi
 *
 */

@Entity
@Table(name = "EMPLOYEE_MASTER")
public class EmployeeMaster {

	@Id
	@Column(name = "EMP_CD", nullable = false)
	@Size(max = 12)
	@NotBlank
	private String empCD;

	@Size(max = 50)
	@Column(name = "EMP_NAME", nullable = true)
	private String empName;

	@Size(max = 30)
	@NotBlank
	@Column(name = "EMP_LOGIN_NAME", nullable = false)
	private String empLoginName;

	@Size(max = 100)
	@NotBlank
	@Column(name = "EMP_PWD", nullable = false)
	private String empPWD;

	@Size(max = 50)
	@Column(name = "EMP_SALUTATION", nullable = true)
	private String empSalutation;

	@Column(name = "EMP_GENDER", nullable = true)
	@Size(max = 1)
	private String empGender;

	@Column(name = "EMP_GROUP_CD", nullable = true)
	@Size(max = 5)
	private String empGroupCD;

	@Column(name = "EMP_MAKER_DT", nullable = true)
	private DateTime empMakerDT;

	@Column(name = "EMP_STATUS", nullable = true)
	@Size(max = 1)
	private String empStatus;

	@Column(name = "EMP_LOCATION", nullable = true)
	@Size(max = 30)
	private String empLocation;

	@Column(name = "EMP_NAV_ID", nullable = true)
	@Size(max = 30)
	private int empNavId;

	@Column(name = "LOCATION", nullable = true)
	@Size(max = 50)
	private String location;

	/**
	 * @return the empCD
	 */
	public String getEmpCD() {
		return empCD;
	}

	/**
	 * @param empCD
	 *            the empCD to set
	 */
	public void setEmpCD(String empCD) {
		this.empCD = empCD;
	}

	/**
	 * @return the empName
	 */
	public String getEmpName() {
		return empName;
	}

	/**
	 * @param empName
	 *            the empName to set
	 */
	public void setEmpName(String empName) {
		this.empName = empName;
	}

	/**
	 * @return the empLoginName
	 */
	public String getEmpLoginName() {
		return empLoginName;
	}

	/**
	 * @param empLoginName
	 *            the empLoginName to set
	 */
	public void setEmpLoginName(String empLoginName) {
		this.empLoginName = empLoginName;
	}

	/**
	 * @return the empPWD
	 */
	public String getEmpPWD() {
		return empPWD;
	}

	/**
	 * @param empPWD
	 *            the empPWD to set
	 */
	public void setEmpPWD(String empPWD) {
		this.empPWD = empPWD;
	}

	/**
	 * @return the empSalutation
	 */
	public String getEmpSalutation() {
		return empSalutation;
	}

	/**
	 * @param empSalutation
	 *            the empSalutation to set
	 */
	public void setEmpSalutation(String empSalutation) {
		this.empSalutation = empSalutation;
	}

	/**
	 * @return the empGender
	 */
	public String getEmpGender() {
		return empGender;
	}

	/**
	 * @param empGender
	 *            the empGender to set
	 */
	public void setEmpGender(String empGender) {
		this.empGender = empGender;
	}

	/**
	 * @return the empGroupCD
	 */
	public String getEmpGroupCD() {
		return empGroupCD;
	}

	/**
	 * @param empGroupCD
	 *            the empGroupCD to set
	 */
	public void setEmpGroupCD(String empGroupCD) {
		this.empGroupCD = empGroupCD;
	}

	/**
	 * @return the empMakerDT
	 */
	public DateTime getEmpMakerDT() {
		return empMakerDT;
	}

	/**
	 * @param empMakerDT
	 *            the empMakerDT to set
	 */
	public void setEmpMakerDT(DateTime empMakerDT) {
		this.empMakerDT = empMakerDT;
	}

	/**
	 * @return the empStatus
	 */
	public String getEmpStatus() {
		return empStatus;
	}

	/**
	 * @param empStatus
	 *            the empStatus to set
	 */
	public void setEmpStatus(String empStatus) {
		this.empStatus = empStatus;
	}

	/**
	 * @return the empLocation
	 */
	public String getEmpLocation() {
		return empLocation;
	}

	/**
	 * @param empLocation
	 *            the empLocation to set
	 */
	public void setEmpLocation(String empLocation) {
		this.empLocation = empLocation;
	}

	/**
	 * @return the empNavId
	 */
	public int getEmpNavId() {
		return empNavId;
	}

	/**
	 * @param empNavId
	 *            the empNavId to set
	 */
	public void setEmpNavId(int empNavId) {
		this.empNavId = empNavId;
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

	@Override
	public String toString() {
		return "barCodeCutting [empCD=" + empCD 
				+ ", empName=" + empName 
				+ ", empLoginName=" + empLoginName
				+ ", empPWD=" + empPWD
				+ ", empSalutation=" + empSalutation 
				+ ", empGender=" + empGender
				+ ", empGroupCD=" + empGroupCD
				+ ", empMakerDT=" + empMakerDT
				+ ", empStatus=" + empStatus
				+ ", empLocation=" + empLocation
				+ ", empNavId=" + empNavId 
				+ ", location=" + location + "]";
	}
}

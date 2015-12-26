package org.qrbarcode.model.nav;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;




@Entity
@Table(name = "[User]")
public class User {
	@Id
	@Column(name = "[User ID]")
	@Size(max=20)
	private String userId;

	@Column(name = "[Name]", nullable = false)
	@Size(max = 50)
	private String name;

	
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
	 * @return the name
	 */
	public String getName() {
		return name;
	}


	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}


	public String toString() {
		return "userId=" + this.userId + ", name=" + this.name;
	}
}

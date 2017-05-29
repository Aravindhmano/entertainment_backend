package com.niit.entertainment_backend.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;


@Entity
@Table(name="UserDetails",uniqueConstraints = {
		@UniqueConstraint(columnNames = "user_Id"),
		@UniqueConstraint(columnNames = "user_MailId") })
public class Usermodel implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="user_Id")
	private Integer userId;
	@Column(name="user_MailId")
	private String userMailId;
	@Column(name="user_FirstName")
	private String userFirstName;
	@Column(name="user_LastName")
	private String userLastName;
	@Column(name="user_Password")
	private String userPassword;
	@Column(name="user_Cart_Id")
	private Integer userCartId;
	@Column(name="user_Orders")
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "orderUserDetails")
	private Set<Ordersmodel> userOrders = new HashSet<Ordersmodel>(0);
	@Column(name="user_Role")
	private String userRole;
	
	public Usermodel()
	{
		
	}

	public Usermodel(Integer userId, String userMailId, String userFirstName, String userLastName, String userPassword,
			Integer userCartId, Set<Ordersmodel> userOrders, String userRole) {
		super();
		this.userId = userId;
		this.userMailId = userMailId;
		this.userFirstName = userFirstName;
		this.userLastName = userLastName;
		this.userPassword = userPassword;
		this.userCartId = userCartId;
		this.userOrders = userOrders;
		this.userRole = userRole;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserMailId() {
		return userMailId;
	}

	public void setUserMailId(String userMailId) {
		this.userMailId = userMailId;
	}

	public String getUserFirstName() {
		return userFirstName;
	}

	public void setUserFirstName(String userFirstName) {
		this.userFirstName = userFirstName;
	}

	public String getUserLastName() {
		return userLastName;
	}

	public void setUserLastName(String userLastName) {
		this.userLastName = userLastName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public Integer getUserCartId() {
		return userCartId;
	}

	public void setUserCartId(Integer userCartId) {
		this.userCartId = userCartId;
	}

	public Set<Ordersmodel> getUserOrders() {
		return userOrders;
	}

	public void setUserOrders(Set<Ordersmodel> userOrders) {
		this.userOrders = userOrders;
	}

	public String getUserRole() {
		return userRole;
	}

	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}
	

}

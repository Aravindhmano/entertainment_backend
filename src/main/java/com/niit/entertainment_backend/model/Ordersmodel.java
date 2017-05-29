package com.niit.entertainment_backend.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name="OrderDetails",uniqueConstraints = {
		@UniqueConstraint(columnNames = "order_Id")})
public class Ordersmodel implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="order_Id")
	private Integer orderId;
	@Column(name="order_User_Id")
	private String orderUserId;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="userId")
	private Usermodel orderUserDetails;
	@Column(name="order_Payment")
	private String orderPayment;
	@Column(name="order_Total")
	private double orderTotal;
	
	public Ordersmodel()
	{
		
	}

	public Ordersmodel(Integer orderId, String orderUserId, Usermodel orderUserDetails, String orderPayment,
			double orderTotal) {
		super();
		this.orderId = orderId;
		this.orderUserId = orderUserId;
		this.orderUserDetails = orderUserDetails;
		this.orderPayment = orderPayment;
		this.orderTotal = orderTotal;
	}

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public String getOrderUserId() {
		return orderUserId;
	}

	public void setOrderUserId(String orderUserId) {
		this.orderUserId = orderUserId;
	}

	public Usermodel getOrderUserDetails() {
		return orderUserDetails;
	}

	public void setOrderUserDetails(Usermodel orderUserDetails) {
		this.orderUserDetails = orderUserDetails;
	}

	public String getOrderPayment() {
		return orderPayment;
	}

	public void setOrderPayment(String orderPayment) {
		this.orderPayment = orderPayment;
	}

	public double getOrderTotal() {
		return orderTotal;
	}

	public void setOrderTotal(double orderTotal) {
		this.orderTotal = orderTotal;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
	
	
}
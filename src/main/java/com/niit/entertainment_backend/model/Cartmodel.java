package com.niit.entertainment_backend.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name="CartDetails",uniqueConstraints = {
		@UniqueConstraint(columnNames = "cart_Id")})
public class Cartmodel implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="cart_Id")
	private Integer cartId;
	@Column(name="cart_Supplier_Id")
	private Integer cartSupplierId;
	@Column(name="cart_Product_Id")
	private Integer cartProductId;
	@OneToOne(fetch =FetchType.LAZY)
	@JoinColumn(name="UserId")
	private Usermodel cartUserDetails;
	@Column(name="cart_Price")
	private int cartPrice;
	@Column(name="cart_Quantity")
	private int cartQuantity;
	@Column(name="cart_Status")
	private String cartStatus;
	
	public Cartmodel()
	{
		super();
	}

	public Cartmodel(Integer cartId, Integer cartSupplierId, Integer cartProductId, Usermodel cartUserDetails,
			int cartPrice, int cartQuantity, String cartStatus) {
		super();
		this.cartId = cartId;
		this.cartSupplierId = cartSupplierId;
		this.cartProductId = cartProductId;
		this.cartUserDetails = cartUserDetails;
		this.cartPrice = cartPrice;
		this.cartQuantity = cartQuantity;
		this.cartStatus = cartStatus;
	}

	public Integer getCartId() {
		return cartId;
	}

	public void setCartId(Integer cartId) {
		this.cartId = cartId;
	}

	public Integer getCartSupplierId() {
		return cartSupplierId;
	}

	public void setCartSupplierId(Integer cartSupplierId) {
		this.cartSupplierId = cartSupplierId;
	}

	public Integer getCartProductId() {
		return cartProductId;
	}

	public void setCartProductId(Integer cartProductId) {
		this.cartProductId = cartProductId;
	}

	public Usermodel getCartUserDetails() {
		return cartUserDetails;
	}

	public void setCartUserDetails(Usermodel cartUserDetails) {
		this.cartUserDetails = cartUserDetails;
	}

	public int getCartPrice() {
		return cartPrice;
	}

	public void setCartPrice(int cartPrice) {
		this.cartPrice = cartPrice;
	}

	public int getCartQuantity() {
		return cartQuantity;
	}

	public void setCartQuantity(int cartQuantity) {
		this.cartQuantity = cartQuantity;
	}

	public String getCartStatus() {
		return cartStatus;
	}

	public void setCartStatus(String cartStatus) {
		this.cartStatus = cartStatus;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	
}

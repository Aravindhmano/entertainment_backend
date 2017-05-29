package com.niit.entertainment_backend.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="ProductDetails",uniqueConstraints = {
		@UniqueConstraint(columnNames = "prod_Id")})
public class Telemodel implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="prod_Id")
	private String prodId;
	@Column(name="prod_Brand")
	private String prodBrand;
	@Column(name="prod_Name")
	private String prodName;
	@Column(name="prod_Description")
	private String prodDescription;
	@Column(name="prod_Price")
	private int prodPrice;
	@Column(name="prod_Quantity")
	private int prodQuantity;
	@ManyToOne
	@JoinColumn(name="category_Id")
	private Categorymodel prodCategory;
	@ManyToOne
	@JoinColumn(name="SupplierId")
	private Suppliermodel prodSupplier;
	
	public Telemodel()
	{
		
	}

	public Telemodel(String prodId, String prodBrand, String prodName, String prodDescription, int prodPrice,
			int prodQuantity, Categorymodel prodCategory, Suppliermodel prodSupplier) {
		super();
		this.prodId = prodId;
		this.prodBrand = prodBrand;
		this.prodName = prodName;
		this.prodDescription = prodDescription;
		this.prodPrice = prodPrice;
		this.prodQuantity = prodQuantity;
		this.prodCategory = prodCategory;
		this.prodSupplier = prodSupplier;
	}

	public String getProdId() {
		return prodId;
	}

	public void setProdId(String prodId) {
		this.prodId = prodId;
	}

	public String getProdBrand() {
		return prodBrand;
	}

	public void setProdBrand(String prodBrand) {
		this.prodBrand = prodBrand;
	}

	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public String getProdDescription() {
		return prodDescription;
	}

	public void setProdDescription(String prodDescription) {
		this.prodDescription = prodDescription;
	}

	public int getProdPrice() {
		return prodPrice;
	}

	public void setProdPrice(int prodPrice) {
		this.prodPrice = prodPrice;
	}

	public int getProdQuantity() {
		return prodQuantity;
	}

	public void setProdQuantity(int prodQuantity) {
		this.prodQuantity = prodQuantity;
	}

	public Categorymodel getProdCategory() {
		return prodCategory;
	}

	public void setProdCategory(Categorymodel prodCategory) {
		this.prodCategory = prodCategory;
	}

	public Suppliermodel getProdSupplier() {
		return prodSupplier;
	}

	public void setProdSupplier(Suppliermodel prodSupplier) {
		this.prodSupplier = prodSupplier;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
	
	
}
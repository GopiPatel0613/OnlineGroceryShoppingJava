package com.example.Online._Grocery_Shopping.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cart")
public class Cart {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long cId;
	private int quantity;
	private String userEmail;
	private Long productId;
	private String productName;
	private String productPhoto;
	private double productPrice;
	private double productTotal;
	
	public Long getcId() {
		return cId;
	}
	public void setcId(Long cId) {
		this.cId = cId;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public Long getProductId() {
		return productId;
	}
	public void setProductId(Long productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductPhoto() {
		return productPhoto;
	}
	public void setProductPhoto(String productPhoto) {
		this.productPhoto = productPhoto;
	}
	public double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	public double getProductTotal() {
		return productTotal;
	}
	public void setProductTotal(double productTotal) {
		this.productTotal = this.productPrice * this.quantity;
	}
	public Cart(Long cId, int quantity, String userEmail, Long productId, String productName, String productPhoto,
			double productPrice, double productTotal) {
		super();
		this.cId = cId;
		this.quantity = quantity;
		this.userEmail = userEmail;
		this.productId = productId;
		this.productName = productName;
		this.productPhoto = productPhoto;
		this.productPrice = productPrice;
		this.productTotal = productTotal;
	}
	public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}

	

}
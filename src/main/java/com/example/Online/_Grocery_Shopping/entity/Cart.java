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
	public Cart(Long cId, int quantity, String userEmail, Long productId) {
		super();
		this.cId = cId;
		this.quantity = quantity;
		this.userEmail = userEmail;
		this.productId = productId;
	}
	public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
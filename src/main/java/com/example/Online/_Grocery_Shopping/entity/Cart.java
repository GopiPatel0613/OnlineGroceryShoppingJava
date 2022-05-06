package com.example.Online._Grocery_Shopping.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "cart")
public class Cart {
	@Id
	@Column(name ="c_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long cId;
	
	
	public List<Products> getCart() {
		return this.cart;
	}

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "cart_id")
    private List<Products> cart;

	


	public Long getcId() {
		return cId;
	}
	
	
	
	public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
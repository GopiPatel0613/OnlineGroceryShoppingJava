package com.example.Online._Grocery_Shopping.entity;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Online._Grocery_Shopping.repository.ProductsRepository;

@Service
public class ProductsServices {

	@Autowired
	private ProductsRepository productsRepository;

	public void saveProducts(Products products) {
		productsRepository.save(products);

	}

	public List<Products> findAllProducts() {
		return productsRepository.findAll();

	}

}

package com.example.Online._Grocery_Shopping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.Online._Grocery_Shopping.entity.Products;
import com.example.Online._Grocery_Shopping.entity.ProductsServices;

@CrossOrigin(origins = "*")
@RestController
public class ProductsController {

	@Autowired
	ProductsServices productsService;

	@RequestMapping(value = "/saveProducts", method = RequestMethod.POST)
	public ResponseEntity<Products> saveProducts(@RequestBody Products Products) {

		productsService.saveProducts(Products);
		return new ResponseEntity<>(Products, HttpStatus.OK);
	}

	@RequestMapping(value = "/getProducts", method = RequestMethod.GET)
	public ResponseEntity<List<Products>> findAllProducts() {

		List<Products> prod = productsService.findAllProducts();
		return new ResponseEntity<>(prod, HttpStatus.OK);

	}
	
}
package com.example.Online._Grocery_Shopping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.Online._Grocery_Shopping.entity.Cart;
import com.example.Online._Grocery_Shopping.entity.CartServices;

@CrossOrigin(origins = "*")
@RestController
public class CartController {

	@Autowired
	CartServices cartSer;


	@RequestMapping(value = "/saveCart", method = RequestMethod.POST)
	public ResponseEntity<Cart> saveProducts(@RequestBody Cart products) {

		cartSer.saveCart(products);
		return new ResponseEntity<>(products, HttpStatus.OK);
	}

	@RequestMapping(value = "/getCart", method = RequestMethod.GET)
	public ResponseEntity<List<Cart>> findAllProductsByEmail(@RequestParam String email) {

		List<Cart> prod = cartSer.findAllCartsByEmail(email);
		return new ResponseEntity<>(prod, HttpStatus.OK);

	}
	
	@RequestMapping(value = "/getCartTotal", method = RequestMethod.GET)
	public ResponseEntity<Double> sumCartTotal(@RequestParam String email) {

		List<Cart> prod = cartSer.findAllCartsByEmail(email);
		Double totalResult= 0.0; 
		for(int i=0; i<prod.size();i++){
			totalResult += prod.get(i).getProductTotal();
		}
		return new ResponseEntity<>(totalResult, HttpStatus.OK);

	}
	

	@RequestMapping(value = "/updateCart", method = RequestMethod.PUT)
	public ResponseEntity<String> updateCart(@RequestBody List<Cart> cart) {

		cartSer.updateCart(cart);
		return new ResponseEntity<>("Success", HttpStatus.OK);
	}

	@RequestMapping(value = "/deleteCart", method = RequestMethod.DELETE)
	public ResponseEntity<String> deleteCart(String email) {

		cartSer.deleteCart(email);
		return new ResponseEntity<>("Success", HttpStatus.OK);
	}
	
	@RequestMapping(value = "/deleteCartProduct", method = RequestMethod.DELETE)
	public ResponseEntity<String> deleteCartProductById(@RequestParam Long id) {

		cartSer.deleteCartById(id);
		return new ResponseEntity<>("Success", HttpStatus.OK);
	}

}
//package com.example.Online._Grocery_Shopping.controller;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.example.Online._Grocery_Shopping.entity.Cart;
//import com.example.Online._Grocery_Shopping.entity.CartServices;
//import com.example.Online._Grocery_Shopping.entity.User;
//import com.example.Online._Grocery_Shopping.entity.UserService;
//
//@CrossOrigin(origins = "*")
//@RestController
//public class CartController {
//
//	@Autowired
//	CartServices cartSer;
//	@Autowired
//	UserService userSer;
//
//
//	@RequestMapping(value = "/saveCart/{userId}", method = RequestMethod.POST)
//	public ResponseEntity<Cart> saveProducts(@RequestBody Cart products,@PathVariable Long userId) {
//		//User user = userSer.getUserById(userId);
//
//		//cartSer.saveCart(products,user);
//		return new ResponseEntity<>(products, HttpStatus.OK);
//	}
//
//	@RequestMapping(value = "/getCart", method = RequestMethod.GET)
//	public ResponseEntity<List<Cart>> findAllProductsByEmail(@RequestParam String email) {
//
//		List<Cart> prod = cartSer.findAllCartsByEmail(email);
//		return new ResponseEntity<>(prod, HttpStatus.OK);
//
//	}
//
//	@RequestMapping(value = "/updateCart", method = RequestMethod.PUT)
//	public ResponseEntity<String> updateCart(Cart cart) {
//
//		cartSer.updateCart(cart);
//		return new ResponseEntity<>("Success", HttpStatus.OK);
//	}
//
//	@RequestMapping(value = "/deleteCart", method = RequestMethod.DELETE)
//	public ResponseEntity<String> deleteCart(String email) {
//
//		cartSer.deleteCart(email);
//		return new ResponseEntity<>("Success", HttpStatus.OK);
//	}
//
//}
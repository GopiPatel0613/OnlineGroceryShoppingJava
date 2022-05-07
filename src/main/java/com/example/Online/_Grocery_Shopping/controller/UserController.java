package com.example.Online._Grocery_Shopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.Online._Grocery_Shopping.entity.User;
import com.example.Online._Grocery_Shopping.entity.UserService;

@CrossOrigin(origins = "*")
@RestController
public class UserController {
	@Autowired
	UserService userService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index() {
		return "index";
	}

	@RequestMapping(value = "/SaveUser", method = RequestMethod.POST)
	public ResponseEntity<User> saveUser(@RequestBody User user) {

		userService.saveUser(user);
		return new ResponseEntity<>(user, HttpStatus.OK);
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ResponseEntity<User> login(@RequestBody User user) {
		User lookupUser = userService.getUser(user.getEmail());

		if (lookupUser != null) {
			return new ResponseEntity<>(lookupUser, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);

		}

	}

	@RequestMapping(value = "/User", method = RequestMethod.GET)
	public ResponseEntity<User> User(@RequestParam String email) {

		User User = userService.getUser(email);
		return new ResponseEntity<>(User, HttpStatus.OK);
	}
}

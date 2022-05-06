package com.example.Online._Grocery_Shopping.entity;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.example.Online._Grocery_Shopping.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
  
	public void saveUser(User user) {

		userRepository.save(user);

	}

	public User getUser(String email) {
		return userRepository.findByEmail(email);

	}

	public User getUserById(Long id) {
		return userRepository.findById(id).get();

	}

	public Object getAllUser() {
		return null;
	}

}

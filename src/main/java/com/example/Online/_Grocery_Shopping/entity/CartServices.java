package com.example.Online._Grocery_Shopping.entity;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Online._Grocery_Shopping.repository.CartRepository;

@Service
public class CartServices {

	@Autowired
	private CartRepository cartRepository;

	public void saveCart(Cart products) {
		if(cartRepository.existsByProductIdAndUserEmail(products.getProductId(), products.getUserEmail())) {
			Cart foundCart = cartRepository.findByProductIdAndUserEmail(products.getProductId(), products.getUserEmail());
			foundCart.setQuantity(foundCart.getQuantity()+1);
			foundCart.setProductTotal((foundCart.getQuantity())*foundCart.getProductPrice());
			cartRepository.flush();
		}else {
			products.setProductTotal((products.getQuantity()+1)*products.getProductPrice());
			cartRepository.save(products);
		}
		

	}

	public List<Cart> findAllCartsByEmail(String email) {
		return cartRepository.findAllByUserEmail(email);

	}
	public void updateCart(Cart cart) {
		Cart foundCart = cartRepository.findByUserEmail(cart.getUserEmail());
		foundCart = cart;
		cartRepository.saveAndFlush(foundCart);
	}
	public void deleteCart(String email) {
		cartRepository.deleteByUserEmail(email);
		cartRepository.flush();
	}
	
	public void deleteCartById(Long id) {
		cartRepository.deleteById(id);
		cartRepository.flush();
	}

}

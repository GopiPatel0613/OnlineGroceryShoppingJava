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
		if (cartRepository.existsByProductIdAndUserEmail(products.getProductId(), products.getUserEmail())) {
			Cart foundCart = cartRepository.findByProductIdAndUserEmail(products.getProductId(),
					products.getUserEmail());
			foundCart.setQuantity(foundCart.getQuantity() + 1);
			foundCart.setProductTotal((foundCart.getQuantity()) * foundCart.getProductPrice());
			cartRepository.flush();
		} else {
			products.setProductTotal((products.getQuantity() + 1) * products.getProductPrice());
			cartRepository.save(products);
		}

	}

	public List<Cart> findAllCartsByEmail(String email) {
		return cartRepository.findAllByUserEmail(email);

	}

	public void updateCart(List<Cart> cart) {
		try {
			for (int i = 0; i < cart.size(); i++) {
				Cart foundCart = cartRepository.findByUserEmailAndProductId(cart.get(i).getUserEmail(),
						cart.get(i).getProductId());
				foundCart = cart.get(i);
				cartRepository.saveAndFlush(foundCart);
			}
		} catch (Exception e) {
			System.out.println("Error at updateCart method in cartServices: " + e);
		}
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

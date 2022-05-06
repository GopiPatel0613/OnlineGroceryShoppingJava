package com.example.Online._Grocery_Shopping.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.Online._Grocery_Shopping.entity.Cart;

@Repository
public interface CartRepository extends JpaRepository<Cart, Long> {

	@Query(value = "SELECT * FROM cart c where c.user_email=?1", nativeQuery = true)
	List<Cart> findAllByUserEmail(String email);

	Cart findByUserEmail(String email);
	void deleteByUserEmail(String email);
	boolean existsByProductIdAndUserEmail(int getpId, String Email);
	Cart findByProductIdAndUserEmail(int getpId, String Email);
}

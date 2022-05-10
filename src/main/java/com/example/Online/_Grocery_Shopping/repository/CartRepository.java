package com.example.Online._Grocery_Shopping.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.Online._Grocery_Shopping.entity.Cart;

@Repository
public interface CartRepository extends JpaRepository<Cart, Long> {

	@Query(value = "SELECT * FROM products p CROSS JOIN cart c ON c.product_id=p.p_id where c.user_email=?1", nativeQuery = true)
	List<Cart> findAllByUserEmail(String email);

	Cart findByUserEmailAndProductId(String email, Long id);
	void deleteByUserEmail(String email);
	boolean existsByProductIdAndUserEmail(Long getpId, String Email);
	Cart findByProductIdAndUserEmail(Long getpId, String Email);
}

package com.example.Online._Grocery_Shopping.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.Online._Grocery_Shopping.entity.Products;

@Repository
public interface ProductsRepository extends JpaRepository<Products, Long> {

	@Query(value = "SELECT * FROM products", nativeQuery = true)
	List<Products> findAll();

}

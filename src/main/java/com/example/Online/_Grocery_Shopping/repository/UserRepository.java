package com.example.Online._Grocery_Shopping.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.Online._Grocery_Shopping.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	@Query(value = "SELECT * FROM users U where u.email=?1", nativeQuery = true)
	User findByEmail(String email);

}

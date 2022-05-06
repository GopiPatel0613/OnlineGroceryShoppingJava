package com.example.Online._Grocery_Shopping;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.example.Online._Grocery_Shopping")
public class OnlineGroceryShoppingApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnlineGroceryShoppingApplication.class, args);
	}

}

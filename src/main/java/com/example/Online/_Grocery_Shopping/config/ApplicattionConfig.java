package com.example.Online._Grocery_Shopping.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages="com.example.Online._Grocery_Shopping.repository")
@EntityScan(basePackages="com.example.Online._Grocery_Shopping.entity")
public class ApplicattionConfig {
	
	

}

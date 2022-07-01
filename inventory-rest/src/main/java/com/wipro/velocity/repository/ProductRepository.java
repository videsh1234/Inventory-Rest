package com.wipro.velocity.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

import com.wipro.velocity.model.Product;

public interface ProductRepository extends MongoRepository<Product, String> {
	//Custom method to find products based on Madein field 
	List<Product> findByMadein(String madein);

}

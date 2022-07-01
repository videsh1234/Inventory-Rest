package com.wipro.velocity.repository;

import com.wipro.velocity.model.Product;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
	/*
     * This interface has save(),findAll(),findById(),deleteById(),count()
    etc.. inbuilt methods of jpa repository for various database operations.
    This interface will be implemented by class automatically
    */

}

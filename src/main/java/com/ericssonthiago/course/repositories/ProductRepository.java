package com.ericssonthiago.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ericssonthiago.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>  {
	 

}

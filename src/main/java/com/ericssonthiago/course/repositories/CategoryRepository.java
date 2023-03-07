package com.ericssonthiago.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ericssonthiago.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>  {
	 

}

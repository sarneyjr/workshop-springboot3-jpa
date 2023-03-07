package com.ericssonthiago.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ericssonthiago.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>  {
	 

}

package com.ericssonthiago.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ericssonthiago.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>  {
	 

}

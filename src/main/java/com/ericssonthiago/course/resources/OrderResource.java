package com.ericssonthiago.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ericssonthiago.course.entities.Order;
import com.ericssonthiago.course.services.OrderService;

@RestController

//setting a name to my resourse
// setting a name to my resourse called "/users"
@RequestMapping(value = "/orders")
public class OrderResource {

	//method endpoint to assess the users 
	// the return type of this method is ResponseEntities, its 
	//a specific type of springboot to return a web request responses*/
	//to indicate that this methot have the response to get request from httpn we 
	//need to put an anotaion called @GetMapping
	
	@Autowired
	private OrderService service;
	
	@GetMapping
	public ResponseEntity<List<Order>> findAll() {
		List<Order> list = service.findAll(); 
		return ResponseEntity.ok().body(list);
		
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<Order> findById(@PathVariable Long id) {
		Order obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	
	
}

package com.ericssonthiago.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ericssonthiago.course.entities.Product;
import com.ericssonthiago.course.services.ProductService;

@RestController

//setting a name to my resourse
// setting a name to my resourse called "/users"
@RequestMapping(value = "/products")
public class ProductResource {

	//method endpoint to assess the users 
	// the return type of this method is ResponseEntities, its 
	//a specific type of springboot to return a web request responses*/
	//to indicate that this methot have the response to get request from httpn we 
	//need to put an anotaion called @GetMapping
	
	@Autowired
	private ProductService service;
	
	@GetMapping
	public ResponseEntity<List<Product>> findAll() {
		List<Product> list = service.findAll(); 
		return ResponseEntity.ok().body(list);
		
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<Product> findById(@PathVariable Long id) {
		Product obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	
	
}

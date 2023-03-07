package com.ericssonthiago.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ericssonthiago.course.entities.Category;
import com.ericssonthiago.course.services.CategoryService;


@RestController

//setting a name to my resourse
// setting a name to my resourse called "/Categorys"
@RequestMapping(value = "/categories")
public class CategoryResource {

	//method endpoint to assess the Categorys 
	// the return type of this method is ResponseEntities, its 
	//a specific type of springboot to return a web request responses*/
	//to indicate that this methot have the response to get request from httpn we 
	//need to put an anotaion called @GetMapping
	
	@Autowired
	private CategoryService service;
	
	@GetMapping
	public ResponseEntity<List<Category>> findAll() {
		List<Category> list = service.findAll(); 
		return ResponseEntity.ok().body(list);
		
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<Category> findById(@PathVariable Long id) {
		Category obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	
	
}

package com.Deeksha.FoodDeliveryApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.Deeksha.FoodDeliveryApp.exceptions.CategoryException;
import com.Deeksha.FoodDeliveryApp.model.Category;
import com.Deeksha.FoodDeliveryApp.service.CategoryService;
import javax.validation.Valid;

@RestController
@RequestMapping("/category")
public class CategoryServiceController {
	
	@Autowired
	CategoryService catService;
	
	
	@PostMapping("/add")
	public ResponseEntity<Category> addCategory(@Valid @RequestBody Category category) throws CategoryException{
		System.out.println(category);
		Category newCategory = catService.addCategory(category);
		return new ResponseEntity<Category>(newCategory, HttpStatus.CREATED); 
	}
	
	@PutMapping("/update")
	public ResponseEntity<Category> updateCategory(@RequestBody Category category) throws CategoryException{
		Category updatedCategory = catService.updateCategory(category);
		return new ResponseEntity<Category>(updatedCategory, HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/view/{categoryId}")
	public ResponseEntity<Category> getCategory(@PathVariable("categoryId") Integer categoryId) throws CategoryException{
		Category category = catService.viewCategory(categoryId);
		return new ResponseEntity<Category>(category, HttpStatus.OK);
	}
	
	
	@DeleteMapping("/remove/{categoryId}")
	public ResponseEntity<Category> removeCategory(@PathVariable("categoryId") Integer categoryId) throws CategoryException{
		Category removedCategory = catService.removeCategory(categoryId);
		return new ResponseEntity<Category>(removedCategory, HttpStatus.OK);
	}
	
	
	@GetMapping("/viewall")
	public ResponseEntity<List<Category>> getAllCategories() throws CategoryException{
		List<Category> categories = catService.viewAllCategory();
		return new ResponseEntity<List<Category>>(categories, HttpStatus.OK);
	}
	

}

package com.Deeksha.FoodDeliveryApp.service;

import java.util.List;

import com.Deeksha.FoodDeliveryApp.exceptions.CategoryException;
import com.Deeksha.FoodDeliveryApp.model.Category;

public interface CategoryService {
	
	
	public Category addCategory(Category category)throws CategoryException;
	
	public Category updateCategory(Category category)throws CategoryException;
	
	public Category viewCategory(Integer categoryId)throws CategoryException;
	
	public Category removeCategory(Integer categoryId)throws CategoryException;
	
	public List<Category> viewAllCategory()throws CategoryException;

}

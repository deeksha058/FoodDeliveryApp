package com.Deeksha.FoodDeliveryApp.service;

import com.Deeksha.FoodDeliveryApp.exceptions.RestaurantException;
import com.Deeksha.FoodDeliveryApp.model.Restaurant;

public interface RestaurantService {
	
	public Restaurant addRestaurant(Restaurant restaurant)throws RestaurantException;
	
	public Restaurant updateRestaurant(Restaurant restaurant)throws RestaurantException;
	
	public Restaurant removeRestaurant(Integer restaurantId)throws RestaurantException;
	
	public Restaurant viewRestaurant(Integer restaurantId)throws RestaurantException;
	
	

}

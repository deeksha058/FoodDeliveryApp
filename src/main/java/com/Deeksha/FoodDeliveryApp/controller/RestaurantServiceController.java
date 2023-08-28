package com.Deeksha.FoodDeliveryApp.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Deeksha.FoodDeliveryApp.authexceptions.AuthorizationException;
import com.Deeksha.FoodDeliveryApp.authservice.UserSessionService;
//import com.foodapp.authexceptions.AuthorizationException;
//import com.foodapp.authservice.UserSessionService;
import com.Deeksha.FoodDeliveryApp.exceptions.RestaurantException;
import com.Deeksha.FoodDeliveryApp.model.Restaurant;
import com.Deeksha.FoodDeliveryApp.service.RestaurantService;

@RestController
@RequestMapping("/restaurant")
public class RestaurantServiceController {
	
	@Autowired
	RestaurantService restService;
	
	@Autowired
	UserSessionService userSessionService;
	
	
	
	@PostMapping("/add")
	public ResponseEntity<Restaurant> saveResturant(@Valid @RequestBody Restaurant restaurant) throws RestaurantException {

		System.out.println(restaurant);
		Restaurant newRestaurant = restService.addRestaurant(restaurant);
		
		return new ResponseEntity<Restaurant>(newRestaurant ,HttpStatus.CREATED);
	}
	
	
	@PutMapping("/update")
	public ResponseEntity<Restaurant> updateResturant(@Valid @RequestBody Restaurant restaurant) throws RestaurantException{

		if(restaurant.getRestaurantId() == null) restaurant.setRestaurantId(1);
		
		Restaurant updatedResturant=restService.updateRestaurant(restaurant);
		
		return new ResponseEntity<Restaurant>(updatedResturant,HttpStatus.ACCEPTED);
	}
	
	
	@DeleteMapping("/remove/{restaurantId}")
	public ResponseEntity<Restaurant> deleteRestaurant(@PathVariable("restaurantId") Integer restaurantId) throws RestaurantException{
		Restaurant removedRestaurant = restService.removeRestaurant(restaurantId);
		return new ResponseEntity<Restaurant>(removedRestaurant, HttpStatus.OK);
	}
	
	
	@GetMapping("/view/{restaurantId}")
	public ResponseEntity<Restaurant> getByResturantId(@PathVariable ("restaurantId") Integer restaurantId ,@RequestParam String key) throws RestaurantException, AuthorizationException{
		
		Integer sessionId = userSessionService.getUserSessionId(key);
    	
    	if(sessionId != null)
    		{	Restaurant restaurant =restService.viewRestaurant(restaurantId);	
    			return new ResponseEntity<Restaurant>(restaurant ,HttpStatus.ACCEPTED);
    		}
    	else
    		throw new RestaurantException();
	}

}

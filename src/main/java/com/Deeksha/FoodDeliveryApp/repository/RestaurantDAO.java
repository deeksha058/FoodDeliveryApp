package com.Deeksha.FoodDeliveryApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Deeksha.FoodDeliveryApp.model.Restaurant;


@Repository
public interface RestaurantDAO extends JpaRepository<Restaurant, Integer>{

}

package com.Deeksha.FoodDeliveryApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Deeksha.FoodDeliveryApp.model.FoodCart;


@Repository
public interface FoodCartDAO extends JpaRepository<FoodCart, Integer>{

}

package com.Deeksha.FoodDeliveryApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Deeksha.FoodDeliveryApp.model.Item;


@Repository
public interface ItemDAO extends JpaRepository<Item, Integer>{

}

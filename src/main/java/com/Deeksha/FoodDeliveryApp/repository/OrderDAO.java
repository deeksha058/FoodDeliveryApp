package com.Deeksha.FoodDeliveryApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Deeksha.FoodDeliveryApp.model.OrderDetails;


@Repository
public interface OrderDAO extends JpaRepository<OrderDetails, Integer>{

}

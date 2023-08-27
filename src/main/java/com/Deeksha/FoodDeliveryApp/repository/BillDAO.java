package com.Deeksha.FoodDeliveryApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Deeksha.FoodDeliveryApp.model.Bill;

@Repository
public interface BillDAO extends JpaRepository<Bill, Integer>{

}

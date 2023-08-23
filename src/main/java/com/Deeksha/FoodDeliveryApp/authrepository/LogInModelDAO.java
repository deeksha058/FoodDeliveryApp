package com.Deeksha.FoodDeliveryApp.authrepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Deeksha.FoodDeliveryApp.authmodels.LogInModel;


@Repository
public interface LogInModelDAO extends JpaRepository<LogInModel, Integer>{

}

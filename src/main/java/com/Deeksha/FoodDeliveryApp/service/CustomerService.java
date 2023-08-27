package com.Deeksha.FoodDeliveryApp.service;

import com.Deeksha.FoodDeliveryApp.exceptions.CustomerException;
import com.Deeksha.FoodDeliveryApp.model.Customer;

public interface CustomerService {
	
	public Customer addCustomer(Customer customer)throws CustomerException;
	
	public Customer updateCustomer(Customer customer)throws CustomerException;
	
	public Customer removeCustomerById(Integer customerId)throws CustomerException;
	
	public Customer viewCustomer(Integer customerId)throws CustomerException;

}

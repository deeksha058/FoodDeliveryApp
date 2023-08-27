package com.Deeksha.FoodDeliveryApp.service;

import java.util.List;

import com.Deeksha.FoodDeliveryApp.exceptions.CustomerException;
import com.Deeksha.FoodDeliveryApp.exceptions.OrderException;
import com.Deeksha.FoodDeliveryApp.model.Item;
import com.Deeksha.FoodDeliveryApp.model.OrderDetails;

public interface OrderDetailService {
	
	public OrderDetails addOrder(OrderDetails order)throws OrderException;
	
	public OrderDetails updateOrder(OrderDetails order)throws OrderException;
	
	public OrderDetails removeOrder(Integer orderId)throws OrderException;
	
	public OrderDetails viewOrder(Integer orderId)throws OrderException;
	
	public List<Item> viewAllOrdersByCustomer(Integer customerId)throws OrderException,CustomerException;

}

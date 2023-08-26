package com.Deeksha.FoodDeliveryApp.service;

import com.Deeksha.FoodDeliveryApp.exceptions.CartException;
import com.Deeksha.FoodDeliveryApp.exceptions.ItemException;
import com.Deeksha.FoodDeliveryApp.model.FoodCart;

public interface FoodCartService {
	
	public FoodCart saveCart(FoodCart cart)throws CartException;
	
	public FoodCart addItem(Integer cartId, Integer itemId)throws CartException,ItemException;
	
	public FoodCart clearCart(Integer cartId)throws CartException;
	
	public FoodCart viewCart(Integer cartId)throws CartException;

}

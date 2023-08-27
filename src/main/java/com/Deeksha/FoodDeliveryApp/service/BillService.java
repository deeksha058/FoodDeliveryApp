package com.Deeksha.FoodDeliveryApp.service;

import com.Deeksha.FoodDeliveryApp.exceptions.BillException;
import com.Deeksha.FoodDeliveryApp.exceptions.CustomerException;
import com.Deeksha.FoodDeliveryApp.exceptions.ItemException;
import com.Deeksha.FoodDeliveryApp.model.Bill;

public interface BillService {
	
	public Bill addBill(Bill bill) throws BillException;
	
	public Bill updateBill(Bill bill)throws BillException;
	
	public Bill removeBill(Integer billId)throws BillException;
	
	public Bill viewBill(Integer billId)throws BillException;
	
	public String generateTotalBillById(Integer customerId)throws ItemException,CustomerException;
	

}

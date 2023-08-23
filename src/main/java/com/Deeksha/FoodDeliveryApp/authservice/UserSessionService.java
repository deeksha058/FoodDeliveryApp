package com.Deeksha.FoodDeliveryApp.authservice;

import com.Deeksha.FoodDeliveryApp.authexceptions.AuthorizationException;
import com.Deeksha.FoodDeliveryApp.authmodels.SignUpModel;
import com.Deeksha.FoodDeliveryApp.authmodels.UserSession;

public interface UserSessionService {
	
	public UserSession getUserSession(String key) throws AuthorizationException;
	
	public Integer getUserSessionId(String key) throws AuthorizationException;
	
	public SignUpModel getSignUpDetails(String key) throws AuthorizationException;
	

}

package com.Deeksha.FoodDeliveryApp.authservice;

import com.Deeksha.FoodDeliveryApp.authexceptions.AuthorizationException;
import com.Deeksha.FoodDeliveryApp.authmodels.SignUpModel;

public interface SignUpModelService {
	
	public SignUpModel newSignUp(SignUpModel signUp) throws AuthorizationException;;
	
	public SignUpModel updateSignUp(SignUpModel signUp, String key) throws AuthorizationException;;

}

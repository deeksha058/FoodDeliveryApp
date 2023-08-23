package com.Deeksha.FoodDeliveryApp.authservice;

import java.util.Optional;

import com.Deeksha.FoodDeliveryApp.authexceptions.AuthorizationException;
import com.Deeksha.FoodDeliveryApp.authmodels.SignUpModel;
import com.Deeksha.FoodDeliveryApp.authrepository.SignUpModelDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SignUpModelServiceImpl implements SignUpModelService {


	@Autowired
	private SignUpModelDAO signUpDAO;
	
	@Autowired
	private UserSessionService userLoginSession;
	
	
	
	
	@Override
	public SignUpModel newSignUp(SignUpModel signUp) throws AuthorizationException {
		
		Optional<SignUpModel> opt = signUpDAO.findByUserName(signUp.getUserName());
		if(opt.isPresent())
		{
			throw new AuthorizationException("User Already Exists..!!");
		}
		
		return signUpDAO.save(signUp);
	}

	
	@Override
	public SignUpModel updateSignUp(SignUpModel signUp, String key) throws AuthorizationException {
		
		SignUpModel signUpDetails = userLoginSession.getSignUpDetails(key);
		
		if(signUpDetails == null)
		{
			throw new AuthorizationException("User not LoggedIn...!! Try To Login first..");
		}
		
		if(signUpDetails.getUserId() == signUp.getUserId())
			{
			signUpDAO.save(signUp);
			return signUp;
			}
		else
			throw new AuthorizationException("UserId not found..!!");
	}

}

package org.guzz.service;

import org.guzz.model.User;

public class LoginService {
	
	public boolean verifyLogin(User user) {
		if(user.getUserId().equals("user") && user.getPassword().equals("pass")) {
			return true;
		} else
			return false;
	}

}

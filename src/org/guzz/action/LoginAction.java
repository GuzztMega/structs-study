package org.guzz.action;

import com.opensymphony.xwork2.Action;

public class LoginAction implements Action{
	
	private String userId;
	private String password;
	
	public String execute(){
		if(getUserId().equals("user") && (getPassword().equals("pass"))){
			return SUCCESS;
		} else
		
		return LOGIN;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}

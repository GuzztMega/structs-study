package org.guzz.action;

import org.apache.commons.lang3.StringUtils;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport{
	
	private String userId;
	private String password;
	
	public void validate(){
		if(StringUtils.isEmpty(getUserId())) {
			addFieldError("userId", "Must insert a valid user");
		}
		
		if (StringUtils.isEmpty(getPassword())) {
			addFieldError("password", "Must insert a valid password");
		}
	}
	
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

package org.guzz.action;

import org.apache.commons.lang3.StringUtils;
import org.guzz.model.User;
import org.guzz.service.LoginService;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class LoginAction extends ActionSupport implements ModelDriven<User>{
	private static final long serialVersionUID = 1L;
	
	private User user = new User();
	
	public void validate(){
		if(StringUtils.isEmpty(user.getUserId())) {
			addFieldError("userId", "Must insert a valid user");
		}
		
		if (StringUtils.isEmpty(user.getPassword())) {
			addFieldError("password", "Must insert a valid password");
		}
	}
	
	public String execute(){
		LoginService loginService = new LoginService();		
		if(loginService.verifyLogin(user)){
			return SUCCESS;
		} else
			return LOGIN;
	}
	
	@Override
	public User getModel() {
		return user;
	}
	
	public User getUser() {
		return user;
	}
	
	public void setUser(User user) {
		this.user = user;
	}
}

package com.scauast.studio.action.user;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.scauast.studio.service.user.DefaultUserServiceImpl;
import com.scauast.studio.service.user.User_Service;
//import org.apache.struts2.json.annotations.JSON;

public class Login_Action extends ActionSupport implements SessionAware {
	
	private Map<String, Object> session;
	
	private int userid;
	private String username;
	private String password;
	//这堆是dto
	
	private String loginstatus;
	
	private User_Service userService = new DefaultUserServiceImpl();

	@Override
	public String execute() throws Exception {
		userid = userService.checkingUser(this);
		
		if(userid != -1){
			session.put("userid", userid);
			password = "ab63e87fec15bf3ae774d6f40b611b94";
			loginstatus = "success";
		}
		else{ 
			password = "ab63e87fec15bf3ae774d6f40b611b94";
			loginstatus = "error";
		}
		return "success";
	}
	
	public String getLoginstatus() {
		return loginstatus;
	}

	public void setLoginstatus(String loginstatus) {
		this.loginstatus = loginstatus;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}
	
	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
	
}

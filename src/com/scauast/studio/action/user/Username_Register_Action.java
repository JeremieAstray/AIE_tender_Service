package com.scauast.studio.action.user;

import com.opensymphony.xwork2.ActionSupport;
import com.scauast.studio.dao.user.User_Dao;
import com.scauast.studio.dao.user.impl.User_DaoImpl;

public class Username_Register_Action extends ActionSupport {
	private String username;
	private String status;
	
	@Override
	public String execute() throws Exception {
		User_Dao UD = new User_DaoImpl();
		boolean re = UD.checkUsername(username);
		status = re ? "用户名已经存在！" : null ;
		return "success";
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	
}

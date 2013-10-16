package com.scauast.studio.action.user;

import com.opensymphony.xwork2.ActionSupport;
import com.scauast.studio.db.user.User_DB_Connection;
import com.scauast.studio.db.user.factory.CheckUserName_Factory;
import com.scauast.studio.db.user.factory.User_DB_Factory;

public class Username_Register_Action extends ActionSupport {
	private String username;
	private String status;
	
	@Override
	public String execute() throws Exception {
		User_DB_Factory UDBF = new CheckUserName_Factory();
		User_DB_Connection UDBC = UDBF.createDBConnection();
		boolean re = (boolean) UDBC.connectDB(username);
		status = re ? null : "用户名已经存在！" ;
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

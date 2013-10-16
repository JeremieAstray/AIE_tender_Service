package com.scauast.studio.action.user;

import com.opensymphony.xwork2.ActionSupport;
import com.scauast.studio.db.user.User_DB_Connection;
import com.scauast.studio.db.user.factory.CheckName_Factory;
import com.scauast.studio.db.user.factory.User_DB_Factory;

public class Name_Register_Action extends ActionSupport {
	
	private String name;
	private String status;
	@Override
	public String execute() throws Exception {
		User_DB_Factory UDBF = new CheckName_Factory();
		User_DB_Connection UDBC = UDBF.createDBConnection();
		boolean re = (boolean) UDBC.connectDB(name);
		status = re ? null : "团队名已经存在！" ;
		return "success";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
}

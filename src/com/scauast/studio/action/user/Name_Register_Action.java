package com.scauast.studio.action.user;

import com.opensymphony.xwork2.ActionSupport;
import com.scauast.studio.dao.user.User_Dao;
import com.scauast.studio.dao.user.impl.User_DaoImpl;

public class Name_Register_Action extends ActionSupport {
	private String name;
	private String status;
	@Override
	public String execute() throws Exception {
		User_Dao UD = new User_DaoImpl();
		boolean re = UD.checkName(name);
		status = re ? "团队名已经存在！" : null ;
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

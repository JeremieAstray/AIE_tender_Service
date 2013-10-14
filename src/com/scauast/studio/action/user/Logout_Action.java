package com.scauast.studio.action.user;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class Logout_Action extends ActionSupport implements SessionAware {
	
	private Map<String, Object> session;
	
	
	
	@Override
	public String execute() throws Exception {
		session.clear();
		return "success";
	}



	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}

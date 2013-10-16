package com.scauast.studio.action.user;

import java.util.HashMap;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.scauast.studio.db.user.User_DB_Connection;
import com.scauast.studio.db.user.factory.GetUserInfoEX_Factory;
import com.scauast.studio.db.user.factory.User_DB_Factory;
import com.scauast.studio.entity.user.UserInfo_Entity;


public class Info_Action extends ActionSupport implements SessionAware {
	
    private Map<String, Object> session;
	private Map<String,String> map = new HashMap<String,String>();
	private UserInfo_Entity UE;
	private String type = "1";
	
	@Override
	public String execute() throws Exception {
		int userid = (int) session.get("userid");
		User_DB_Factory UDBF = new GetUserInfoEX_Factory();
		User_DB_Connection UDBC = UDBF.createDBConnection();
		setUE((UserInfo_Entity)UDBC.connectDB(userid));
		return "success";
	}
	
	
	public Map<String, String> getMap() {
		return map;
	}


	public void setMap(Map<String, String> map) {
		this.map = map;
	}


	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public UserInfo_Entity getUE() {
		return UE;
	}

	public void setUE(UserInfo_Entity uE) {
		UE = uE;
	}
	
	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
	
	public Map<String, Object> getSession() {
		return session;
	}
	
	
}

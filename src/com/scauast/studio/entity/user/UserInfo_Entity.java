package com.scauast.studio.entity.user;

public class UserInfo_Entity {
	
	private int userid;
	private String username;			//用户名（登陆用）
	private String name;				//团队名
	private UserInfoEX_Entity UIEE;
	
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public UserInfoEX_Entity getUIEE() {
		return UIEE;
	}
	public void setUIEE(UserInfoEX_Entity uIEE) {
		UIEE = uIEE;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}

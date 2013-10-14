package com.scauast.studio.action.user;

import com.opensymphony.xwork2.ActionSupport;
import com.scauast.studio.service.user.DefaultUserServiceImpl;
import com.scauast.studio.service.user.User_Service;


public class Update_Action extends ActionSupport {
	
	private int userid;
	private String userName;
	private int userType;
	private String studioOwner;
	private String studioCollage;
	private String studioArea;
	private String userTelL;
	private String userTelS;
	private String userQQ;
	private String userEmail;
	User_Service US = new DefaultUserServiceImpl();
	
	@Override
	public String execute() throws Exception {
		boolean re = US.UpdateUser(this);
		if(re) return "success";
		return "error";
	}
	
	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getUserType() {
		return userType;
	}
	public void setUserType(int userType) {
		this.userType = userType;
	}
	public String getStudioOwner() {
		return studioOwner;
	}
	public void setStudioOwner(String studioOwner) {
		this.studioOwner = studioOwner;
	}
	public String getStudioCollage() {
		return studioCollage;
	}
	public void setStudioCollage(String studioCollage) {
		this.studioCollage = studioCollage;
	}
	public String getStudioArea() {
		return studioArea;
	}
	public void setStudioArea(String studioArea) {
		this.studioArea = studioArea;
	}
	public String getUserTelL() {
		return userTelL;
	}
	public void setUserTelL(String userTelL) {
		this.userTelL = userTelL;
	}
	public String getUserTelS() {
		return userTelS;
	}
	public void setUserTelS(String userTelS) {
		this.userTelS = userTelS;
	}
	public String getUserQQ() {
		return userQQ;
	}
	public void setUserQQ(String userQQ) {
		this.userQQ = userQQ;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	
	
}

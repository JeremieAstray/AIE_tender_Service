package com.scauast.studio.action.user;

import com.opensymphony.xwork2.ActionSupport;
import com.scauast.studio.db.user.User_DB_Connection;
import com.scauast.studio.db.user.factory.CheckName_Factory;
import com.scauast.studio.db.user.factory.CheckUserName_Factory;
import com.scauast.studio.db.user.factory.User_DB_Factory;
import com.scauast.studio.service.user.*;
import com.scauast.studio.service.user.Factory.AddUser_Factory;
import com.scauast.studio.service.user.Factory.User_Service_Factory;

public class Register_Action extends ActionSupport {

	private String userId;			//用户名（登陆用）
	private String userName;		//团队名
	private String userPassword;	//密码
	private String userTelL;		//手机长号
	private String userTelS;		//手机短号
	private String userEmail;		//邮箱
	private String userQQ;			//QQ
	private int userType;			//用户类型
	private String studioOwner;		//工作室法人(负责人)
	private String studioObject;	//工作室法人年级专业
	private String studioCollage;	//工作室所在学院
	private String studioArea;		//工作室营业范围(可以多个)
	private String studioIntroduce;	//工作室简要介绍(100字内)
	private String status;
	private User_Service_Factory USF = new AddUser_Factory();
	
	@Override
	public String execute() throws Exception {
		User_Service US = USF.createUser_Service();
		User_DB_Factory UDBF_F = new CheckName_Factory();
		User_DB_Factory UDBF_S = new CheckUserName_Factory();
		User_DB_Connection UDBC_F = UDBF_F.createDBConnection();
		User_DB_Connection UDBC_S = UDBF_S.createDBConnection();
		boolean re = (boolean) UDBC_F.connectDB(userId) && (boolean) UDBC_S.connectDB(userName);
		status = re ? "" : "用户名或团队名已经存在!";
		if(re){
			boolean result = (boolean)US.ExecuteService(this);
			status = result ? "" : "error";
			if(result) return "success";
		}
		return "error";
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
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

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserQQ() {
		return userQQ;
	}

	public void setUserQQ(String userQQ) {
		this.userQQ = userQQ;
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

	public String getStudioObject() {
		return studioObject;
	}

	public void setStudioObject(String studioObject) {
		this.studioObject = studioObject;
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

	public String getStudioIntroduce() {
		return studioIntroduce;
	}

	public void setStudioIntroduce(String studioIntroduce) {
		this.studioIntroduce = studioIntroduce;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
}

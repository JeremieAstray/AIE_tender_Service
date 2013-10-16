package com.scauast.studio.entity.user;

import com.scauast.studio.action.user.Register_Action;

public class Register_Entity {
	
	private String username;			//用户名（登陆用）
	private String name;				//团队名
	private String password;			//密码
	private String long_num;			//手机长号
	private String short_num;			//手机短号
	private String email;				//邮箱
	private String QQ;					//QQ
	private int userType;				//用户类型
	private String principal;			//工作室法人(负责人)
	private String major_grade;			//工作室法人年级专业
	private String college;				//工作室所在学院
	private String business_scope;		//工作室营业范围(可以多个)
	private String introduce;			//工作室简要介绍(100字内)
	
	public Register_Entity() {
	}
	
	public Register_Entity(Register_Action RA) {
		username = RA.getUserId();
		name = RA.getUserName();
		password = RA.getUserPassword();
		long_num = RA.getUserTelL();
		short_num = RA.getUserTelS();
		email = RA.getUserEmail();
		QQ = RA.getUserQQ();
		userType = RA.getUserType();
		principal = RA.getStudioOwner();
		major_grade = RA.getStudioObject();
		college = RA.getStudioCollage();
		business_scope = RA.getStudioArea();
		introduce = RA.getStudioIntroduce();
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getLong_num() {
		return long_num;
	}
	public void setLong_num(String long_num) {
		this.long_num = long_num;
	}
	public String getShort_num() {
		return short_num;
	}
	public void setShort_num(String short_num) {
		this.short_num = short_num;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getQQ() {
		return QQ;
	}
	public void setQQ(String qQ) {
		QQ = qQ;
	}
	public int getUserType() {
		return userType;
	}
	public void setUserType(int userType) {
		this.userType = userType;
	}
	public String getPrincipal() {
		return principal;
	}
	public void setPrincipal(String principal) {
		this.principal = principal;
	}
	public String getMajor_grade() {
		return major_grade;
	}
	public void setMajor_grade(String major_grade) {
		this.major_grade = major_grade;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	public String getBusiness_scope() {
		return business_scope;
	}
	public void setBusiness_scope(String business_scope) {
		this.business_scope = business_scope;
	}
	public String getIntroduce() {
		return introduce;
	}
	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}
	
}

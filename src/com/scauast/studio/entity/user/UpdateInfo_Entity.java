package com.scauast.studio.entity.user;

public class UpdateInfo_Entity {

	private int userid; 
	private String name;				//团队名
	private String long_num;			//手机长号
	private String short_num;			//手机短号
	private String email;				//邮箱
	private String QQ;					//QQ
	private int userType;				//用户类型
	private String principal;			//工作室法人(负责人)
	private String college;				//工作室所在学院
	private String business_scope;		//工作室营业范围(可以多个)
	
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	
	
}

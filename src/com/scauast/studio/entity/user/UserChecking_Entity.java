package com.scauast.studio.entity.user;

public class UserChecking_Entity {
	
	private String username;
	private String password;
	
	public UserChecking_Entity() {
	}
	
	public UserChecking_Entity(String username,String password) {
		this.username = username;
		this.password = password;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}

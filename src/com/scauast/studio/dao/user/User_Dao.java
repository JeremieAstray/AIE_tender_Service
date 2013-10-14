package com.scauast.studio.dao.user;

public interface User_Dao {
	
	public abstract boolean addUserEntity(Object obj);
	
	public abstract int CheckLoginInfo(Object obj);
	
	public abstract Object getUserInfoEX(int id);
	
	public abstract boolean updateUserInfo(Object obj);
	
	public abstract boolean checkUsername(String username);
	
	public abstract boolean checkName(String name);
}

package com.scauast.studio.service.user;

import com.scauast.studio.action.user.Login_Action;
import com.scauast.studio.action.user.Register_Action;
import com.scauast.studio.action.user.Update_Action;
import com.scauast.studio.dao.user.User_Dao;
import com.scauast.studio.dao.user.impl.User_DaoImpl;
import com.scauast.studio.entity.user.Register_Entity;
import com.scauast.studio.entity.user.UpdateInfo_Entity;
import com.scauast.studio.entity.user.UserChecking_Entity;
import com.scauast.studio.entity.user.UserInfo_Entity;

public class DefaultUserServiceImpl implements User_Service {
	
	private User_Dao UD = new User_DaoImpl();
	
	@Override
	public boolean addUser(Object obj) {
		Register_Action RA = (Register_Action) obj;
		Register_Entity RE = new Register_Entity(RA);
		boolean Back = UD.addUserEntity(RE);
		return Back;
	}

	@Override
	public int checkingUser(Object obj) {
		Login_Action LA = (Login_Action) obj;
		UserChecking_Entity UCE = new UserChecking_Entity(LA.getUsername(),LA.getPassword());
		User_Dao UD = new User_DaoImpl();
		int userid = UD.CheckLoginInfo(UCE);
		return userid;
	}

	@Override
	public boolean UpdateUser(Object obj) {
		Update_Action UA = (Update_Action) obj;
		UpdateInfo_Entity UIE = new UpdateInfo_Entity();
		UIE.setUserid(UA.getUserid());
		UIE.setName(UA.getUserName());
		UIE.setLong_num(UA.getUserTelL());
		UIE.setShort_num(UA.getUserTelS());
		UIE.setEmail(UA.getUserEmail());
		UIE.setQQ(UA.getUserQQ());
		UIE.setUserType(UA.getUserType());
		UIE.setPrincipal(UA.getStudioOwner());
		UIE.setCollege(UA.getStudioCollage());
		UIE.setBusiness_scope(UA.getStudioArea());	
		boolean re = UD.updateUserInfo(UIE);
		return re;
	}
	

}

package com.scauast.studio.service.user;

import com.scauast.studio.action.user.Update_Action;
import com.scauast.studio.db.user.User_DB_Connection;
import com.scauast.studio.db.user.factory.UpdateUserInfo_Factory;
import com.scauast.studio.db.user.factory.User_DB_Factory;
import com.scauast.studio.entity.user.UpdateInfo_Entity;

public class UpdateUser implements User_Service {

	@Override
	public Object ExecuteService(Object obj) {
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
		
		User_DB_Factory UDBF = new UpdateUserInfo_Factory();
		User_DB_Connection UDBC = UDBF.createDBConnection();
		boolean re = (boolean) UDBC.connectDB(UIE);
		return re;
	}

}

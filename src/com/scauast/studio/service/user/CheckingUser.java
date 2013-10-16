package com.scauast.studio.service.user;

import com.scauast.studio.action.user.Login_Action;
import com.scauast.studio.db.user.User_DB_Connection;
import com.scauast.studio.db.user.factory.CheckLoginInfo_Factory;
import com.scauast.studio.db.user.factory.User_DB_Factory;
import com.scauast.studio.entity.user.UserChecking_Entity;

public class CheckingUser implements User_Service {

	@Override
	public Object ExecuteService(Object obj) {
		Login_Action LA = (Login_Action) obj;
		UserChecking_Entity UCE = new UserChecking_Entity(LA.getUsername(),LA.getPassword());
		User_DB_Factory UDBF = new CheckLoginInfo_Factory();
		User_DB_Connection UDBC = UDBF.createDBConnection();
		int userid =(int) UDBC.connectDB(UCE);
		return userid;
	}

}

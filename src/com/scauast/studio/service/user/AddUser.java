package com.scauast.studio.service.user;

import com.scauast.studio.action.user.Register_Action;
import com.scauast.studio.db.user.User_DB_Connection;
import com.scauast.studio.db.user.factory.InsertUser_Factory;
import com.scauast.studio.db.user.factory.User_DB_Factory;
import com.scauast.studio.entity.user.Register_Entity;

public class AddUser implements User_Service {

	@Override
	public Object ExecuteService(Object obj) {
		Register_Action RA = (Register_Action) obj;
		Register_Entity RE = new Register_Entity(RA);
		User_DB_Factory UDBF = new InsertUser_Factory();
		User_DB_Connection UDBC = UDBF.createDBConnection();
		boolean Back = (boolean) UDBC.connectDB(RE);
		return Back;
	}

}

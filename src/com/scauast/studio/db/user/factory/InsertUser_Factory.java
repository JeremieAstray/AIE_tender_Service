package com.scauast.studio.db.user.factory;

import com.scauast.studio.db.user.InsertUser;
import com.scauast.studio.db.user.User_DB_Connection;

public class InsertUser_Factory implements User_DB_Factory {

	@Override
	public User_DB_Connection createDBConnection() {
		return new InsertUser();
	}

}

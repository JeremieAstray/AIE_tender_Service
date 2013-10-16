package com.scauast.studio.db.user.factory;

import com.scauast.studio.db.user.User_DB_Connection;
import com.scauast.studio.db.user.CheckUserName;

public class CheckUserName_Factory implements User_DB_Factory {

	@Override
	public User_DB_Connection createDBConnection() {
		return new CheckUserName();
	}

}

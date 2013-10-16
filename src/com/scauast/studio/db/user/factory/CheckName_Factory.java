package com.scauast.studio.db.user.factory;

import com.scauast.studio.db.user.CheckName;
import com.scauast.studio.db.user.User_DB_Connection;

public class CheckName_Factory implements User_DB_Factory {

	@Override
	public User_DB_Connection createDBConnection() {
		return new CheckName();
	}

}

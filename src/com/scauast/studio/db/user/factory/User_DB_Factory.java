package com.scauast.studio.db.user.factory;

import com.scauast.studio.db.user.User_DB_Connection;

public interface User_DB_Factory {
	
	public User_DB_Connection createDBConnection();
	
}

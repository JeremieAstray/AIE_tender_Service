package com.scauast.studio.db.user;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.scauast.studio.util.JDBConnection;

public class CheckName extends JDBConnection implements User_DB_Connection {

	@Override
	public Object connectDB(Object obj) {
		String name = (String) obj;
		boolean re = true;
		String sqlget = "select * from v$_userinfo where name = '" + name + "'";
		ResultSet rs = executeQuery(sqlget);
		try {
			if(rs.next())
				re = false;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return re;
	}

}

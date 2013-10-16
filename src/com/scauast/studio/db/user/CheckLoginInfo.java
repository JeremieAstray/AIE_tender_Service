package com.scauast.studio.db.user;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.scauast.studio.entity.user.UserChecking_Entity;
import com.scauast.studio.util.JDBConnection;

public class CheckLoginInfo extends JDBConnection implements User_DB_Connection {

	@Override
	public Object connectDB(Object obj) {
		UserChecking_Entity UCE = (UserChecking_Entity) obj;
		int userid = -1;
		String sqlget = "select * from tb_user " +
				"where username = '" + UCE.getUsername() 
				+ "' and password = '" + UCE.getPassword() + "'";
		ResultSet rs = executeQuery(sqlget);
		try {
			if(rs.next())
				userid = rs.getInt(1);
			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return userid;
	}

}

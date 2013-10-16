package com.scauast.studio.db.user;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.scauast.studio.entity.user.UserInfoEX_Entity;
import com.scauast.studio.entity.user.UserInfo_Entity;
import com.scauast.studio.util.JDBConnection;

public class GetUserInfoEX extends JDBConnection implements User_DB_Connection {

	@Override
	public Object connectDB(Object obj) {
		int id = (Integer) obj;
		UserInfo_Entity UE = new UserInfo_Entity();
		String sqlget = "select * from v$_userinfo " +
				"where userid = " + id;
		ResultSet rs = executeQuery(sqlget);
		try {
			if(rs.next());
			UserInfoEX_Entity UIEE = new UserInfoEX_Entity();
			UE.setUserid(rs.getInt(1));
			UE.setUsername(rs.getString(2));
			UE.setName(rs.getString(3));
			UIEE.setUserType(rs.getInt(4));
			UIEE.setPrincipal(rs.getString(5));
			UIEE.setCollege(rs.getString(6));
			UIEE.setBusiness_scope(rs.getString(7));
			UIEE.setQQ(rs.getString(8));
			UIEE.setEmail(rs.getString(9));
			UIEE.setLong_num(rs.getString(10));
			UIEE.setShort_num(rs.getString(11));
			UE.setUIEE(UIEE);
			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return UE;
	}

}

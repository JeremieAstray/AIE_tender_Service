package com.scauast.studio.dao.user.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.scauast.studio.dao.user.User_Dao;
import com.scauast.studio.entity.user.Register_Entity;
import com.scauast.studio.entity.user.UpdateInfo_Entity;
import com.scauast.studio.entity.user.UserChecking_Entity;
import com.scauast.studio.entity.user.UserInfoEX_Entity;
import com.scauast.studio.entity.user.UserInfo_Entity;
import com.scauast.studio.util.JDBConnection;

public class User_DaoImpl extends JDBConnection implements User_Dao {

	
	@Override
	public boolean addUserEntity(Object obj) {
		
		String sqlget = "select max(userid) from tb_user";
		ResultSet rs = executeQuery(sqlget);
		int temp = 0;
		try {
			rs.next();
			temp = rs.getInt(1);
			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		int max = temp + 1;
		Register_Entity RE = (Register_Entity) obj;
		String sql = "insert into tb_user values( " + max + " , ? , ?)";
		String sql2 = "insert into tb_studio values(" + max +", ? , ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		PreparedStatement ps = CreatePreparedStatement(sql);
		
		try{
			ps.setString(1,RE.getUsername());
			ps.setString(2,RE.getPassword());
			ps.executeUpdate();
		}catch(SQLException e){
			e.printStackTrace();
			return false;
		}finally{
			try {
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
				return false;
			}
		}
		PreparedStatement ps2 = CreatePreparedStatement(sql2);
		try{
			ps2.setString(1,RE.getName());
			ps2.setInt(2,RE.getUserType());
			ps2.setString(3,RE.getPrincipal());
			ps2.setString(4,RE.getCollege());
			ps2.setString(5,RE.getMajor_grade());
			ps2.setString(6,RE.getBusiness_scope());
			ps2.setString(7,RE.getIntroduce());
			ps2.setString(8,RE.getQQ());
			ps2.setString(9,RE.getEmail());
			ps2.setString(10,RE.getLong_num());
			ps2.setString(11,RE.getShort_num());
			ps2.executeUpdate();
		}catch(SQLException e){
			e.printStackTrace();
			return false;
		}finally{
			try {
				ps2.close();
			} catch (SQLException e) {
				e.printStackTrace();
				return false;
			}
		}
		return true;
	}

	@Override
	public int CheckLoginInfo(Object obj) {
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

	@Override
	public Object getUserInfoEX(int id) {
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

	@Override
	public boolean updateUserInfo(Object obj) {
		UpdateInfo_Entity UIE = (UpdateInfo_Entity) obj;
		String sql = "Update tb_studio set " +
				"name='" + UIE.getName() + "' , " +
				"userType=" + UIE.getUserType() + " , " +
				"principal='" + UIE.getPrincipal() + "' , " +
				"college='" + UIE.getCollege() + "' , " +
				"business_scope='" + UIE.getBusiness_scope() + "' , " +
				"QQ='" + UIE.getQQ() + "' , " +
				"email='" + UIE.getEmail() + "' , " +
				"long_num='" + UIE.getLong_num() + "' , " +
				"short_num='" + UIE.getShort_num() + "' " +
				" where userid = " + UIE.getUserid();
		int re = executeUpdate(sql);
		if(re == 1)
			return true;
		return false;
	}

	@Override
	public boolean checkUsername(String username) {
		boolean re = true;
		String sqlget = "select * from v$_userinfo where username = " + username;
		ResultSet rs = executeQuery(sqlget);
		try {
			if(rs.next())
				re = false;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return re;
	}

	@Override
	public boolean checkName(String name) {
		boolean re = true;
		String sqlget = "select * from v$_userinfo where name = " + name;
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




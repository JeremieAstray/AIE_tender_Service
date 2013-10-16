package com.scauast.studio.db.user;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.scauast.studio.entity.user.Register_Entity;
import com.scauast.studio.util.JDBConnection;

public class InsertUser extends JDBConnection implements User_DB_Connection {

	@Override
	public Object connectDB(Object obj) {
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

}

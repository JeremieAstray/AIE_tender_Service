package com.scauast.studio.util;
import java.sql.*;

public class JDBConnection {

	private final String dbDrive = "com.mysql.jdbc.Driver";
	private final String url = "jdbc:mysql://localhost/studio_aie?user=root&password=root";
	private final String userName = "root";
	private final String password = "root";
	private Connection con = null;
	
	public JDBConnection() {	//连接服务器
		try {
			Class.forName(dbDrive);

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	private boolean creatConnection() // 私有方法
	{
		try {
			con = DriverManager.getConnection(url, userName, password);
			con.setAutoCommit(true);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return true;
	}

	public int executeUpdate(String sql) // 对数据库的增加，更新，删除，传入完整的sql语句。成功返回操作所影响的条数，失败返回-1。（0也算成功的，只不过影响0条）
	{
		if (con == null) {
			creatConnection();
		}
		try {
			Statement stmt = con.createStatement();
			int iCount = stmt.executeUpdate(sql);
			return iCount;
		} catch (SQLException e) {
			e.printStackTrace();
			return -1;
		}
	}

	public ResultSet executeQuery(String sql) // 执行查询，返回一个ResultSet对象。失败返回null。
	{
		ResultSet rs;
		try {
			if (con == null) {
				creatConnection();
			}
			Statement stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return rs;
	}

	public PreparedStatement CreatePreparedStatement(String sql) // 用来执行预编译的sql，获得PreparedStatement对象。
	{
		try {
			if (con == null) {
				creatConnection();
			}
			return con.prepareStatement(sql);
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

	public void closeConnection() // 关闭数据库连接
	{
		if (con != null) {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}

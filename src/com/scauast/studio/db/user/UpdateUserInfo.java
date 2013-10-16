package com.scauast.studio.db.user;

import com.scauast.studio.entity.user.UpdateInfo_Entity;
import com.scauast.studio.util.JDBConnection;

public class UpdateUserInfo extends JDBConnection implements User_DB_Connection {

	@Override
	public Object connectDB(Object obj) {
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

}

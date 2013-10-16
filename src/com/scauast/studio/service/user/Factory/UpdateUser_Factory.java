package com.scauast.studio.service.user.Factory;

import com.scauast.studio.service.user.UpdateUser;
import com.scauast.studio.service.user.User_Service;

public class UpdateUser_Factory implements User_Service_Factory {

	@Override
	public User_Service createUser_Service() {
		return new UpdateUser();
	}

}

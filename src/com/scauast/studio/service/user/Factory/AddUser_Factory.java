package com.scauast.studio.service.user.Factory;

import com.scauast.studio.service.user.AddUser;
import com.scauast.studio.service.user.User_Service;

public class AddUser_Factory implements User_Service_Factory {

	@Override
	public User_Service createUser_Service() {
		return new AddUser();
	}

}

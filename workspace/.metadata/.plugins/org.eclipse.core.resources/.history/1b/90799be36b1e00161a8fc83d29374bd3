package com.sapient.service;

import com.sapient.entity.User;

public class UserService implements IUserService{

	@Override
	public boolean authenticate(User user) {
		if(user.getEmail().equals(user.getPassword())){
			return true;
		}
		return false;
	}

}

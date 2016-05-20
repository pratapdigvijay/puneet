package com.sapient.service;

import com.sapient.entity.User;

public interface IUserService { 
	public boolean authenticate(User user);
	public boolean register(User user);
}

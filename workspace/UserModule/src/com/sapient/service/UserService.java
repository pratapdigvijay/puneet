package com.sapient.service;

import java.util.HashMap;
import java.util.Map;

import com.sapient.entity.User;

public class UserService implements IUserService{

	static Map<String, User> users = new HashMap<>(); 
	
	static {
		users.put("ravi@gmail.com", new User("ravi@gmail.com", "ravi", "ravi"));
		
	}
	
	@Override
	public boolean authenticate(User user) {
		User userFromMap = users.get(user.getEmail());
		if((userFromMap != null) && (user.equals(userFromMap)) ){		
			return true;
		}
		return false;
		
	}

	@Override
	public boolean register(User user) {
		System.out.println("MAp is" + users);
		if(user.getPwd().equals(user.getConfirmPwd())){
			System.out.println("password equal");
			if(users.get(user.getEmail()) == null){
				System.out.println("not already registered");
				users.put(user.getEmail(), user);
				System.out.println(users);
				return true;
			}
			
		}
		return false;
	}

}

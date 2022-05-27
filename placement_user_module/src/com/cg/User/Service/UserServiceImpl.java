package com.cg.User.Service;

import com.cg.User.Repository.UserRepositoryImpl;
import com.cg.User.entities.User;


public class UserServiceImpl implements IUserService {
	UserRepositoryImpl uservice;
	


	public UserServiceImpl() {
		uservice=new UserRepositoryImpl();
		
	}

	@Override
	public User  addNewUser(User user) {
		uservice.beginTransaction();
		uservice.addNewUser(user);
		uservice.commitTransaction();
		return user;
		
	}

	@Override
	public User updateUser(User user) {
		uservice.beginTransaction();//start db
		uservice.updateUser(user);
		uservice.commitTransaction();//save
		return user;
		
		
	}

	
	@Override
	public void removeUser(int id) {
		uservice.beginTransaction();
		uservice.removeUser(id);
		uservice.commitTransaction();
		
		
		
		
		
	}

	@Override
	public User loginUser(User user) {
		return null;
		
		
	}

	@Override
	public boolean logoutUser() {
		return false;
		
		
	}

	
	

}
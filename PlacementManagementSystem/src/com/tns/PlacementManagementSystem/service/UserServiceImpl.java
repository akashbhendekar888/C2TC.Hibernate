package com.tns.PlacementManagementSystem.service;

import com.tns.PlacementManagementSystem.*;
import com.tns.PlacementManagementSystem.entities.User;
import com.tns.PlacementManagementSystem.repository.UserRepositoryImpl;
import com.tns.PlacementManagementSystem.*;


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
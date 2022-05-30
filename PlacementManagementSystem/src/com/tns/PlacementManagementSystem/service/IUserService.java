package com.tns.PlacementManagementSystem.service;

import com.tns.PlacementManagementSystem.*;
import com.tns.PlacementManagementSystem.entities.User;

public interface IUserService {
	
	public User addNewUser(User user);

	public User updateUser(User user);
	
	public void removeUser(int id);

    public User loginUser(User user);
	 
	public boolean logoutUser();

	
	
	
	
	

	
	


}

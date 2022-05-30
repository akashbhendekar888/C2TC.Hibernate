package com.tns.PlacementManagementSystem.repository;

import com.tns.PlacementManagementSystem.*;
import com.tns.PlacementManagementSystem.entities.User;

public interface IuserRepository {

   
	public User addNewUser(User user);

	public User updateUser(User user );
	
	public void removeUser(int id);

	
	
	public abstract void beginTransaction();//start db

	public abstract void commitTransaction();//save

	
	

	
}


   
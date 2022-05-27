package com.cg.User.Repository;

import com.cg.User.entities.User;

public interface IuserRepository {

   
	public User addNewUser(User user);

	public User updateUser(User user );
	
	public void removeUser(int id);

	
	
	public abstract void beginTransaction();//start db

	public abstract void commitTransaction();//save
	

	
	

	
}


   
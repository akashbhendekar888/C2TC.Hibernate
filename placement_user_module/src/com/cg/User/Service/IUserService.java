package com.cg.User.Service;

import com.cg.User.entities.User;

public interface IUserService {
	
	public User addNewUser(User user);

	public User updateUser(User user);
	
	public void removeUser(int id);

    public User loginUser(User user);
	 
	public boolean logoutUser();

	
	
	
	
	

	
	


}

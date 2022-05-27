package com.cg.User.client;

import com.cg.User.Service.*;
import com.cg.User.entities.User;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  User user=new User();
		  
   IUserService service=new UserServiceImpl();
   
 
   System.out.println("Starting JPA life cycle");
   
   //persist data
   user.setId(12);
   user.setName("sachin Tendulkar");
   user.setPassword("sachin@123");
   user.setType("Fresher");
   service.addNewUser(user);
   System.out.println("Add Successfully");
   
  
   
  
   
 /* //update operation
   user.setId(10);
   user.setName("Ragnar lorthbrok");
   user.setPassword("Ragnar@123");
   user.setType("Freshar");
   service.updateUser(user);
   System.out.println("Update successfully");
  */ 
   //delete Operation
   
 /*  try {
   
   service.removeUser(10);
   System.out.println("delete successfully");
   }catch(Exception e) {System.out.println(e);}
*/
	}

}
package com.tns.client;

import java.util.Scanner;

import com.tns.entities.Admin;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Admin admin = new Admin();
			Scanner s=new Scanner(System.in);
			
			System.out.println("Enter Name");
			String name= s.nextLine();
			admin.setName(name);
			
			System.out.println("Enter ID");
			int id = s.nextInt();
			admin.setId(id);
			
			System.out.println("Enter Password");
			String password = s.nextLine();	
			admin.setPassword(password);


	}

}

package com.tns;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println("project Starting");
       SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
       System.out.println(factory);
       System.out.println(factory.isClosed());
       //creating student
       Student std=new Student();
       std.setId(10);
       std.setCity("Pune");
       std.setName("Akash Bhendekar");
       System.out.println(std);
       
       Session session=factory.openSession();
       Transaction tx=session.beginTransaction();
       session.save(std);
       tx.commit();
       session.close();
       
	}

}

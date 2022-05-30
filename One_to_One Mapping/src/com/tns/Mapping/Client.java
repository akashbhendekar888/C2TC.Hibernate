package com.tns.Mapping;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Client {
	public static void main(String args[]) {
	EntityManagerFactory factory=Persistence.createEntityManagerFactory("JAP-PU");
	EntityManager em=factory.createEntityManager();
	em.getTransaction().begin();
	
	Student std=new Student();
	std.setSid(10);
	std.setSname("Akash Bhendekar");
	Address add=new Address();
    add.setPincode(414502);
	add.setCity("Pune");
	add.setStreet("Pune Road");
	std.setAddress_id(add);
	
	em.persist(std);
	System.out.println("inserted");
	em.getTransaction().commit();
	em.close();
	factory.close();
	
    

  }
}

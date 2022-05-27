package com.tns.JPAinheritance;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
	EntityManagerFactory fac=Persistence.createEntityManagerFactory("JPA-PU");
	EntityManager em=fac.createEntityManager();
	em.getTransaction().begin();
	
	System.out.println("Start the connecting  database");
	EMP ep=new EMP();
	
	ep.setEmpName("Akash Bhendeakar");
	ep.setSalary(10000);
	em.persist(ep);
	
	Manager mg=new Manager();
	mg.setDepthName("Administrative");
	mg.setSalary(45000);
	mg.setEmpName("Akshay Dengale");
	em.persist(mg);
	
 	EMP ep2=new EMP();
	ep2.setEmpName("RockyBhai");
	ep2.setSalary(10000);
	em.persist(ep);
	
	Manager mg2=new Manager();
	mg2.setDepthName("Quality Analyst");
	mg2.setSalary(45000);
	mg2.setEmpName("Ragnar lorthbrok");
	em.persist(mg);
	
	
	
	em.getTransaction().commit();
	
	System.out.println("Added Emp and Manager");
	em.close();
	fac.close();
	}

}

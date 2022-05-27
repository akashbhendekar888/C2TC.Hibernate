package com.tns.repository;

import javax.persistence.*;

public class JPAUtil {
          //API is used to access a database in a particular unit of work  
		private static EntityManagerFactory factory;
		private static EntityManager entityManager;
		
		static 
		{
			factory = Persistence.createEntityManagerFactory("JPA-PU");
		}
		
		public static EntityManager getEntityManager()
		{
			if(entityManager==null || !entityManager.isOpen()) {
				entityManager = factory.createEntityManager();
			}
			return entityManager;
		}
		
	}








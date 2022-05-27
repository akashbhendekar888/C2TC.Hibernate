package com.cg.User.Repository;

import com.cg.User.entities.User;


import javax.persistence.EntityManager;
public class UserRepositoryImpl implements IuserRepository{
	
	// start the jpa life cycle
	private EntityManager entityManager;
	
      public UserRepositoryImpl() {
		
		entityManager = JPAUtil.getEntityManager();
	}


	@Override
	public User addNewUser(User user) {
	
		entityManager.persist(user);
		return user;
	}

	@Override

		public void removeUser(int id) {
			 User user=entityManager.find(User.class, id);
		entityManager.remove(user);
		
		
		
	}

	@Override
	public User updateUser(User user) {
	 entityManager.merge(user);
	 return user;
		
	}
	@Override
	public void beginTransaction() {
		entityManager.getTransaction().begin();
		
	}

	@Override
	public void commitTransaction() {
		entityManager.getTransaction().commit();
		
	}



	

	
	

}

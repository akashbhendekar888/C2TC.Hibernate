package com.tns.repository;

import javax.persistence.*;

import com.tns.entities.College;

public class CollegeRepositoryImpl implements ICollegeRepository{
	
	private EntityManager entityManager;
	 
	//define constructor
	public CollegeRepositoryImpl() {
		entityManager=JPAUtil.getEntityManager();
	}
	

	@Override
	public College addCollege(College college) {
		entityManager.persist(college);
		return college;
	}

	@Override
	public College updateCollege(College college) {
		entityManager.merge(college);
		return college;
	}

	@Override
	public College searchCollege(int id) {
		College college=entityManager.find(College.class, id);
		return college;
	}

	@Override
	public void deleteCollege(int id) {
		College college=entityManager.find(College.class,id);
		entityManager.remove(college);
	
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

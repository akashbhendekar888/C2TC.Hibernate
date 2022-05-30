package com.tns.PlacementManagementSystem.repository;

import javax.persistence.EntityManager;

import com.tns.PlacementManagementSystem.entities.Student;

public class StudentRepositoryImpl implements IStudentRepository{
	//Step 1 :- Start JPA LifeCycle
		private EntityManager entityManager;
		
		public StudentRepositoryImpl() 
		{
			entityManager = JPAUtil.getEntityManager();
		}
	     //create operation - Repo/DAO(Data Access Object) 
		@Override
		public Student addStudent(Student student)
		{
			entityManager.persist(student);
			return student;
		}

		@Override
		public Student updateStudent(Student student)
		{
			entityManager.merge(student);
			return student;
		}

		@Override
		public Student searchStudendByID(int id) 
		{
			Student student = entityManager.find(Student.class , id);
			return student;
		}

		@Override
		public Student searchStudendByHallTicket(int hallTicketNo)
		{
			Student student = entityManager.find(Student.class , hallTicketNo);
			return student;
		}

		@Override
		public Student deleteStudent(int id) 
		{
			Student student = entityManager.find(Student.class , id);
			entityManager.remove(student);
			return student;
		}
		@Override
		public void beginTransaction()
		{
			entityManager.getTransaction().begin();
		}
		@Override
		public void commitTransaction() 
		{
			entityManager.getTransaction().commit();
			
		}
		@Override
		public Student addCertificate(Student student) 
		{
			entityManager.persist(student);
			return student;
		}
		@Override
		public Student updateCertificate(Student student)
		{
			entityManager.persist(student);
			return student;
		}
		@Override
		public Student deleteStudent(Student student) 
		{
			entityManager.remove(student);   
			return student;
		}
		

}

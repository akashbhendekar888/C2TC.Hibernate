package com.tns.PlacementManagementSystem.service;

import com.tns.PlacementManagementSystem.entities.Student;
import com.tns.PlacementManagementSystem.repository.*;
public class StudentServiceImpl implements IStudentService {
	// Step 1: Establishing connection between Service and Repo
		private IStudentRepository dao;

		public StudentServiceImpl()
		{
			dao = new StudentRepositoryImpl();
			
		}
	    //Step 2: Service calls to perform CRUD operatrion 
		@Override
		public Student addStudent(Student student) 
		{
			dao.beginTransaction(); 
			dao.addStudent(student);
			dao.commitTransaction();
			return student;
		}

		@Override
		public Student updateStudent(Student student) 
		{
			dao.beginTransaction();
			dao.updateStudent(student);
			dao.commitTransaction();
			return student;
		}

		@Override
		public Student searchStudendByID(int id) {
			Student student = dao.searchStudendByID(id);
			return student;
		}

		@Override
		public Student searchStudendByHallTicket(int hallTicketNo) 
		{
			Student student = dao.searchStudendByID(hallTicketNo);
			return student;
		}

		@Override
		public Student addCertificate(Student student) 
		{
			dao.beginTransaction();
			dao.addCertificate(student);
			dao.commitTransaction();
			return student;	
		}

		@Override
		public Student updateCertificate(Student student) 
		{
			dao.beginTransaction();
			dao.updateCertificate(student);
			dao.commitTransaction();
			return student;	
		}

		@Override
		public Student deleteStudent(Student student) {
			dao.beginTransaction();
			dao.deleteStudent(student);
			dao.commitTransaction();
			return student;
		}

}

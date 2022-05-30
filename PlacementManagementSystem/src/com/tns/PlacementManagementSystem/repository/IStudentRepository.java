package com.tns.PlacementManagementSystem.repository;

import com.tns.PlacementManagementSystem.entities.Student;

public interface IStudentRepository {
	
	public Student addStudent(Student student);
	public Student updateStudent(Student student);
	public Student searchStudendByID(int id);
	public Student searchStudendByHallTicket(int hallTicketNo);
	public Student  deleteStudent(Student student);     // boolean->Student
	
	public Student addCertificate(Student student);
	public Student updateCertificate(Student student);
	
	
	public abstract void beginTransaction();
	public abstract void commitTransaction();
	
	Student deleteStudent(int id);
	
	
}




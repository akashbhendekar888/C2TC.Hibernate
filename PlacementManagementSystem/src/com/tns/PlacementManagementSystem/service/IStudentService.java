package com.tns.PlacementManagementSystem.service;

import com.tns.PlacementManagementSystem.entities.Student;

public interface IStudentService {
	
	public Student addStudent(Student student); 
	public Student updateStudent(Student student); 
	public Student searchStudendByID(int id);
	public Student searchStudendByHallTicket(int id); 
	
	public Student addCertificate(Student student); 
	
	public Student updateCertificate(Student student);
	
	public Student deleteStudent(Student student); 
}

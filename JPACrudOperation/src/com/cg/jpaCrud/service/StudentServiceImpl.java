package com.cg.jpaCrud.service;

import com.cg.jpaCrud.Dao.StudentDao;
import com.cg.jpaCrud.Dao.StudentDaoImpl;
import com.cg.jpaCrud.Entitys.Student;

public class StudentServiceImpl implements StudentService{
	private StudentDaoImpl dao;

	public StudentServiceImpl() 
	{
		dao = new StudentDaoImpl();
	}

	@Override
	public void addStudent(Student student) 
	{
		dao.beginTransaction();
		dao.addStudent(student);
		dao.commitTransaction();
	}
	
	@Override
	public void updateStudent(Student student) 
	{
		dao.beginTransaction();
		dao.updateStudent(student);
		dao.commitTransaction();
	}
	
	@Override
	public void removeStudent(Student student) 
	{
		dao.beginTransaction();
		dao.removeStudent(student);
		dao.commitTransaction();
	}
	
	@Override
	public Student findStudentById(int id) 
	{
		//no need of transaction, as it's an read/retrieve operation
		Student student  = dao.getStudentById(id);
		return student;
	}
}



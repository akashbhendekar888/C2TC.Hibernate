package com.cg.jpaCrud.Dao;

import com.cg.jpaCrud.Entitys.Student;

public interface StudentDao {
	public abstract Student getStudentById(int id);

	public abstract void addStudent(Student student);

	public abstract void removeStudent(Student student);

	public abstract void updateStudent(Student student);
	
	

	public abstract void commitTransaction();//save

	public abstract void beginTransaction();//start db

}


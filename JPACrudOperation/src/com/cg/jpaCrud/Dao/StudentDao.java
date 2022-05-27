package com.cg.jpaCrud.Dao;

import com.cg.jpaCrud.Entitys.Student;

public interface StudentDao {
	public abstract Student getStudentById(int id);

	public abstract Student addStudent(Student student);

	public abstract Student removeStudent(Student student);

	public abstract void updateStudent(Student student);
	
	

	public abstract void commitTransaction();//save

	public abstract void beginTransaction();//start db

}


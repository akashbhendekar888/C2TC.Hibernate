package com.cg.jpaCrud.Dao;

import javax.persistence.EntityManager;

import com.cg.jpaCrud.Entitys.Student;

public class StudentDaoImpl implements StudentDao {
	private EntityManager entityManager;

	public StudentDaoImpl() {
		
		entityManager = JPAutil.getEntityManager();
	}

	@Override
	public Student getStudentById(int id) {
		Student student = entityManager.find(Student.class, id);
		return student;
	}

	@Override
	public Student addStudent(Student student) {
		entityManager.persist(student);
		return student;
	}

	@Override
	public Student removeStudent(Student student) {
		entityManager.remove(student);
		return student;
	}

	@Override
	public void updateStudent(Student student) {
		entityManager.merge(student);
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


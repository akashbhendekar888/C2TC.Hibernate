package com.cg.jpaCrud;



import com.cg.jpaCrud.Entitys.Student;
import com.cg.jpaCrud.service.StudentService;
import com.cg.jpaCrud.service.StudentServiceImpl;

public class Cleint {

	public static void main(String[] args) {

		//Debug this program as Debug -> Debug as Java Application
		
		StudentService service = new StudentServiceImpl();
		
	
		Student student = new Student();
		System.out.println("Start the life cycle of JPA");
		
		 // Create Operation
		/*student.setSid(106);
		student.setSname("joyce");
		service.addStudent(student);
		*/
		
		//at this breakpoint, we have added one record to table
		// Retrive  Operation
		/*student = service.findStudentById(100);
		
		System.out.print("ID:"+student.getSid());
		System.out.println(" Name:"+student.getSname()); // 
	*/
		 
		// Update Operation
		student = service.findStudentById(106);
		student.setSname("timothy");
		service.updateStudent(student);
		
		//at this breakpoint, we have updated record added in first section
		/*
		student = service.findStudentById(100);
		System.out.print("ID:"+student.getSid());
		System.out.println(" Name:"+student.getSname());  // Sachin Tendulkar
		
	
		//at this breakpoint, record is removed from table
		// Delete Operation
		try {
		student = service.findStudentById(106);
		service.removeStudent(student);
		}catch(Exception e) {System.out.println(e);}
		System.out.println("End of program/Life cycle completed...");  
	
	*/
		

	}
}

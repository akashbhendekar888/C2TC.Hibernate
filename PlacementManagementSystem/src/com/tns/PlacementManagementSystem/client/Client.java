package com.tns.PlacementManagementSystemManagementSystem.client;
import java.time.LocalDate;



import com.tns.PlacementManagementSystem.entities.*;
import com.tns.PlacementManagementSystem.service.*;


public class Client {
	
	public static void main(String[]args) {
		        LocalDate ld = LocalDate.now();
				Student student = new Student();
				IStudentService st = new StudentServiceImpl();
				student.setName("Abhishek");
				student.setRoll(6);
				student.setQualification("Graduation");
				student.setCourse("Btech");
				student.setYear(2022);
				student.setHallTicketNo(322);
				
				College college = new College();
				ICollegeService cl = new CollegeServiceImpl();

				
				college.setCollegeName("RGGEC");
				college.setLocation("Kangra");
				
				college.getStudent().add(student);
				student.setCollege(college);
				
				
				Certificate certificate = new Certificate();
				ICertificateService cr = new CertificateServiceImpl();
				
				certificate.setYear(2020);
				
				certificate.setStudent(student);
				student.setCertificate(certificate);
				certificate.setCollege(college);
				college.getCertificate().add(certificate);
				
				PlacementManagementSystem PlacementManagementSystem = new PlacementManagementSystem();
				IPlacementManagementSystemService pl = new PlacementManagementSystemServiceImpl();
				
				
				PlacementManagementSystem.setName("Abhishek");
				PlacementManagementSystem.setDate(ld);
				PlacementManagementSystem.setQualification("Graduation");
				PlacementManagementSystem.setYear(2022);
				
				PlacementManagementSystem.setCollege(college);
				college.getPlacementManagementSystem().add(PlacementManagementSystem);
				
				
				User user = new User();
				IUserService us = new UserServiceImpl();
				
				
				user.setName("Abhishek");
				user.setPassword("123456");
				user.setType("Fresher");
				
				user.setCollege(college);
				college.setCollegAdmin("user");
				
				
				Admin admin = new Admin();
				
				admin.setName("Abhishek");
				admin.setPassword("123456");
				
				admin.setUser(user);
				user.setAdmin(admin);
				
				st.addStudent(student);
				cl.addCollege(college);
				cr.addCertificate(certificate);
				pl.addPlacementManagementSystem(PlacementManagementSystem);
				us.addNewUser(user);
				pl.cancelPlacementManagementSystem(5);
				
				
			}

	

}

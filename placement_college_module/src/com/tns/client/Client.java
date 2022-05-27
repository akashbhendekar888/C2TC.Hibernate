package com.tns.client;

import com.tns.entities.College;
import com.tns.services.*;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		College college=new College();
		ICollegeService service=new CollegeServiceImpl();
		
		System.out.println("Start the JPA CRUD Operation");
		//Persist data
	/*	college.setId(15);
		college.setCollegeName("Adsul college");
		college.setCollegeAdmin("prof.Joshi sir");
		college.setLocation("Mumbai");
		service.addCollege(college);
		System.out.println("Add successfully");
		
		*/
		//search and Update Data
		         
			    college=service.searchCollege(14);
			    System.out.println("Id is :"+college.getId());
			    System.out.println("College Admin is :"+college.getCollegeAdmin());
			    System.out.println("CollegeName is :"+college.getCollegeName());
			    System.out.println("Location is :"+college.getLocation());
                System.out.println("Retrive the data successfully");	
                
                //update data
			/*	college.setCollegeName("Pune University");
				college.setCollegeAdmin("Admin");
				college.setLocation("Mumbai");
				service.updateCollege(college);
				System.out.println("Search Data and Updated");
		
		
		service.deleteCollege(13);
		System.out.println("delete data successfully");
        */
	}

}

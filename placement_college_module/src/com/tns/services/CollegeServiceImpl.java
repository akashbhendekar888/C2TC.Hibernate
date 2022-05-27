package com.tns.services;

import com.tns.entities.College;
import com.tns.repository.CollegeRepositoryImpl;
import com.tns.repository.ICollegeRepository;

public class CollegeServiceImpl implements ICollegeService{
	     
        CollegeRepositoryImpl service;
        //define constructor
       public CollegeServiceImpl() {
    	  //create object
    	   service=new CollegeRepositoryImpl();
       }
	
	@Override
	public College addCollege(College college) {
		service.beginTransaction(); //begin the transaction
		service.addCollege(college);
		service.commitTransaction();//save the transaction
		return college;
	}

	@Override
	public College updateCollege(College college) {
		service.beginTransaction();
		service.updateCollege(college);
		service.commitTransaction();
		return college;
	}

	@Override
	public College searchCollege(int id) {
		service.beginTransaction();
		College college =service.searchCollege(id);
		service.commitTransaction();
		return college;
	}

	@Override
	public void deleteCollege(int id) {
		service.beginTransaction();
		service.deleteCollege(id);
		service.commitTransaction();
		
	
	}
	@Override
	public boolean schedulePlacement(String placement) {
		return false;
	}
	

	

}

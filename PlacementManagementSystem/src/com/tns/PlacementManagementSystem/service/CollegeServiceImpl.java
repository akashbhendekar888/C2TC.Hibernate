package com.tns.PlacementManagementSystem.service;

import com.tns.PlacementManagementSystem.entities.College;
import com.tns.PlacementManagementSystem.repository.CollegeRepositoryImpl;
import com.tns.PlacementManagementSystem.repository.ICertificateRepository;
import com.tns.PlacementManagementSystem.repository.IcollegeRepository;

public class CollegeServiceImpl implements ICollegeService {
	private IcollegeRepository clg;

	public CollegeServiceImpl() {
		clg = new CollegeRepositoryImpl();
	}

	@Override
	public College addCollege(College college) {
		clg.beginTransaction();
		clg.addCollege(college);
		clg.commitTrasaction();
		return college;
	}

	@Override
	public College updateCollege(College college) {
		clg.beginTransaction();
		clg.updateCollege(college);
		clg.commitTrasaction();
		return college;
	}

	@Override
	public College searchCollege(int id) {
		College college = clg.searchCollege(id);
		return college;
	}

	@Override
	public boolean deleteCollege(int id) {

		clg.deleteCollege(id);

		return false;
	}

	@Override
	public boolean schedulePlacement(String placement) {
		// TODO Auto-generated method stub
		return false;
	}

}



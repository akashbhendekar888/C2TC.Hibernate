package com.tns.PlacementManagementSystem.repository;

import com.tns.PlacementManagementSystem.entities.College;

public interface IcollegeRepository {
	public College addCollege(College college);
	public College updateCollege(College college);
	public College searchCollege(int id);
	public  boolean deleteCollege(int id);
	


	public abstract void beginTransaction();
	public abstract void commitTrasaction();


}

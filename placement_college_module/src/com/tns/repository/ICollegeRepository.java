package com.tns.repository;

import com.tns.entities.College;

public interface ICollegeRepository {
	
	College addCollege(College college);
	College updateCollege(College college);
	College searchCollege(int id);
	void deleteCollege(int id);
	
	//Start new Transaction
	public abstract void beginTransaction(); 
	//Transaction succeeded
	public abstract void commitTransaction();

}

package com.tns.services;

import com.tns.entities.College;

public interface ICollegeService {
	
	College addCollege(College college);
	College updateCollege(College college);
	College searchCollege(int id);
	void deleteCollege(int id);
	boolean schedulePlacement(String placement);
}
 

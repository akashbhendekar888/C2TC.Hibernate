package com.tns.PlacementManagementSystem.service;

import com.tns.PlacementManagementSystem.entities.College;

public interface ICollegeService {



public College addCollege(College college);
public College updateCollege(College college);
public College searchCollege(int id);
public boolean deleteCollege(int id);
public boolean schedulePlacement(String placement);

}



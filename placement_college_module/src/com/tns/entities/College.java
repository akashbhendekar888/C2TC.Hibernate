package com.tns.entities;

import javax.persistence.*;

@Entity
@Table(name="collegedb")
public class College {
	@Id
	private int  id;
	private String collegeAdmin;
	private String collegeName;
	private String location;
	//geter and seter method
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCollegeAdmin() {
		return collegeAdmin;
	}
	public void setCollegeAdmin(String collegeAdmin) {
		this.collegeAdmin = collegeAdmin;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	

}

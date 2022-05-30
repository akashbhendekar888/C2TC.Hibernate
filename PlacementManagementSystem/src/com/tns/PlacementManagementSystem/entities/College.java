package com.tns.PlacementManagementSystem.entities;

import javax.persistence.*;


@Entity
@Table(name="college")
public class College {
	@Id
	private int id;
	private String collegAdmin;

	private String collegeName;
	private String location;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCollegAdmin() {
		return collegAdmin;
	}
	public void setCollegAdmin(String collegAdmin) {
		this.collegAdmin = collegAdmin;
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

package com.tns.JPAinheritance;

import javax.persistence.Entity;

@Entity
public class Manager extends EMP {
	private String depthName;

	public String getDepthName() {
		return depthName;
	}

	public void setDepthName(String depthName) {
		this.depthName = depthName;
	}
	

}

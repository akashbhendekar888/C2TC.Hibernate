package com.tns.JPAinheritance;


import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="emp")
@Inheritance (strategy=InheritanceType.SINGLE_TABLE)  // Mention only in parent class
@DiscriminatorColumn(name="emp_type",discriminatorType=DiscriminatorType.STRING)
@DiscriminatorValue("EMP")
public class EMP {

@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int empid;
private String empName;
private int salary;
public int getEmpid() {
	return empid;
}
public void setEmpid(int empid) {
	this.empid = empid;
}
public String getEmpName() {
	return empName;
}
public void setEmpName(String empName) {
	this.empName = empName;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}

}
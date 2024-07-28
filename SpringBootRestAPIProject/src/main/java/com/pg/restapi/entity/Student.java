package com.pg.restapi.entity; 

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity

@Table(name = "student")
public class Student {
	
	@Id //used this to make the roll no a primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY) //using this to prevent manual entry of roll numbers
	private int rollNo;
	@Column(name= "student_name")
	private String name;
	@Column(name = "student_percentage")
	private float percentage;
	@Column(name = "student_branch")
	private String branch;
	
	public Student() {
		
		 
	}
	
	
	
	public Student(String name, float percentage, String branch) {
		super();
		this.name = name;
		this.percentage = percentage;
		this.branch = branch;
	}



	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPercentage() {
		return percentage;
	}
	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	 
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", percentage=" + percentage + ", branch=" + branch
				+ "]";
	}
	
	

	
	
}

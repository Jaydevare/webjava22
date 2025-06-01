package com.app.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "stu")
@Getter
@Setter
@ToString
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private int id;
	@Column(name="first_name")
	String firstname;
	@Column(name = "last_name")
	String lastname;
	@Column
	int m1;
	@Column
	int m2;
	@Column
	int m3;
	@Column
	int total;
	@Column
	float percentage;

	
	public int getTotal()
	{
		return m1+m2+m3;
	}
	
	
	public Student() {
		
	}

	public Student(String firstname, String lastname, int m1, int m2, int m3, int total,float percentage) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
		this.total = total;
		this.percentage=percentage;
	}
	
	
	  public float getPercentage() 
	  { 
		 float  perc = ((m1+m2+m3)*100)/300f;
		  
		  return perc;
	  }
	 
	

	
	
	
}

package com.app.service;

import java.util.List;

import com.app.entity.Student;

public interface StudentService {
	
	public List<Student> getStudents();
	public void saveStudents(Student theCustomer);
	public Student getStudent(int theId);
	public void deleteStudent(int theId); 
}

package com.app.dao;

import java.util.List;

import com.app.entity.Student;

public interface StudentDAO {
	public List<Student> getStudents();
	public void saveStudents(Student theCustomer);
	public Student getStudent(int theId);
	public void deleteStudent(int theId); 
}

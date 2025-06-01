package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.StudentDAO;
import com.app.entity.Student;



@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentDAO studentDAO;
	
	@Override
	@Transactional
	public List<Student> getStudents() {
		
		return studentDAO.getStudents();
	}

	@Override
	@Transactional
	public void saveStudents(Student theStudent) {
		studentDAO.saveStudents(theStudent);
		
	}

	@Override
	@Transactional
	public Student getStudent(int theId) {
		
		return studentDAO.getStudent(theId);
	}

	@Override
	@Transactional
	public void deleteStudent(int theId) {
		studentDAO.deleteStudent(theId);
		
	}
	
	/*
	 * @Override
	 * 
	 * @Transactional public void deleteCustomer(int id) {
	 * customerDAO.deleteCustomer(id); }
	 */

}

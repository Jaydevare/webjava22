package com.app.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.entity.Student;


@Repository
public class StudentDAOImpl implements StudentDAO{
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<Student> getStudents() {
		Session currentSession = sessionFactory.getCurrentSession();
				Query<Student> theQuery = currentSession.createQuery("from Student Order by lastname", Student.class);
				List<Student> students = theQuery.getResultList();
				return students;
	}

	@Override
	public void saveStudents(Student theStudent) {
		Session currenSession = sessionFactory.getCurrentSession();
		currenSession.merge(theStudent);
		
	}

	@Override
	public Student getStudent(int theId) {
		Session currentSession = sessionFactory.getCurrentSession();
		Student theStudent = currentSession.get(Student.class, theId);
		return theStudent;
	}

	@Override
	public void deleteStudent(int theId) {
		Session currentSession = sessionFactory.getCurrentSession();
		Student theStudent = currentSession.get(Student.class, theId);
		currentSession.remove(theStudent);
		
	}

	
	
	
	
	
	

}

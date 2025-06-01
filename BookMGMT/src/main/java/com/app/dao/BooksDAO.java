package com.app.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.app.entity.Books;



public class BooksDAO
{
	public static int saveBook(Books b)
	{
		SessionFactory factory =null;
		Session session = null;
		try {
			factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Books.class).buildSessionFactory();
			session = factory.openSession();
			session.beginTransaction();
			
			int id = (int)session.save(b);
			session.getTransaction().commit();
			return id;
		} catch (Exception e) {
			return 0;
		}finally {
			session.close();
			factory.close();
		}
	}
	
	public static List<Books> getAllBook() 
	{
		SessionFactory factory =null;
		Session session = null;
		
		try {
			factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Books.class).buildSessionFactory();
			session = factory.openSession();
			session.beginTransaction();
			
			Query query = session.createQuery("from Books");
			List<Books> l = query.list();
			return l;
		} catch (Exception e) {
			return null;
		}finally {
			session.close();
			factory.close();
		}
	}
	
	public static Books getBookById(int id)
	{
		SessionFactory factory =null;
		Session session = null;
		
		try {
			factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Books.class).buildSessionFactory();
			session = factory.openSession();
			session.beginTransaction();
			Books stud = session.get(Books.class, id);
			System.out.println(stud);
			System.out.println("======");
			return stud;
		} catch (Exception e) {
			return null;
		}finally {
			session.close();
			factory.close();
		}
	}
	
	public static int updateBook(Books b) 
	{
		SessionFactory factory = null;
		Session session = null;
		int i = 0;
		try {
			factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Books.class).buildSessionFactory();
			session = factory.openSession();
			session.beginTransaction();
			session.update(b);
		
			session.getTransaction().commit();
			i = 1;
			return i;
		}catch (Exception e) {
			return 0;
		}finally {
			session.close();
			factory.close();
		}
	}
	 
	public static int deleteBook(int id)
	{
		SessionFactory factory = null;
		Session session = null;
		int i = 0;
		try {
			factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Books.class).buildSessionFactory();
			session = factory.openSession();
			session.beginTransaction();
			System.out.println(id);
			Books stu = session.get(Books.class, id);
			session.remove(stu);
			session.getTransaction().commit();
			i =1;
			return i;
		} catch (Exception e) {
			return 0;
		}finally {
			session.close();
			factory.close();
		}
	}
}

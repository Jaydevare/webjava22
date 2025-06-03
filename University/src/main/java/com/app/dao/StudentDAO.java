package com.app.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.app.model.Student;

public class StudentDAO 
{
	public static Connection getConnection() throws ClassNotFoundException, SQLException
	{
		Connection con = null;
		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db2","root", "e");
		return con;
	}
	
	public  static int regstudent(Student s) 
	{
		int i =0;
		try {
			Connection con = getConnection();
			PreparedStatement pstmt = con.prepareStatement("insert into student(name, mk1, mk2 ,mk3) values(?,?,?,?)");
			pstmt.setString(1, s.getName());
			pstmt.setFloat(2, s.getS1());
			pstmt.setFloat(3, s.getS2());
			pstmt.setFloat(4, s.getS3());
			
			i = pstmt.executeUpdate();
			return i;
		} catch (Exception e) {
			return i;
		}
	}
	
	public static Student getStudent(int p) throws ClassNotFoundException, SQLException 
	{
		Student stu = new Student();
		Connection con = getConnection();
		
		PreparedStatement pstmt = con.prepareStatement("select * from student where prn = ?");
		pstmt.setInt(1, p);
		ResultSet rs = pstmt.executeQuery();
		boolean status = rs.next();
		
		if(status)
		{
			stu.setPrn(rs.getInt(1));
			stu.setName(rs.getString(2));
			stu.setS1(rs.getFloat(3));
			stu.setS2(rs.getFloat(4));
			stu.setS3(rs.getFloat(5));
		}
		return stu;
	}
}

package com.app.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.app.bean.Employee;

public class EmployeeDao 
{
	public static Connection getConnection() throws ClassNotFoundException, SQLException 
	{
		Connection con = null;
		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db2","root", "");
		return con;
	}
	
	public static int insertEmp(Employee e) throws ClassNotFoundException, SQLException
	{
		Connection con = getConnection();
		int i =0;
		try {
			PreparedStatement pstmt = con.prepareStatement("insert into employee(name,email,password,gender,country) values(?,?,?,?,?)");
			pstmt.setString(1, e.getName());
			pstmt.setString(2, e.getEmail());
			pstmt.setString(3, e.getPassword());
			pstmt.setString(4, e.getGender());
			pstmt.setString(5, e.getCountry());
			
			i = pstmt.executeUpdate();
		} catch (Exception e2) {
			return i;
		}
		return i;
	}
	
	public static List<Employee> getAllEmployee() throws SQLException, ClassNotFoundException
	{
		List<Employee> list = new ArrayList<Employee>();
		Connection con = getConnection();
		PreparedStatement pstmt = con.prepareStatement("select *from employee");
		ResultSet rs = pstmt.executeQuery();
		while(rs.next())
		{
			Employee e = new Employee();
			e.setId(rs.getInt(1));
			e.setName(rs.getString(2));
			e.setEmail(rs.getString(3));
			e.setPassword(rs.getString(4));
			e.setGender(rs.getString(5));
			e.setCountry(rs.getString(6));
			list.add(e);
		}
		return list;
	}
	
	
	public static Employee getEmployeeId(int id) throws SQLException, ClassNotFoundException
	{
		Employee e = null;
		Connection con = getConnection();
		PreparedStatement stmt = con.prepareStatement("select *from employee where id=?");
		stmt.setInt(1, id);
		ResultSet rs = stmt.executeQuery();
		while(rs.next())
		{
			e = new Employee();
			e.setId(rs.getInt(1));
			e.setName(rs.getString(2));
			e.setEmail(rs.getString(3));
			e.setPassword(rs.getString(4));
			e.setGender(rs.getString(5));
			e.setCountry(rs.getString(6));
		}
		return e;
	}
	
	public static int updateEmployee(Employee e) throws SQLException
	{
		int i = 0;
		try
		{
		Connection con = getConnection();
		PreparedStatement stmt = con.prepareStatement("update employee set name=?,password=?,email=?,gender=?,country=? where id=?");
		stmt.setString(1, e.getName());
		stmt.setString(2, e.getEmail());
		stmt.setString(3, e.getPassword());
		stmt.setString(4, e.getGender());
		stmt.setString(5, e.getCountry());
		stmt.setInt(6, e.getId());
		i = stmt.executeUpdate();
		}catch (Exception e1) {
			return i;
		}
		return i;
	}
	
	public static int deleteEmployee(int id)
	{
		int i = 0;
		try {
			Connection con = getConnection();
			PreparedStatement stmt = con.prepareStatement("delete from employee where id=?");
			stmt.setInt(1, id);
			
			i = stmt.executeUpdate();
		} catch (Exception e) {
			return i;
		}
		return i;
	}
}

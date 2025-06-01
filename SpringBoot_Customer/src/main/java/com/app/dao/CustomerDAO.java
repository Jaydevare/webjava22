package com.app.dao;

import java.util.List;

import com.app.entity.Customer;

public interface CustomerDAO 
{
	public List<Customer> getCustomer();
	
	public Customer getCustomerById(int id);
	
	public void saveCustomer(Customer coustmer);
	
	public void deleteCustomer(int id);
	
	public void updateCustomer(int id,Customer customer1);
}

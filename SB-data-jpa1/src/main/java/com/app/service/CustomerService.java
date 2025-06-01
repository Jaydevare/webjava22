package com.app.service;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;

import com.app.entity.Customer;

public interface CustomerService {
	
	public List<Customer> getCustomers();
	
	public Customer getCustomerById(int id);
	
	public void saveCustomer( Customer theCustomer);
	
	public void deleteCustomer(Customer theCustomer);
	
	public int getCustomerCount();
	
	public Customer findByEmail(String email);

}

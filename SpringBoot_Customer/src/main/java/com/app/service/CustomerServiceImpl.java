package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.CustomerDAO;
import com.app.entity.Customer;

import jakarta.transaction.Transactional;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerDAO customerDAO;
	
	@Override
	public List<Customer> getCustomer() {
		return customerDAO.getCustomer() ;
	}

	@Override
	public Customer getCustomerById(int id) {
		return customerDAO.getCustomerById(id);
	}

	@Override
	@Transactional
	public void saveCustomer(Customer customer) 
	{
		customerDAO.saveCustomer(customer);
	}

	@Override
	@Transactional
	public void deleteCustomer(int id) {
		customerDAO.deleteCustomer(id);
	}

	@Override
	@Transactional
	public void updateCustomer(int id,Customer customer1) {
		customerDAO.updateCustomer(id, customer1);
	}

}

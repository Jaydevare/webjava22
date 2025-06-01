package com.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.CustomerRepository;
import com.app.entity.Customer;


@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepository customerRepository;


	@Override
	public List<Customer> getCustomers() {
		
	 List<Customer> list =	customerRepository.findAll();
	 return list;
		
	}

	@Override
	public Customer getCustomerById(int id) {
		Customer c = null;
		try {
	Optional<Customer> o =customerRepository.findById(id);
	 c = o.get();
	 //isEmpty() isPresent()
		}catch (Exception e) {
			return null;
		}
	return c;
	}

	@Override
	public void saveCustomer(Customer theCustomer) {
		
		customerRepository.save(theCustomer);
		
	}

	@Override
	public void deleteCustomer(Customer theCustomer) {
		customerRepository.delete(theCustomer);
	}

	@Override
	public int getCustomerCount() {
		
		return customerRepository.getCustomerCount();
	}

	@Override
	public Customer findByEmail(String email) {
		return customerRepository.findByEmail(email);
	}
}

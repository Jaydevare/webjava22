package com.app.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.entity.Customer;
import com.app.service.CustomerService;

@RestController
@RequestMapping("/api")
public class CustomerRestController {
	
	private CustomerService customerService;

	public CustomerRestController(CustomerService customerService) {
		super();
		this.customerService = customerService;
	}
	
	@GetMapping("/customers")
	public List<Customer> getCustomers()
	{
		return customerService.getCustomers();
	}
	
	@GetMapping("/customers/{id}")
	public Customer getCustomerById(@PathVariable("id") int id) throws Exception
	{
		Customer customer =  customerService.getCustomerById(id);
		if(customer == null)
		{
			throw new Exception("Customer Not Found with id = "+id);
		}
		else
			return customer;
	}
	
	@PostMapping("/customers")
	public void saveCustomer(@RequestBody Customer theCustomer)
	{
		
		customerService.saveCustomer(theCustomer);
	}
	
	@PutMapping("/customers")
	public Customer updateCustomer(@RequestBody Customer theCustomer)
	{
		customerService.saveCustomer(theCustomer);
		return theCustomer;
		
	}
	
	@DeleteMapping("/customers/{id}")
	public String deleteCustomer(@PathVariable("id") int id)
	{
		Customer c = customerService.getCustomerById(id);
		if(c == null)
		{
			return "Customer not found with id = "+id;
		}
		customerService.deleteCustomer(c);
		return "Customer Deleted with id: "+id;		
	}
	
	
	@GetMapping("/customers/count")
	public int getCustomerCount()
	{
		return customerService.getCustomerCount();
	}
	
	@GetMapping("/customers/email")
	public Customer findByEmail(@RequestParam("email") String email)
	{
		return customerService.findByEmail(email);
	}
}

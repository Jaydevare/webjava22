package com.app.contoller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.app.entity.Customer;
import com.app.service.CustomerService;

@RestController
@RequestMapping("/api")
public class CustomerContoller 
{
	private CustomerService customerService;

	public CustomerContoller(CustomerService customerService) {
		super();
		this.customerService = customerService;
	}
	
	@GetMapping("/customers")
	public List<Customer> getCustomer()
	{
		return customerService.getCustomer();
	}
	
	@GetMapping("/customers/{id}")
	public Customer getCustomerById(@PathVariable("id") int id) throws Exception
	{
		Customer coustmer = customerService.getCustomerById(id);
		if(coustmer == null)
		{
			throw new Exception("Customer Not Found");
		}
		else 
			return coustmer;
	}
	
	@PostMapping("customers")
	public void saveCustomer(@RequestBody Customer coustmer)
	{
		customerService.saveCustomer(coustmer);
	}
	
	@DeleteMapping("customers/{id}")
	public String deleteCustomer(@PathVariable int id)
	{
		Customer coustmer = customerService.getCustomerById(id);
		if(coustmer == null)
		{
			return "Customer Not Found";
		}
		
		customerService.deleteCustomer(id);
		return "Customer Deleted";
		
	}
	
	@PutMapping("customers/{id}")
	public String updateCustomer(@PathVariable int id, @RequestBody Customer customer1)
	{
		Customer coustmer = customerService.getCustomerById(id);
		if(coustmer == null)
		{
			return "Customer Not Found";
		}
		customerService.updateCustomer(id,customer1);
		return "Customer Updated";
	}
}

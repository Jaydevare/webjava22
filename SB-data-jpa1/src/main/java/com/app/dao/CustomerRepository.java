package com.app.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.app.entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer>{

	@Query("select count(id) from Customer")
	public int getCustomerCount();
	
	//@Query("select c from Customer c where c.email= :email")
	public Customer findByEmail(String email);
	
	
}

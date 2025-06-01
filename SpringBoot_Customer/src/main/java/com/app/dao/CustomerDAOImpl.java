package com.app.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.entity.Customer;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;

@Repository
public class CustomerDAOImpl implements CustomerDAO {
	
	@Autowired
	private EntityManager entityManager;

	@Override
	public List<Customer> getCustomer() {
		
		Query query = entityManager.createQuery("from Customer");
		List<Customer> list = query.getResultList();
		return list;
	}

	@Override
	public Customer getCustomerById(int id) {
		
		return entityManager.find(Customer.class, id);
	}

	@Override
	public void saveCustomer(Customer customer) {
		entityManager.persist(customer);
//		Customer theCustomer = entityManager.merge(customer);
//		theCustomer.setId(customer.getId());
	}

	@Override
	public void deleteCustomer(int id) {
		
		Customer customer = entityManager.find(Customer.class, id);
		entityManager.remove(customer);
	}

	@Override
	public void updateCustomer(int id ,Customer customer1) {
		Customer customer = entityManager.find(Customer.class, id);
		customer.setFirstName(customer1.getFirstName());
		customer.setLastName(customer1.getLastName());
		customer.setEmail(customer1.getEmail());
	}

}

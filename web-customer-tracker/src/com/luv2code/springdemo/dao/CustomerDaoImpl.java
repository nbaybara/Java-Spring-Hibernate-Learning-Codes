package com.luv2code.springdemo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.luv2code.springdemo.entity.Customer;

@Repository
public class CustomerDaoImpl implements CustomerDAO {
	//We need to inject teh sessionfactory
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<Customer> getCustomers() {
		
		//get the current hibernate session
		Session currentSession=sessionFactory.getCurrentSession();
		//create a query
		Query<Customer> theQuery=
				currentSession.createQuery("from Customer order by lastName",Customer.class);
		//execute and get result list
		List<Customer> customers=theQuery.getResultList();
		//return the results
		return customers;
	}

	@Override
	public void saveCustomer(Customer theCustomer) {
		//get current hibernate session
		Session currentSession=sessionFactory.getCurrentSession();
		currentSession.save(theCustomer);		
	}

}

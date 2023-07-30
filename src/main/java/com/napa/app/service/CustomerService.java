package com.napa.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.napa.app.Repository.CustomerRepository;

import com.napa.app.entity.Customer;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepository customerrepository;

	public Customer AllCustomerSelect(@PathVariable("customerid") String customerid) {
		return customerrepository.findByCustomerid(customerid);
	}

}

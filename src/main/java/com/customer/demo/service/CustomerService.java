package com.customer.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.customer.demo.entity.CustomerEntity;
import com.customer.demo.repo.CustomerRepo;

@Service
public class CustomerService {
	@Autowired
	CustomerRepo cusRepo;
	public void saveCustomernewRecord(CustomerEntity cusData) {
} 
}
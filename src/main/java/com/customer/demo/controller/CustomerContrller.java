package com.customer.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.customer.demo.entity.CustomerEntity;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class CustomerContrller {
	@Autowired
	CustomerContrller cusSer;
@PostMapping("/name/address/mobile")
public String postMethodName(@RequestBody CustomerEntity cusData) {
    cusSer.saveCustomerNewRecord(cusData);
    return ("successfully added new customer");
}
private void saveCustomerNewRecord(CustomerEntity cusData) {
	
}
}


	
	

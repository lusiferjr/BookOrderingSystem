package com.appnivi.bookorderingsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.appnivi.bookorderingsystem.request.AddCustomerRequest;
import com.appnivi.bookorderingsystem.request.FetchCustomerRequest;
import com.appnivi.bookorderingsystem.request.LoginCustomerRequest;
import com.appnivi.bookorderingsystem.request.UpdateCustomerRequest;
import com.appnivi.bookorderingsystem.response.Response;
import com.appnivi.bookorderingsystem.service.CustomerService;

@RestController
public class CustomerController {
	@Autowired
	CustomerService customerservice;
	
	@PostMapping(path = "/addcustomer")
	public Response addStudent(@RequestBody AddCustomerRequest request) {
		return customerservice.addCustomer(request);
	}
	@PostMapping(path="/logincustomer")
	public Response loginCustomer(@RequestBody LoginCustomerRequest request) {
		return customerservice.loginCustomer(request);
	}
	@GetMapping(path="/fetchcustomer")
	public Response fetchCustomer() {
		return customerservice.fetchCustomer();
	}
	@PutMapping(path="/updatecustomerinfo")
	public Response updatecustomerinfo(@RequestBody UpdateCustomerRequest request) {
		return customerservice.updateCustomer(request);
	}
}

package com.appnivi.bookorderingsystem.service;

import org.springframework.stereotype.Service;

import com.appnivi.bookorderingsystem.request.AddCustomerRequest;
import com.appnivi.bookorderingsystem.request.FetchCustomerRequest;
import com.appnivi.bookorderingsystem.request.LoginCustomerRequest;
import com.appnivi.bookorderingsystem.response.Response;
@Service
public interface CustomerService {
	
	Response addCustomer(AddCustomerRequest customer);

	Response loginCustomer(LoginCustomerRequest request);

	Response fetchCustomer();
}

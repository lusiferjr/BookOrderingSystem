package com.appnivi.bookorderingsystem.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.appnivi.bookorderingsystem.model.Customer;
import com.appnivi.bookorderingsystem.repository.CustomerRepository;
import com.appnivi.bookorderingsystem.request.AddCustomerRequest;
import com.appnivi.bookorderingsystem.request.FetchCustomerRequest;
import com.appnivi.bookorderingsystem.request.LoginCustomerRequest;
import com.appnivi.bookorderingsystem.response.Response;
import com.appnivi.bookorderingsystem.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService{
	@Autowired
	CustomerRepository customerrepository;
	@Override
	public Response addCustomer(AddCustomerRequest request) {
		Customer customer=new Customer();
		Response response =new Response();
		customer.setUsername(request.getUsername());
		customer.setPassword(request.getPassword());
		customer.setAddress(request.getAddress() );
		customer.setPhone(request.getPhone());
		customer=customerrepository.save(customer);
		if(customer==null) {
			response.setError(true);
			response.setMessage("customer not Added");
			response.setResponse(null);
		}
		else {
			response.setError(false);
			response.setMessage("customer Added");
			response.setResponse(customer);
		}
		return response;
		
	}
	@Override
	public Response loginCustomer(LoginCustomerRequest request) {
		// TODO Auto-generated method stub
		Response response=new Response();
		List<Customer> customer;
		customer=customerrepository.loginCustomer(request.getPassword(),request.getUsername());
		if(customer.size()==0) {
			response.setError(true);
			response.setMessage("wrong id or password");
			response.setResponse(null);
		}
		else {
			response.setError(false);
			response.setMessage("customer loged in");
			response.setResponse(customer);
		}
		
		return response;
	}
	@Override
	public Response fetchCustomer() {
		// TODO Auto-generated method stub
		Response response=new Response();
		List<Customer> customer;
		customer=customerrepository.findAll();
		if(customer.size()<1) {
			response.setError(true);
			response.setMessage("no customer found");
			response.setResponse(null);
		}
		else {
			response.setError(false);
			response.setMessage("customer found");
			response.setResponse(customer);
		}
		
		return response;
	}
	
}

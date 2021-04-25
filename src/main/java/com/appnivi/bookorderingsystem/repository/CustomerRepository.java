package com.appnivi.bookorderingsystem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.appnivi.bookorderingsystem.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long>{

	@Query(value="Select * from customer ",nativeQuery = true)
	List<Customer> loginCustomer(String password, String username);

}

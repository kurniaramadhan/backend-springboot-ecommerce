package org.jvmitenas.ecommerce.dao;

import org.jvmitenas.ecommerce.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

public interface CustomerRespository extends JpaRepository<Customer, Long> {
	
	Customer findByEmail(String theEmail);
	
}

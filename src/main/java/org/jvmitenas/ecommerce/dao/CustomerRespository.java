package org.jvmitenas.ecommerce.dao;

import org.jvmitenas.ecommerce.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRespository extends JpaRepository<Customer, Long> {

}

package com.sadusha.rentcloud.profileservice.repository;

import com.sadusha.rentcloud.commons.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {
}

package com.showmetheplace.showmetheplace.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.showmetheplace.showmetheplace.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long>{
    
}

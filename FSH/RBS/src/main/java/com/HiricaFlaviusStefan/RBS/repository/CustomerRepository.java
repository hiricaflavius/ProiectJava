package com.HiricaFlaviusStefan.RBS.repository;

import com.HiricaFlaviusStefan.RBS.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
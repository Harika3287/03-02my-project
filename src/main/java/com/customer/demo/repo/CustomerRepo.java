package com.customer.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepo extends JpaRepository<String, Integer> {

}

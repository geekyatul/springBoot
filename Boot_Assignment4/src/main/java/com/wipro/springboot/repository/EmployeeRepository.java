package com.wipro.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.springboot.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

}

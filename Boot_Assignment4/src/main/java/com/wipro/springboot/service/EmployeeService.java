package com.wipro.springboot.service;

import java.util.List;

import com.wipro.springboot.model.Employee;

public interface EmployeeService {
	
	List < Employee > getAllEmployees();
    void saveEmployee(Employee employee);
    Employee getEmployeeById(int id);
   
}

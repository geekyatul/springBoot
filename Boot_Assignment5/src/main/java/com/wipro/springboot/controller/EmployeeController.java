package com.wipro.springboot.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wipro.springboot.model.Employee;


@Controller
public class EmployeeController {
	
	   Map<Integer, Employee> employee;
	
	  
	   
	   @PostConstruct
	   public void addEmp()
	   {
		   employee=new HashMap<>();
		   Employee e1=new Employee(1, "atul patel", "atul@gmail.com", "Indore");
		   Employee e2=new Employee(2, "ajay yadav", "ajay@gmail.com", "Betul");
		   Employee e3=new Employee(3, "mohit punashiya", "mohit@gmail.com", "Khargon");
		   Employee e4=new Employee(4, "tarun Rathore", "tarun@gmail.com", "Khandwa");
		   Employee e5=new Employee(5, "shri Krishna", "krishna@gmail.com", "Jabalpur");
		   employee.put(e1.getId(), e1);
		   employee.put(e2.getId(), e2);
		   employee.put(e3.getId(), e3);
		   employee.put(e4.getId(), e4);
		   employee.put(e5.getId(), e5);
		 }
	   
	   @GetMapping("/employees")
	   @ResponseBody
	   public Map<Integer, Employee> allEmployee()
	   {
		      return employee;   
	   }
	   
	   
	   @GetMapping("/employees/{id}")
	   @ResponseBody
	   public Employee Employee(@PathVariable int id)
	   {
		   
		    for(Map.Entry<Integer,Employee>set:employee.entrySet())
		    {
		    	if(set.getKey()==id)
		    	{
		    		return set.getValue();
		    	    	
		    	}
		    	
		    }
		    return null;
		    
		    
		         
	   }
	   
	   @PostMapping("/employees")
	   public void saveEmployee(@RequestBody Employee emp)
	   {
		   employee.put(emp.getId(), emp);
	   }
	   
	   @PutMapping("employees/{id}")
       public Employee updateEmployee(@PathVariable int id,@RequestBody Employee emp)
       {
		   employee.put(id,emp);
		   return emp;
       }
	   
	   @DeleteMapping("employees/{id}")
	   public Map<Integer, Employee> deleteEmployee(@PathVariable int id)
	   {

		    for(Map.Entry<Integer,Employee>set:employee.entrySet())
		    {
		    	if(set.getKey()==id)
		    	{
		    		employee.remove(id);
		    	    	
		    	}
		    	
		    }
		    return employee;
		   
		   
	   }
	   

}

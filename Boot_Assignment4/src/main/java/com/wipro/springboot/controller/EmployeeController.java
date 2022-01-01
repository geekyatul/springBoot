package com.wipro.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wipro.springboot.model.Employee;
import com.wipro.springboot.service.EmployeeService;


@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    //We have to save the things and redirect to display page 
    
  
    @GetMapping("/")
    public String viewHomePage(Model model) {
    	  Employee employee = new Employee();
          model.addAttribute("employee", employee);
          return "index";
    }

    @GetMapping("/employees/displayAll")
    public String showNewEmployeeForm(Model model) {
        
    	model.addAttribute("listEmployees",employeeService.getAllEmployees());
    	return "employees";
    }

    @PostMapping("/saveEmployee")
    public String saveEmployee(@ModelAttribute("employee") Employee employee) {
        // save employee to database
        employeeService.saveEmployee(employee);
        return "redirect:/";
    }

    @GetMapping("/employees/display/{id}")
    public String showFormForUpdate(@PathVariable(value = "id") int id, Model model) {

        // get employee from the service
        Employee employee = employeeService.getEmployeeById(id);
        model.addAttribute("employee",employee);
           return "employee";
      
    }

  
}
package com.wipro.springboot.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/bank")
public class BankController {
	
	 
	@RequestMapping(value = "/branches",method =RequestMethod.GET)
	public String getBranches(Model model)
	{  
		List<String> branches=new ArrayList<>(Arrays.asList("Mg Road - Bengaluru","K H Rd. Bangalore",
				"ayanagar 8Th Block","Sarjapur Road","Wilson Garden"));
		
		model.addAttribute("branches", branches);
		return "bankwithbranch";
	}
	
	@GetMapping("/services")
    public String services(Model model)
    {
	   List<String> serviceList=new ArrayList<>(Arrays.asList("Advancements of loans.","Cheque payments.","Discounting on bills of exchange.",
			   "Credit cards.","Debit Cards"));   	
	     model.addAttribute("services",serviceList);
    	return "bankwithServices";
    }
	
}

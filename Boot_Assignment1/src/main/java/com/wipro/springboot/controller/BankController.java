package com.wipro.springboot.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;
import com.wipro.springboot.model.Bank;

@RestController
@RequestMapping("/bank")
public class BankController {
	
     List<Bank> list;	  
        
       public BankController()
       {
    	    list=new ArrayList<>();
    	   Bank b1=new Bank(1,"HDFC","Indore");
           Bank b2=new Bank(2,"SBI","Jabalpur");
           Bank b3=new Bank(3,"BOI","Dehli");
           Bank b4=new Bank(4,"ICCI","Banglore");
           
            list.add(b1);
            list.add(b2);
            list.add(b3);
            list.add(b4);
       }
       
       @GetMapping("/names/{id}")
       public String BankName(@PathVariable("id") int bankid)
       {
    	   for(Bank bank:list)
    	   {
    		   if(bank.getId()==bankid)
    			     return bank.getName();
    	   }
    	   
		return null;
    	   
       }
       
       @GetMapping("/address/{id}")
       public String BankAddress(@PathVariable("id") int bankid)
       {
    	   for(Bank bank:list)
    	   {
    		   if(bank.getId()==bankid)
    			     return bank.getAddress();
    	   }
    	   
		return null;
    	   
       }
       
	    

}

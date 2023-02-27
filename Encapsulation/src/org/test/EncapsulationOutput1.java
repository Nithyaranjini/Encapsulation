package org.test;

import java.util.ArrayList;
import java.util.List;

public class EncapsulationOutput1 {
	  
		public static void main(String[] args) {  
			List<Encapsulation1>li = new  ArrayList<>();
		     
			Encapsulation1 acc=new Encapsulation1 ();  
		     
		    acc.setAcc_no(7560504000L);  
		    acc.setName("priya");  
		    acc.setEmail("priya@gamail.com");  
		    acc.setAmount(5000f); 
		    
		    Encapsulation1 acc1=new Encapsulation1 (); 
		    
		    acc1.setAcc_no(345436487L);  
		    acc1.setName("sree");  
		    acc1.setEmail("sree@gamail.com");  
		    acc1.setAmount(15000f);
		    li.add(acc);
		    li.add(acc1);
		     
		    for (int i = 0; i <li.size(); i++) {
		    	System.err.println(li.get(i).getAcc_no());
		    	System.err.println(li.get(i).getName());
		    	System.err.println(li.get(i).getEmail());
		    	System.out.println(li.get(i).getAmount());
			}
		    
		  
		}  
		}  





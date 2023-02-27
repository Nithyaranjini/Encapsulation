package org.test;

import java.util.HashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class ClassUsingMap {
	

	public static void main(String[] args) {
		Map<String, PojoClass >m = new LinkedHashMap<>();
		//Set<PojoClass> set= new LinkedHashSet<>();
		PojoClass c = new PojoClass();
		c.setName("priya");
		c.setAge(25);
	   
		c.setAcc_no(254567677l);
	    c.setSalary(542435.466f);
	    PojoClass c1 = new PojoClass();
	    c1.setName("rami");
		c1.setAge(24);
	    c1.setAcc_no(2547777655l);
	    c1.setSalary(5443536.12345456788f);
	    m.put("1st",c);
	    m.put("2nd ", c1);
	    System.out.println("using for each");
	 //   Set <Entry<String, PojoClass>>entrySet=m.entrySet();
		for (HashMap.Entry<String, PojoClass>x:m.entrySet()) {
	    	System.out.println(x.getKey());
	    	System.out.println(x.getValue().getName());
	    	
	    	System.out.println(x.getValue().getAcc_no());
	    	System.out.println(x.getValue().getSalary());}
	    	
	    	
			
		
	
	}}



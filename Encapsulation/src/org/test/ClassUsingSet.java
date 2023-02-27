package org.test;

import java.util.LinkedHashSet;
import java.util.Set;

public class ClassUsingSet {
	public static void main(String[] args) {
		Set<PojoClass> set= new LinkedHashSet<>();
		PojoClass c = new PojoClass();
		c.setName("priya");
		c.setAge(25);
	    c.setAcc_no(254567677l);
	    c.setSalary(542435.466f);
	    PojoClass c1 = new PojoClass();
	    c1.setName("nithya");
		c1.setAge(22);
	    c1.setAcc_no(25454655l);
	    c1.setSalary(5443536.12345456788f);
	    set.add(c);
	    set.add(c1);
	    System.out.println("using for each");
	   
	    for (PojoClass pojo : set) {
			System.out.println(pojo.getName());
			System.out.println(pojo.getAge());
			System.out.println(pojo.getAcc_no());
			System.out.println(pojo.getSalary());
		}
		
	}

}

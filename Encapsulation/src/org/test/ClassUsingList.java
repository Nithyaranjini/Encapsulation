package org.test;

import java.util.LinkedList;

import java.util.List;

public class ClassUsingList {
	public static void main(String[] args) {
	List<PojoClass>list = new LinkedList<>();
	PojoClass c = new PojoClass();
	c.setName("priya");
	c.setAge(25);
    c.setAcc_no(254567677l);
    c.setSalary(542435.466f);
    PojoClass c1 = new PojoClass();
    c1.setName("pooja");
	c1.setAge(28);
    c1.setAcc_no(254534455l);
    c1.setSalary(54.12345f);
    list.add(c);
    list.add(c1);
    System.out.println("Using for loop iteration");
    for(int i =0;i<list.size();i++)
    {
    	System.out.println(list.get(i).getName());
    	System.out.println(list.get(i).getAge());
    	System.out.println(list.get(i).getAcc_no());
    	System.out.println(list.get(i).getSalary());
    }
    System.out.println("using foreach loop iteration");
    for (PojoClass p : list) {
    	System.out.println(p.getName());
    	System.out.println(p.getAge());
		System.out.println(p.getAcc_no());
		System.out.println(p.getSalary());
	}
    	
}}

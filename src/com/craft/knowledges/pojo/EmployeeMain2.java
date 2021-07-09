package com.craft.knowledges.pojo;
import java.util.*;

public class EmployeeMain2 {
	public static void main(String[] args) {
	      HashMap<Integer,Employee>  hm1 = new HashMap();
	      Employee emp1 = new Employee();
	 
	      emp1.setEmpid(100);
	      emp1.setEmpname("Hanif");
	      emp1.setEmpsalary(30000.56);
	      hm1.put(100,emp1);
	      Employee  emp2 = new Employee();
	      emp2.setEmpid(200);
	      emp2.setEmpname("Mohammed Iqbal");
	      emp2.setEmpsalary(15000.67);
	      hm1.put(200, emp2);
	  
	     // Employee e2 = hm1.get(200);
	    
	  //    System.out.println(e2.getEmpid()+" "+e2.getEmpname()+ " "+e2.getEmpsalary());
	      Set s= hm1.entrySet();
			Iterator it = s.iterator();

				while(it.hasNext())
	     {
				Map.Entry me= (Map.Entry)it.next();
			//	System.out.print(me.getKey() + " ");
				Employee e1 = (Employee) me.getValue();
			//	System.out.println(e1);
	//		System.out.println(e1.getEmpid()+" "+e1.getEmpname()+ " "+e1.getEmpsalary());	  
	
	
	
	}  }}
	  
 

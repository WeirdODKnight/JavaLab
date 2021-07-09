package com.craft.knowledges.pojo;
import java.util.*;

public class EmployeeMain1 {
	public static void main(String[] args) {
	      ArrayList<Employee>  ar1 = new ArrayList();

	      Employee emp1 = new Employee();
	      emp1.setEmpid(100);
	      emp1.setEmpname("Hanif");
	      emp1.setEmpsalary(30000.56);
	      ar1.add(emp1);
	  
	     Employee  emp2 = new Employee();
	    emp2.setEmpid(200);
	    emp2.setEmpname("Mohammed Iqbal");
	    emp2.setEmpsalary(15000.67);
	    ar1.add(emp2);
	    for(Employee e1:ar1){
	    	  
	        System.out.println(e1.getEmpid()+ " " +e1.getEmpname()+ " "+e1.getEmpsalary());
	          }
	       }
	      }

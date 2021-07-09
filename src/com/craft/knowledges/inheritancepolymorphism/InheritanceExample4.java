package com.craft.knowledges.inheritancepolymorphism;

class Employee{  
	 float salary=40000;  
	}  
public class InheritanceExample4 extends Employee{
	int bonus=10000;  
	 public static void main(String args[]){  
	   InheritanceExample4 p=new InheritanceExample4();  
	   System.out.println("Programmer salary is:"+p.salary);  
	   System.out.println("Bonus of Programmer is:"+p.bonus);  
	}  
	} 
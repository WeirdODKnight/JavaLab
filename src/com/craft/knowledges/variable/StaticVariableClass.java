package com.craft.knowledges.variable;

public class StaticVariableClass {

	private static double salary; //static Variable
	
	public static final String department = "Development"; //static Variable
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		salary= 1000;
		
		System.out.println(department + " average salary " + salary);
		

	}

}

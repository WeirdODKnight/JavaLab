package com.craft.knowledges.variable;

public class LocalVariableClass {

	
	public void showAge() {
		int age =  40;   // Local Variable
		age = age+2;   // age = 40+2 = 42;
		
	
		System.out.println("The value of age: " + age);
	}
	
		public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			LocalVariableClass local = new LocalVariableClass();	
			local.showAge();
			

	}

}
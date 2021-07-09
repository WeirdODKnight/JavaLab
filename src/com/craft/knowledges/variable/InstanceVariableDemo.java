package com.craft.knowledges.variable;

public class InstanceVariableDemo {
	 int age = 25; // <----InstanceVariable Declared outside methods

	public void methodone() {
		int i = 10; // local variable
		
		System.out.println("Value of i:" + i);
		System.out.println("Value of  age:" + age);
	}

	public void methodtwo() {
		int k = 30; // local variable
		System.out.println("Value of k:" + k);
		System.out.println("Value of  age:" + age);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		InstanceVariableDemo var = new InstanceVariableDemo();
		InstanceVariableDemo var1 = new InstanceVariableDemo();
	//	var1.age = 33;
		
		var.methodtwo();
		var.methodone();
		System.out.println("----------------");
		var1.methodone();
		var1.methodtwo();

	}

}
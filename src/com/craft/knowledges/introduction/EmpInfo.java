package com.craft.knowledges.introduction;

//import java.util.Scanner;
import java.util.Scanner;


public class EmpInfo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		
		
		System.out.println("Enter Your Name");
		
		String name = in.nextLine();
		System.out.println("Enter Your Salary");
		int salary = in.nextInt();
		System.out.println("Enter Your bonus");
	
		double bonus = in.nextDouble();

		double total_salary = salary + bonus;

		System.out.println("the name of the employee is : " + name);
		System.out.println("the salary of the employee is : " + salary);
		System.out.println("the bonus of the employee is : " + bonus);
		System.out.println("The total salary of the employee is : " + total_salary);

	}

}

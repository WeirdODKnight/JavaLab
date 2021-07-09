package com.craft.knowledges.variable;

public class InstanceVariableClass {

		public String name; //instance Variable

		private double salary; //instance Variable
		
		int age =30;  //instance Variable

		public InstanceVariableClass(String empName) {
			name = empName;
		}

		public void setSalary(double empSalary) {
			salary = empSalary;
		}

		public void Display() {
			System.out.println("Name of the Employee: " + name); // James
			System.out.println("Salary of the Employee: " + salary); // 1000.0
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub

			InstanceVariableClass instance = new InstanceVariableClass("James");

			instance.setSalary(1000);
			instance.Display();

		}

	}

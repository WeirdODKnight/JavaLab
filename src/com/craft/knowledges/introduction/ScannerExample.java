package com.craft.knowledges.introduction;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the name");
		
		String name = scanner.nextLine() ;
		
		System.out.println("enter Age");
		
		int age=scanner.nextInt();
		
		System.out.println(name + " " + age);

	}

}

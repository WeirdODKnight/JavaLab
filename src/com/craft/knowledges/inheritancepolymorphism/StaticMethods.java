package com.craft.knowledges.inheritancepolymorphism;

public class StaticMethods {

public static int add(int a, int b) {
		
		return a+b;
	}
    
	public static int multi(int a, int b) 
	{
		
		return a*b;
	}
	
	public static int sub(int a, int b)
	{
		return a-b;
	}
	
	public static double div(int a, int b) 
	{
		return a/b;
	}
	
	public static double mod(int a, int b) 
	{
		return a%b;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(StaticMethods.add(11, 13));
		System.out.println(StaticMethods.multi(11, 13));
		System.out.println(StaticMethods.sub(11, 13));
		System.out.println(StaticMethods.div(10, 2));
		System.out.println(StaticMethods.mod(13, 11));
	}
}
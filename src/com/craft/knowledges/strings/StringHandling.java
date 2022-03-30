package com.craft.knowledges.strings;

import java.util.Locale;

public abstract class StringHandling {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String companyName ="Craft Software"; // Create a string using a string literal
		String companyAddress = new String("United States of America"); // Create a String using new keyword (as an object)
		
		System.out.println(companyName.charAt(1)); // Get the character at index of 1
		System.out.println(companyName.length()); // Get the length of the string
		
		// Formating string 
		System.out.println(String.format("%d", 101));          // Integer value  
		System.out.println(String.format("%s", "Craft Software")); // String value  
		System.out.println(String.format("%f", 101.00));       // Float value  
		System.out.println(String.format("%x", 101));          // Hexadecimal value  
		System.out.println(String.format("%c", 'c'));     // Char value
		System.out.println(String.format("|%10d|", 101));  // Specifying length of integer  
		System.out.println(String.format("|%-10d|", 101)); // Left-justifying within the specified width   
		System.out.println(String.format("|%010d|", 101)); // Filling with zeroes  
	    
        System.out.println(companyName.substring(6)); // Get the substring after index of 6
        System.out.println(companyName.substring(2, 8)); // Get the substring between index 8 and 8
        
        System.out.println(companyName.contains("raft")); // Check if it contains a sub string called raft
     
       
        System.out.println(companyName.equals(companyAddress)); // Check the two strings are equal, but it does check the case
        System.out.println(companyName.isEmpty()); // Check if the string is empty
        System.out.println(companyName.concat(companyAddress)); // Concatenate the two strings
        System.out.println(companyName + " " + companyAddress); // Concatenate the two strings
        System.out.println(companyName.replace('C', 'K')); // Replace the character c by k in the string
        System.out.println(companyName.replace("Cra", "Ka")); // Replace the substring Cra by Ka
		System.out.println(companyName.replaceAll("Cra", companyAddress)); // Replace Cra by United states of America
		System.out.println(companyName.equalsIgnoreCase(companyAddress)); // Check the two strings are equal, but it doesn't check the case
		
		boolean status = true;
		int age = 12;
		long height = 33L;
		float pi = 3.14f;
		double weight = 56.6;
		short a = 1;
		byte b = 3;
		System.out.println(String.valueOf(status)); // Change the boolean value to string
		System.out.println(String.valueOf(age)); // Change the integer to string.
		System.out.println(String.valueOf(height)); // Change the long to string.
		System.out.println(String.valueOf(pi)); // Change the float to string.
		System.out.println(String.valueOf(weight)); // Change the double to string.
		System.out.println(String.valueOf(a)); // Change the short to string.
		System.out.println(String.valueOf(b)); // Change the byte to string.

		
		
		String example = "   Craft Software Company   ";
		System.out.println(example.trim()); // Removes the beginning and ending spaces of the string
		System.out.println(example.stripLeading()); // Remove the beginning spaces of the string
		System.out.println(example.stripTrailing()); // Remove the ending spaces of the string
		System.out.println(example.strip()); // Remove the beginning and ending spaces of the string
		
		System.out.println(companyName.toUpperCase()); // Change the characters in the string to upper case (capital letter)
		System.out.println(companyName.toLowerCase()); // Change the characters in the string to lower case (small letter)
		
		System.out.println(companyName.toLowerCase(Locale.FRANCE)); // Change the characters in the string to lower case in France language
		System.out.println(companyName.toUpperCase(Locale.TRADITIONAL_CHINESE)); //Change the characters in the string to upper case in Chinese language
		
	
	    System.out.println(companyName.indexOf("Soft")); // Get the starting index of the substring
	    System.out.println(companyName.indexOf('S')); // Get the starting index of the character
	    
	    System.out.println(companyAddress.intern()); // It can be used to return string from memory if it is created by a new keyword. 
	    

	    String craftName = "Craft-Software-Technologies-Private-Limited-Company";
	    String splitedCraft [] = craftName.split("-"); // Split the string by the delimiter of - 
	    for(String s : splitedCraft)
	    {
	    	System.out.println(s); // Print the splitted array
	    }	    
	    
	    
	    System.out.println(companyName.isBlank()); // Check the string is blank or not
	    System.out.println(companyName.join(" - ", splitedCraft)); // Concatenate the two strings by a delimiter called -
	   
	    
	}
	
	
}

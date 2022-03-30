package com.craft.knowledges.strings;

public class StringBufferHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuffer companyName = new StringBuffer("Craft Software"); // Create a string buffer
		
		StringBuffer fullname = new StringBuffer(30); // Create a string buffer with the size
		
		StringBuffer companyAddress = new StringBuffer("United States of America"); // Create a string buffer and initialize it

		
		System.out.println(companyName.capacity()); // Getting the capacity of the string
		System.out.println(companyName.length()); // Getting the length of the string
		System.out.println(companyName.append(" PLC")); // Append a string in another string
		System.out.println(companyName.insert(2, 'z')); // Insert a character z into index 2
		System.out.println(companyName.insert(6, "soft")); // Insert a string soft into index 6
		System.out.println(companyName.reverse()); // Reverse the characters in the string
		System.out.println(companyName.delete(2, 6)); // Delete the substring from index 2 to 6
		System.out.println(companyName.deleteCharAt(3)); // Delete the character in index 3
		System.out.println(companyName.replace(2, 7, "Company")); // Replace the substring from index 2 to 7 by company
		
		
		
	}

}

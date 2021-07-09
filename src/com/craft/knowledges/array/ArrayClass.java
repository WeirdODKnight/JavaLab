package com.craft.knowledges.array;

public class ArrayClass {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// create a single dimensional array
		int[] ageOfStudents = {67,78,80,95,55,77};
		
		 try {
			 ageOfStudents[2]=12;
	      } catch(ArrayIndexOutOfBoundsException e) {
	         System.out.println("The index you have entered is invalid");
	      }
		 
		 

		 
		
		

//		// Accessing array element
//		for (int i = 0; i < ageOfStudents.length; i++) {
//
//			System.out.println("Age of Student: "+ ageOfStudents[i]);
//		}
        for (int  a: ageOfStudents) {
            System.out.println(a);
       }
	}
}
package com.craft.knowledges.array;

public class MultiDimensionalArray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] stud = { { 50, 65, 70 }, { 55, 68, 75 }, { 57, 61, 78 }, { 59, 60, 71 }, { 67, 90 },
				{ 59, 60, 71, 85 } };

		
	//	System.out.println("Student Marks");
		stud[2][1]=12;
	System.out.println(stud.length);	
		System.out.println(stud[5].length);
		
//		
		for (int i = 0; i < stud.length; i++) {
                      //  System.out.println("Student " + i+1);
			for (int j = 0; j < stud[i].length; j++) {
				System.out.print(stud[i][j] + " ");
			}
			System.out.println();
		}

	}

}
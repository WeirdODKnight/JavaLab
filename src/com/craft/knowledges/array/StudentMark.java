package com.craft.knowledges.array;

public class StudentMark {
	
	
	
	 public static void main(String[] args) {
	      double[]  studentMarks = {67.234,78.45,80,95,55,77};
           calcTotal(studentMarks);
	 }

		public static void calcTotal(double[] m) {
			double total = 0;
			for(int i =0; i<m.length;i++) {
				total = total+m[i];
			}
			System.out.println(total);
			
		}
	     }

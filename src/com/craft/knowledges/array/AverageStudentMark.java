package com.craft.knowledges.array;

public class AverageStudentMark {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
             double [] marks = {10,12.5,16,90,89,23};
             char[] a = {'A','F'};
             
             
             double sum =0;
             for(int i=0; i<marks.length; i++)
             {
            	 sum = sum+marks[i];
             }
            double average = sum/marks.length;
            System.out.println(a[1]);
            System.out.println(average);

	}

}
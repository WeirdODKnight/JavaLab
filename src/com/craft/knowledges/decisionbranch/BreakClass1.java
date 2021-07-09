package com.craft.knowledges.decisionbranch;

public class BreakClass1 {

	 public static void main(String args[]) { 
		 int sum = 0;
		 for (int  i = 0; i < 20; i++) {
		      sum = sum + i;
		      if(sum  >  21){
		                break;          // terminate loop if  sum is greater than 21
		               } 
		        }     // end for statement
		 System.out.println(sum);
		   }
		 }
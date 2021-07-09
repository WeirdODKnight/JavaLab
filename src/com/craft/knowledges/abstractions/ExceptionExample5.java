package com.craft.knowledges.abstractions;

import java.io.IOException;

public class ExceptionExample5 {
	 void m()throws IOException{  
		    throw new IOException("device error");//checked exception  
		  }  
		  void n()throws IOException{  
		    m();  
		  }  
		  void p(){  
		   try{  
		    n();  
		   }catch(Exception e){System.out.println("exception handled");}  
		  }  
		  public static void main(String args[]){  
		   ExceptionExample5 obj=new ExceptionExample5();  
		   obj.p();  
		   System.out.println("normal flow...");  
		  }  
		}  

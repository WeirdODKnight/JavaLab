package com.craft.knowledges.inheritancepolymorphism;

public class MethodOverriding1 extends Human{
	
            
                
		   //Overriding method
		   public void eat(){
		      System.out.println("Boy is eating");
		   }
		   public static void main( String args[]) {
		      MethodOverriding1 obj = new MethodOverriding1();
		      Human a = new Human();
		      //This will call the child class version of eat()
		      obj.eat();
		      a.eat();
		   }
		}

class Human{

	   //Overridden method
	   public void eat()
	   {
	      System.out.println("Human is eating");
	   }
	}
	
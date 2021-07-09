package com.craft.knowledges.inheritancepolymorphism;

class Animal
{  
Animal(){
System.out.println("animal is created");
}  
}  
class Dogie extends Animal{  
      Dogie(){  
     // super();  
     System.out.println("dog is created");  
    }  
}  
public class InheritanceExample1 {
	public static void main(String args[]){  
		Dogie d=new Dogie();  
		}
	}

package com.craft.knowledges.inheritancepolymorphism;

public class MethodOverriding {
	public static void main(String [] args){
        Dog dog = new Hound();
        
        dog.bark();
    }
}
 class Dog{
	 
    public  void bark(){
        System.out.println("woof ");
        
    }
    
}
class Hound extends Dog{
	
	public void bark(){
        System.out.println("bark ");
    }
	
}
 
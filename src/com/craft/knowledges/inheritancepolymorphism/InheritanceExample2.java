package com.craft.knowledges.inheritancepolymorphism;

class Animals{  
void eat(){System.out.println("eating...");}  
}  
class Dogs extends Animals{  
void eat(){System.out.println("eating bread...");}  
void bark(){System.out.println("barking...");}  
void work(){
eat();
super.eat();  
bark();  
}  
}  
public class InheritanceExample2 {
	public static void main(String args[]){  
		Dogs d=new Dogs();  
		d.work();  
		}	
} 
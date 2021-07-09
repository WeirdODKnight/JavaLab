package com.craft.knowledges.inheritancepolymorphism;

class Animale{  
String color="white";  
}  
class Doge extends Animale{  
String color="black";  
void printColor(){  
System.out.println(color);//prints color of Dog class  
System.out.println(super.color);//prints color of Animal class  
}  
}
public class InheritanceExample3 {
	public static void main(String args[]){  
		Doge d=new Doge();  
		d.printColor();  
		}} 
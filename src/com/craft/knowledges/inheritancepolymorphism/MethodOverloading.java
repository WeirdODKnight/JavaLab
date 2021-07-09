package com.craft.knowledges.inheritancepolymorphism;
class Demo { 
    public void addition(int x, int y) 
    { 
        System.out.println(x+y); 
    } 
    public void addition(int x, int y, int z) 
    { 
        System.out.println(x+y+z); 
    } 
    public void addition(int x) 
    { 
        System.out.println(++x); 
    } 
} 
public class MethodOverloading {
	public static void main(String[] args) 
    { 
        Demo d = new Demo();
        d.addition(1,2);
        d.addition(1,2,3);
        d.addition(3);
		
} 

}

package com.craft.knowledges.inheritancepolymorphism;

class OuterClass {
	  int x = 10;
	  
	  class InnerClass {
	    int y = 5;
	  }
	  class a {
		  int z =5;
	  }
	 
	}
public class InnerClassExample {
	public static void main(String[] args) {
	    OuterClass myOuter = new OuterClass();
	 
	    OuterClass.InnerClass myInner = myOuter.new InnerClass();
	    OuterClass.a v = myOuter.new a();
	    System.out.println(myInner.y + myOuter.x + v.z);
	  }
	}
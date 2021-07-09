package com.craft.knowledges.inheritancepolymorphism;

public class OverLoadClass {
	double width;
    double height;                                                                
    double depth;
    OverLoadClass(){
        width = 5;
        height = 10;
        depth = 3;
       }
   OverLoadClass(double w,double h,double d){
        width = w;
        height = h;
        depth = d;
       }
    double volume(){
       return width * height * depth;
          }
     }

class DemoBox{
   public static void main(String args[]){
   OverLoadClass b1 = new OverLoadClass(10,20,30);

   OverLoadClass b2 = new OverLoadClass(5,10,15);
System.out.println(b1.volume());
System.out.println(b2.volume());
}
}
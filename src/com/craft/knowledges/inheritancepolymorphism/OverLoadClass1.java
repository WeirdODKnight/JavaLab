package com.craft.knowledges.inheritancepolymorphism;

public class OverLoadClass1 {

    public  double calcArea(int length,int width)
        {
       double  rectArea = length * width;
       return rectArea;
          }
   public  double calcArea(int radius)
          {
      double  circleArea  = 3.14 * radius * radius;
      return circleArea;
          }

public static void main(String[] args){

OverLoadClass1   ar =   new OverLoadClass1();
double  rarea  = ar.calcArea(12,14);
System.out.println("Area of rectangle:"+ rarea);
double  cArea   = ar.calcArea(10);
System.out.println("Area of  circle :"+ cArea);


}

      }
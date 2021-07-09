package com.craft.knowledges.abstractions;


abstract class Figure {
    abstract  void calcArea(double length);
     

}  




public class AbstractionExample extends Figure{

	@Override
	void calcArea(double length) {
		// TODO Auto-generated method stub
		
		System.out.println(length*length);
	}

	} 


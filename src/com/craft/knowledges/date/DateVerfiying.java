package com.craft.knowledges.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateVerfiying {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   SimpleDateFormat sdf = new SimpleDateFormat ("dd-MM-yyyy");
				      sdf.setLenient(false);
				      String input = "13-02-2018"; 
				      System.out.println("Given Date is:"+ input); 
				      Date  dt;
				      try {
				         dt = sdf.parse(input); 
				          System.out.println(dt); 
				      } catch (ParseException e) { 
				         System.out.println("Invalid date entered :" + input); 
				      }

	}

}

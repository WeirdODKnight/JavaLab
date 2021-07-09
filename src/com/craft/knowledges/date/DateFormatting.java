package com.craft.knowledges.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatting {
	public static void main(String args[]) {
	      Date todaydate = new Date( );
	      SimpleDateFormat  sdf =   new SimpleDateFormat ("dd-MM-yyyy");
	      String newdate = sdf.format(todaydate);
	     
	      System.out.println("Current Date: " + newdate);
	   }
	}

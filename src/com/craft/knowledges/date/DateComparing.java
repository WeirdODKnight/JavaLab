package com.craft.knowledges.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateComparing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleDateFormat sdf = new SimpleDateFormat ("dd-MM-yyyy");
		   String str1 = "12-02-1990";
		   String str2 = "12-02-1998";
		   try{
		   Date d1 =sdf.parse(str1);
		   Date d2 = sdf.parse(str2);
		   System.out.println(d1.compareTo(d2));
		     }
		catch(ParseException pe){System.out.println("Invalid date given");}

	}

}

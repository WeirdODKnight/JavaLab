package com.craft.knowledges.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeFormatting {
	public static void main(String args[]) {
	    Date todaydate = new Date( );
	    SimpleDateFormat sdf = new SimpleDateFormat ("hh:mm:ss");
	    String newtime = sdf.format(todaydate);
	    System.out.println("Current Time: " + newtime);
	    			   }
	    			}

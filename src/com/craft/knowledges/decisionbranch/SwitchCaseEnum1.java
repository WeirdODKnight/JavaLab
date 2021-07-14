package com.craft.knowledges.decisionbranch;

public class SwitchCaseEnum1 {

	enum Days {
	    MONDAY,
	    TUESDAY,
	    WEDNESDAY,
	    THURSDAY,
	    FRIDAY,
	    SATURDAY,
	    SUNDAY;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   // Declaring Enum variable
        Days days;
        days = Days.TUESDAY;
        // Switch keyword
        switch (days) {
  
        // Case statements
        case MONDAY:
            System.out.println("Today is Monday!");
            break;
        case TUESDAY:
            System.out.println("Today is Tuesday!");
            break;
        case WEDNESDAY:
            System.out.println("Today is Wednesday!");
            break;
        case FRIDAY:
            System.out.println("Today is Friday!");
            break;
        case SATURDAY:
            System.out.println("Today is Saturday!");
            break;
        case SUNDAY:
            System.out.println("Today is Sunday!");
  
        default:
            System.out.println("That is not day of the week!");
            break;
        }
    }


}

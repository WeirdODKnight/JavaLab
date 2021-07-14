package com.craft.knowledges.decisionbranch;

import com.craft.knowledges.decisionbranch.SwitchCaseEnum1.Days;

public class SwitchCaseEnum3 {
	
	enum Vowels {
	    A,E,I,O,U,a,e,i,o,u;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   // Declaring Enum variable
       Vowels vowel;
       vowel = Vowels.E;
        // Switch keyword
        switch (vowel) {
  
        // Case statements
        case a:
        case e:
        case i:
        case o:
        case u:
            System.out.println("The alphabet is small case vowel!");
            break;
        case A:
        case E:
        case I:
        case O:
        case U:
        	System.out.println("The alphabet is upper case vowel!");
        	break;
        default:
            System.out.println("The alphabet is not vowel, It is a consonant!");
            break;
        }
    }



	

}

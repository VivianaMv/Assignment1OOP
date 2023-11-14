package Activity1;

import java.util.Scanner;


public class Question13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//13.	Write a program to check if a year is a leap year using if-else statements.
		
		Scanner kb = new Scanner(System.in);
	    System.out.println("Please give me the year ");
	    int year = kb.nextInt();
	    

	    if((year %4 == 0 && year%100 != 0 ) || (year%400 == 0)) { //// if the year is divided by 4
	    	               
	        System.out.println("The year is leap year.");
	    }else {
	        System.out.println("The year is NOT a leap year.");
	    }
	}
	    
	}



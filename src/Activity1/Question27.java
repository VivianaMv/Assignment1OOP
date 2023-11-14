package Activity1;

import java.util.Scanner;

public class Question27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 27.	Write a program to determine the number of days in a month using a switch statement
		
		int month;
		int days;
		
		Scanner kb = new Scanner(System.in);
	    System.out.print("Please the month: ");
	    month= kb.nextInt();	
	    days = kb.nextInt();
	    
	     
	    switch(month) {
	    case 1:
	    case 3:		
	    case 5:	
	    case 7:
	    case 8:
	    case 10:
	    case 12: 
	    	 days = 31;
	    	 break;
	   
	    case 4:		
	    case 6:
	    case 9:
	    case 11:
	    	 days = 30;
			 break;
	    case 2: 
	    	 days = 28;
			 break;	
	    }		
		  System.out.println("The month das "+ days + "days"); 		
	    }
	    
	}



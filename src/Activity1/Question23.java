package Activity1;

import java.util.Scanner;

public class Question23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 23.	Write a program to determine the day of the week based on a number.
		
		
		Scanner kb = new Scanner(System.in);
	    System.out.print("Please give me a number : ");
	    int num = kb.nextInt();
	    switch(num) {
	    case 1:
	    	System.out.print("Sunday ");
	    	break;
	    case 2:
	    	System.out.print("Mon");
	    	break;	
	    case 3:
	    	System.out.print("Tus");
	    	break;
	    case 4:
	    	System.out.print("W");
	    	break;
	    case 5:
	    	System.out.print("Th");
	    	break;	
	    case 6:
	    	System.out.print("Fr");
	    	break;
	    case 7:
	    	System.out.print("Sat");
	    	break;
	    default:	
	    	System.out.print("NODAY");
	    
	      	    }
	}

}

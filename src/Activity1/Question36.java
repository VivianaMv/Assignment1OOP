package Activity1;

import java.util.Scanner;

public class Question36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//36.	Create a program to calculate the square of a number using a while loop.

		Double number, square;
		Scanner kb = new Scanner(System.in);
	    
		System.out.print("Please give me the number : ");	
	    number = kb.nextDouble();
	      
	    double sqrootnum = Math.sqrt(number);
	    while(number >0);  
	     	
	   	System.out.println("The square of the number  is: " +  Math.sqrt(number));	
	    	
	}

}

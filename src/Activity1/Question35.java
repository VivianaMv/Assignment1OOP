package Activity1;


import java.util.Scanner;

public class Question35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//35.	Write a program to calculate the power of a number using a while loop.
		
		
		int base, exponent;
		Scanner kb = new Scanner(System.in);
	    System.out.print("Please give the base: ");
	    base = kb.nextInt();
	    System.out.print("Please give the exponent: ");
	    exponent = kb.nextInt();
	    
	    int result  = 1;
	    int counter = 0;
	    
	    
	    while (counter < exponent) {
	      result *= base;
	      counter++;
	    }

	    System.out.println("raised to the power of " + result);
	  }
		
		
		
	}



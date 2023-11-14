package Activity1;

import java.util.Scanner;

public class Question8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//8.	Create a program to find the square root of a number.
		
		Scanner kb = new Scanner(System.in);
	    System.out.print("Please give me a number: ");	
	    double num = kb.nextDouble();
	    
	    if (num < 0) {
	      System.out.print("I can NOT do it");	
	      
		}else {
			double sqrootnum = Math.sqrt(num);
			System.out.println("the sqr is " + Math.sqrt(num));	
		}
	}

}

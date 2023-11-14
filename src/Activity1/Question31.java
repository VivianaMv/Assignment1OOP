package Activity1;

import java.util.Scanner;

public class Question31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//31.	Write a program to find the factorial of a number using a while loop.
					
			Scanner kb = new Scanner(System.in);
		    System.out.print("Please give the number: ");
		    
		    int N = kb.nextInt();
		    int factorial = 1;
		    int counter = 1;
		    while(counter <= N) {
		    	factorial = factorial * counter;
		    	counter++;
		    }
		    System.out.println("the sum is: " + factorial );
	}

}

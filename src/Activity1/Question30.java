package Activity1;

import java.util.Scanner;

public class Question30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//30.	Create a program to calculate the sum of natural numbers from 1 to N using a while loop.
		
		Scanner kb = new Scanner(System.in);
	    System.out.print("Please give the number: ");
	    
	    int N = kb.nextInt();
	    int sum = 0;
	    int counter = 1;
	    while(counter <= N) {
	    	sum = sum + counter;
	    	counter++;
	    }
	    System.out.println("the sum is: " + sum );
}
}
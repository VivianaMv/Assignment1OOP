package Activity1;

import java.util.Scanner;

public class Question39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//39.	Write a program to find the factorial of a number using a do-while loop
		

		Scanner kb = new Scanner(System.in);
	    System.out.print("Please give the number: ");
	    int num = kb.nextInt();
	    int factorial =1;
	    int counter = 1;
	    do {
            System.out.println(num);
            num++;
	    } while(counter <= num); {
	    	factorial = factorial * counter;
	    	
}
	    System.out.println("the sum is: " + factorial);
	}	
}


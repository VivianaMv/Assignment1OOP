package Activity1;

import java.util.Scanner;

public class Question45 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 45.	Write a program to find the factorial of a number using a for loop
		
		
		int nu, factorial;
		Scanner kb = new Scanner(System.in);
	    System.out.print("Please give the number: ");
	    int num = kb.nextInt();
		factorial = 1;
		 	
		for (int i  = 1; i <= num; i++) {
            factorial *= i;
            	}
		 System.out.println("Factorial of " + num + " is " + factorial);
    }

}


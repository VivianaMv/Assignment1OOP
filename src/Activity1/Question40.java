package Activity1;

import java.util.Scanner;

public class Question40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//40.	Write a program to generate a Fibonacci series using a do-while loop.
		
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter the numbers of tenses of the fibonacci series");
		int num = kb.nextInt();
		int firstTerm = 0;
		int secondTerm = 1;
		
		int count = 0;
		
		
		do {
			int fibonacci = firstTerm +  secondTerm;
			System.out.println(fibonacci + "");
			firstTerm = secondTerm ;
			secondTerm = fibonacci;			
			count ++;
		
		}while (count < num); {

		}
}
}
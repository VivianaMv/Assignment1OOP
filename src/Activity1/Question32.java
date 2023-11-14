package Activity1;

import java.util.Scanner;

public class Question32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 32.	Write a program to generate a Fibonacci series using a while loop.
		
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter the numbers of tenses of the fibonacci series");
		int num = kb.nextInt();
		int firstTerm = 0;
		int secondTerm = 1;
		
		int count = 1;
		
		System.out.println(firstTerm + "");
		
		while (count < num) {
			int fibonacci = firstTerm +  secondTerm;
			System.out.println(fibonacci + "");
			
			
			firstTerm = secondTerm ;
			secondTerm = fibonacci;
			count ++;
		}
	}

}

package Activity1;

import java.util.Scanner;

public class Question41 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//41.	Create a program to reverse a number using a do-while loop.
		
		Scanner kb = new Scanner(System.in);
	    System.out.print("Please give the number: ");
	
		
		int number = kb.nextInt();
		int reversnum = 0;		
			
		
		do {
			int d = number % 10 ;
			reversnum = reversnum * 10 + d;  
			number = number/10;  
			  
			System.out.println(reversnum); 
		
		} while(number != 0);
		
		
		
	}

}

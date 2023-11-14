package Activity1;

import java.util.Scanner;

public class Question33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//33.	Create a program to reverse a number using a while loop.
		Scanner kb = new Scanner(System.in);
	    System.out.print("Please give the number: ");
	
		int number = kb.nextInt();
		int reversnum = 0;		
			
		while(number != 0){   
		int d = number % 10 ;
		reversnum = reversnum * 10 + d;  
		number = number/10;  
		}  
		System.out.println(reversnum);  
	
	}

}

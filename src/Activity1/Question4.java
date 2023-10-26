package Activity1;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//4.	Write a program to calculate the factorial of a number
		
		Scanner kb = new Scanner(System.in);
	    System.out.print("Please give me the number: ");
	    int num = kb .nextInt();
	    if (num < 0) {
	    	System.out.println("Can do the factorial for negative");
	    }else {
			
			int fact = 1;
			for (int i = 1; i<= num ; i++) {
				fact = fact * i;
			}
			System.out.println("the factorial is " + fact);
		}
	    
	    kb.close();
	}
	
}



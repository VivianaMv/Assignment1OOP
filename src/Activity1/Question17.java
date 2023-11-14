package Activity1;

import java.util.Scanner;

public class Question17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//17.	Write a program to find the largest of three numbers using nested if-else statements
		
				
		Scanner kb = new Scanner(System.in);
	    System.out.print("Please give me the number1: ");	
	    double num1 = kb.nextDouble();
	    System.out.print("Please give me the number2: ");	
	    double num2 = kb.nextDouble();
	    System.out.print("Please give me the number3: ");	
	    double num3 = kb.nextDouble();
	    
	    double largest;
	    
	    if ( num1>= num2 && num1 >= num3) {
	    	System.out.print("The lasrgest number is num1:");
	    }else 
	    	System.out.print("The lasrgest number is num2:");
	    	
	    	if(num2 >= num1 && num2 >= num3) {
	    	largest = num2;
	    }else {
	    	largest = num3;
	    			
	    }
	    System.out.print("The lasrgest number is: " + largest);	
	}

	}

}

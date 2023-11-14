package Activity1;

import java.util.Scanner;
public class Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 6.	Write a program to swap two numbers.
		
		Scanner kb = new Scanner(System.in);
	    System.out.print("Please give me the number1 : ");	
	    double num1 = kb.nextDouble();
	    System.out.print("Please give me the number2 : ");	
	    double num2 = kb.nextDouble();
	    System.out.println("The first number  is " + num1);
	    System.out.println("The second number is " + num2);
	    System.out.println("Now swap it:");
	    
	    
	    double temp;
	    temp = num1;
	    num1 = num2;
	    num2 = temp;
	    
	    System.out.println("The first number  is " + num1);
	    System.out.println("The second number is " + num2);
	    		
	}

}

package Activity1;

import java.util.Scanner;

public class Question15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Write a program to find the largest among four numbers.
		
		Scanner kb = new Scanner(System.in);
	    System.out.print("Please give the number1 : ");
	    double num1= kb.nextDouble();
	    System.out.print("Please give me number2 : ");
	    double num2= kb.nextDouble();
	    System.out.print("Please give me number3 : ");
	    double num3= kb.nextDouble();
	    System.out.print("Please give me number4 : ");
	    double num4= kb.nextDouble();
	    
	    double largest;
	    
	    if ( num1>= num2 && num1 >= num3 && num1>= num4) {
	    	largest = num1;
	    }else if(num2 >= num1 && num2 >= num3 && num2>= num4) {
	    	largest = num2;
	    }else if(num3 >= num1 && num3 >= num2 && num3>= num4) {
	    	largest = num3;
	    }else {
	    	largest = num4;
	    			
	    }
	    System.out.print("The lasrgest number is: " + largest);
	    
	}

}

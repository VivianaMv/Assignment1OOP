package Activity1;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 5.	Create a program to find the absolute value of a number without using the Math class.
		
		Scanner kb = new Scanner(System.in);
	    System.out.print("Please give me the number: ");	
	    double num = kb.nextDouble();
	    double absnum;
	    
	    if (num < 0) {
	    	absnum = (-1) * num;
	    	
	    }else {
	    	absnum = num;
						
			}
			System.out.println("the factorial is " + absnum);
		}
	
	}
	



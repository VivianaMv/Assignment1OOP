package Activity1;

import java.util.Scanner;

public class Question38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//38.	Create a program to calculate the sum of natural numbers from 1 to N using a do-while loop.
	
		Scanner kb = new Scanner(System.in);
	    System.out.print("Please give me the number : ");
		
	        int N = kb.nextInt();
    	    int sum = 0;
    	    int counter = 1;
    	    
    	    do {
                System.out.println(counter);
                counter++;
    	    } while(counter <= N); {
    	    	sum = sum + counter;
    	   
    	    }
    	    System.out.println("the sum is: " + sum );
    }
		
	}

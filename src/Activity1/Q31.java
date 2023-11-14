package Activity1;

import java.util.Scanner;

public class Q31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//31.	Write a program to find the factorial of a number using a while loop
		
		Scanner kb = new Scanner(System.in);
	    System.out.print("Please give me the number : ");	
	    
	    int n = kb.nextInt();
	    float f = 1;
	    
	    while (n > 0 ) {
	    	f*= n;
	    	n = n-1;
	    }
	    System.out.print("The factorial number is: " + f);
	
	}

}

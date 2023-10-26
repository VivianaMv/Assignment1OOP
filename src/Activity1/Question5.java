package Activity1;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 5.	Create a program to find the absolute value of a number without using the Math class.
		
		Scanner kb = new Scanner(System.in);
	    System.out.print("Please give me the number: ");	
	
	    int num = kb .nextInt();
	    if (num > 0) {
	    	System.out.println("the absolute value of a number is: ");
	    }else {
			
			int absolute = 1;
			for (int i = 1; i<= num ; i++) {
				absolute = absolute * i;
			}
			System.out.println("the factorial is " + absolute);
		}
	
	}
	

}

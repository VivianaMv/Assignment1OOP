package Activity1;


import java.util.Scanner;

public class Question21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 21.	Create a program to check if a number is a multiple of both 3 and 5.
		
		Scanner kb = new Scanner(System.in);
	    System.out.print("Please give me a number: ");	
	    int num = kb.nextInt();

	    
	    if(num %3 == 0 && num %5 == 0) {
	    	System.out.print("Yes");
	    }else {	
	    	System.out.print("No ");
	    }
	}

}

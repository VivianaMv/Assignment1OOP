package Activity1;

import java.util.Scanner;

public class Question16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create a program to check if a given number is a perfect square

		Scanner kb = new Scanner(System.in);
	    System.out.print("Please give me a number: ");	
	    int number = kb.nextInt();
	    
	    
	    int sqrnum = (int) Math.sqrt(number);
	 
	    
	    if (sqrnum *sqrnum == number) {   
	    	System.out.println("Yes, the given number is perfect square.");  
	    }else {  
	    	System.out.print("No, the given number is not perfect square.");   

}
}
}
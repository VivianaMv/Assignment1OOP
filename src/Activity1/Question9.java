package Activity1;

import java.util.Scanner;

public class Question9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//9.	Write a Java program to check if a person is eligible to vote.
		
		Scanner kb = new Scanner(System.in);
	    System.out.print("Please give me your age: ");	
	    int age = kb.nextInt();
	    
	    if (age <18) {
	    	System.out.println("Sorry you are NOT elegible to vote");	
	    
	    }else {
	    	System.out.println("You can vote");	
	    }

	}

}

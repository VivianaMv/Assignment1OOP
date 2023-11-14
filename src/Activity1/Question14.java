package Activity1;


import java.util.Scanner;

public class Question14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//14.	Create a program to compare two strings for equality.
		
		Scanner kb = new Scanner(System.in);
	    System.out.print("Please enter first string : ");
	    String string1= kb.nextLine();
	    System.out.print("Please enter second string : ");
	    String string2= kb.nextLine();
	    
	    
			if (string1.equals(string2)) {
	            System.out.println("Strings Are Equal");
	        }
	        else {
	            System.out.println("Strings Are not Equal");
	
	}
	}
}


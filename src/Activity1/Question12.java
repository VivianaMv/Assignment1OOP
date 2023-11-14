package Activity1;

import java.util.Scanner;

public class Question12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//12.	Create a program to check if a character is a vowel or a consonant.
		
		Scanner kb = new Scanner(System.in);
	    System.out.print("Please give me character: ");
	    char mychar = kb.next().charAt(0);
	    
	    char lowmychar = Character.toLowerCase(mychar);
	    if (lowmychar == 'a' || lowmychar == 'e' ||lowmychar == 'i' ||lowmychar == 'o' ||lowmychar == 'u') {
	    	System.out.println("It is a vowel  ");
	    }else {
	    	System.out.print("it is a consonant");
	    }
		
	}

}

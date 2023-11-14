package Activity1;

import java.util.Scanner;

public class Question28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//28.	Create a program to check if a character is a vowel or a consonant using a switch statement.
		
		
		int i=0;
		Scanner kb = new Scanner(System.in);
	    System.out.print("Please give me a character: ");
	    char ch= kb.next( ).charAt(0);	    
	    
	    switch(ch)
	    {
	    case 'a':
	    case 'e':		
	    case 'i':	
	    case 'o':
	    case 'u':
	    case 'A':	
	    case 'E':
	    case 'I':	
	    case 'O':
	    case 'U':i++;
	    
	    
	    	if(i==1)
	    		System.out.println("Entered character "+ch+" is  Vowel");
	    		else 
	    			if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
	    			System.out.println("Entered character "+ch+" is Consonent");
	    			else
	    			System.out.println("Not an alphabet");		
	    	
	    }
	}
}
package Activity1;


import java.util.Scanner;

public class Question7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 7.	Write a program to determine if a number is prime.
		
		Scanner kb = new Scanner(System.in);
	    System.out.print("Please give me a number: ");	
	    int num = kb.nextInt();
	    boolean isprime = true;
	    if(num<1) {
	    	isprime = false;
	    }
		
		for (int i = 2; i <= num /2; i++) {
			if ((num % i) == 0) {
			 	isprime = false;
			 	
			}	
		}	
		
		if (isprime) {
					System.out.println("Your num is prime");	
			}else {
				System.out.println("Your number is NOT  prime");	
				return;
			}
			
		}
		
		}
	




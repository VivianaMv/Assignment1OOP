package Activity1;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1.	Write a Java program to check if a number is even or odd.
		
		
		Scanner key = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = key .nextInt();

        if(num % 2 == 0)
            System.out.println(num + " is even");
        else
            System.out.println(num + " is odd");
	}

}

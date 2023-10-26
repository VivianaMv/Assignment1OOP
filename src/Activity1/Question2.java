package Activity1;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner key = new Scanner(System.in);

        System.out.print("Enter 1 number: ");
        int num1 = key .nextInt();
       
        
        System.out.print("Enter 2 number: ");
        int num2 = key .nextInt();
   
        
        
        System.out.print("Enter 3 number: ");
        int num3 = key .nextInt();
        
        double average = (num1 + num2 + num3)/3.0;
        System.out.println("The average is: " + average);
        
	}

}

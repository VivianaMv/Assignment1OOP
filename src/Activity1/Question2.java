package Activity1;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//2.	Write a program to calculate the average of three numbers

		
		Scanner kb = new Scanner(System.in);

        System.out.print("Enter  number1: ");
        int num1 = kb .nextInt();
       
        
        System.out.print("Enter  number2: ");
        int num2 = kb .nextInt();
   
                
        System.out.print("Enter  number3: ");
        int num3 = kb .nextInt();
        
        double average = (num1 + num2 + num3)/3.0;
        System.out.println("The average is: " + average);
        }

}

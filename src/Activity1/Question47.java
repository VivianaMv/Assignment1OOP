package Activity1;

import java.util.Scanner;

public class Question47 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//47.	Write a Java program to calculate the average value of array elements. 
		
	 
		        // Declare an integer array 'numbers' and initialize it with values.
		        double [] numbers = {6.2, 9.5,89, 365, 3.7,9.2};
		        double sum = 0;
		        
		        	        
		        
		        for (double n : numbers) {
		        	 sum = sum + n;
		        }
		        
		        double average = sum / numbers.length;
		        
		 
		        System.out.println("Average value of the array elements is : " + average); 
		    }
}

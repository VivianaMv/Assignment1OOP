package Activity1;

import java.util.Arrays;

public class Q63 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//63.	Write a Java program to test two arrays' equality. 
		
		int a[] = { 30, 35, 40 }; 
		  
        // Initializing the second array 
        int b[] = { 30, 25, 40 }; 
  
        // store the result 
        // Arrays.equals(a, b) function is used to check 
        // whether two arrays are equal or not 
        boolean result = Arrays.equals(a, b); 
  
        // condition to check whether the 
        // result is true or false 
        if (result == true) { 
            // Print the result 
            System.out.println("Two arrays are equal"); 
        } 
        else { 
            // Print the result 
            System.out.println("Two arrays are not equal"); 
        } 
    } 

	}



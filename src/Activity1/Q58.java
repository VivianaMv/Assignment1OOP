package Activity1;

import java.util.Arrays;

public class Q58 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//58.	Write a Java program to find common elements between two integer arrays. 
		
		
		int[] array1 = {5,2,1,4,1,5,8,7,8,9,9};  
        int[] array2 = {12,2,1,64,11,5,18,7,8,9}; 

        // Print the original contents of array1 and array2.
        System.out.println("Array1 : " + Arrays.toString(array1));
        System.out.println("Array2 : " + Arrays.toString(array2));

        // Iterate through both arrays to find and print common elements.
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                // Check if elements in array1 and array2 are equal.
                if (array1[i] == (array2[j])) {
                    // Print the common element.
                    System.out.println("Common element is : " + (array1[i]));
                }
            }
        }
    }
		
		
	



	}



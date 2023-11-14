package Activity1;

import java.util.Arrays;

public class Question54 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//54.	Write a Java program to reverse an array of integer values. 
		
		int[] my_array1 = {55,65,89,1,25,45};
	        
	        
	        
	        System.out.println("Original array : " + Arrays.toString(my_array1));  
	        
	       
	        for (int i = 0; i < my_array1.length /2; i++) {
	            // Swap the elements at positions 'i' and 'length - i - 1'.
	            int temp = my_array1[i];
	            my_array1[i] = my_array1[my_array1.length - i - 1];
	            my_array1[my_array1.length - i - 1] = temp;
	        }
	        
	        // Print the reversed array using Arrays.toString() method.
	        System.out.println("Reverse array : " + Arrays.toString(my_array1));
		
		
		
		
	}

}

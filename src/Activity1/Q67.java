package Activity1;

import java.util.Arrays;

public class Q67 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//67.	Write a Java program to get the difference between the largest and smallest values in an array of integers. The array must have a length of at least 1. 
		
		
		int[] array_nums = {5, 7, 2, 4, 9};

        // Print the original array.
        System.out.println("Original Array: " + Arrays.toString(array_nums));

        // Initialize variables to store the maximum and minimum values.
        int max_val = array_nums[0];
        int min = array_nums[0];

        // Use a loop to find the maximum and minimum values in the array.
        for (int i = 1; i < array_nums.length; i++) {
            if (array_nums[i] > max_val)
                max_val = array_nums[i];
            else if (array_nums[i] < min)
                min = array_nums[i];
        }

        // Calculate and print the difference between the largest and smallest values.
        System.out.println("Difference between the largest and smallest values of the said array: " + (max_val - min));
    }
}

	


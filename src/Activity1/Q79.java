package Activity1;

import java.util.Arrays;

public class Q79 {

	
		// TODO Auto-generated method stub
		//79.	Write a Java program to arrange the elements of an array of integers so that all negative integers appear before all positive integers.   
	
	    
		    public static void main(String[] args) {
		      
		        int arra_nums[] = {-4, 8, 6, -5, 6, -2, 1, 2, 3, -11};
		        
		
		        System.out.println("Original array: " + Arrays.toString(arra_nums)); 
		        
		        int j, temp, arr_size;

		  
		        arr_size = arra_nums.length;

		        for (int i = 0; i < arr_size; i++) {
		            j = i;  
		            
		           
		            while ((j > 0) && (arra_nums[j] > 0) && (arra_nums[j - 1] < 0)) {
		                temp = arra_nums[j];
		                arra_nums[j] = arra_nums[j - 1];
		                arra_nums[j - 1] = temp;
		                j--;
		            }
		        }

		        System.out.println("New array: " + Arrays.toString(arra_nums)); 
		         
		}
}
	



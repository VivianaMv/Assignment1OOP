package Activity1;

import java.util.Arrays;

public class Q77 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//77.	Write a Java program to cyclically rotate a given array clockwise by one.   

		static int a[] = new int[]{1, 2, 3}; 
		  
	
		System.out.println("Input Array is"); 
		System.out.println(Arrays.toString(a)); 
		    
		int x = a[a.length-1], i; 
		for (i = a.length-1; i > 0; i--) 
		  a[i] = a[i-1]; 
		a[0] = x;
		    
		System.out.println("Rotated Array is"); 
		System.out.println(Arrays.toString(a)); 
		
	}

}

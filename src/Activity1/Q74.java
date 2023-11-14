package Activity1;

public class Q74 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//74.	Write a Java program to find the sum of the two elements of a given array equal to a given integer.
		// Sample array: [1,2,4,5,6] 		Target value: 6. 
		
		int[] myArray = {1,2,4,5,6};
		int sum = 0;
		int i; 

		// Loop through the array elements and store the sum in the sum variable
		for (i = 0; i < myArray.length; i++) {
		  sum += myArray[i];
		}

		System.out.println("The sum is: " + sum);
	}

}

package Activity1;
import java.util.Arrays;
public class Q60 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//60.	Write a Java program to find the second largest element in an array. 
		
		int arr[] = {50,6,60,70,80,90,9,150,2,35};
        int largest = arr[0];
        int secondLargest = arr[0];

        System.out.println("The given array is:" );
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];

            } else if (arr[i] > secondLargest) {
                secondLargest = arr[i];

            }
        }

        System.out.println("\nSecond largest number is: " + secondLargest);

    }
}


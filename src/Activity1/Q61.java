package Activity1;

public class Q61 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//61.	Write a Java program to find the second smallest element in an array. 

		

		int arr[] = {50,6,60,70,80,90,9,150,2,35};
        int largest = arr[0];
        int secondsmallest = arr[0];

        System.out.println("The given array is:" );
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < largest) {
                secondsmallest = largest;
                largest = arr[i];

            } else if (arr[i] < secondsmallest) {
            	secondsmallest = arr[i];

            }
        }

        System.out.println("\nSecond largest number is: " + secondsmallest);

    }
}




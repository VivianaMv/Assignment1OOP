package Activity1;

public class Q78 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//78.	Write a Java program to find the rotation count in a given rotated sorted array of integers.   
		
		public static int countRotation(int[] arr,
                int n)
		{
			for (int i = 1; i < n; i++) {

				if (arr[i] < arr[i - 1]) {

					return i;
				}
			}
			
			return 0;
		}


		public static void main(String[] args)
		{
			int[] arr1 = { 4, 5, 1, 2, 3 };

			System.out.println(
					countRotation(
							arr1,
							arr1.length));
		}

	}

}

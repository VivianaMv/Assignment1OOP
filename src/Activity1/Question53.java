package Activity1;

public class Question53 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//53.	Write a Java program to find the maximum and minimum value of an array.
		
		
		
		int [] MyArray = {10,20,30,40,50};
		
		int maxOFarray = findMax(MyArray);
		int minOFarray = findMin(MyArray);
		
		System.out.println("My min is  ");
		System.out.println(" My max is ");
		}

		
		public static int findmax(int[] array) {
			int max = array[0];
			for(int i = 1; i < array.length; i++) {
				if(array[i] > max) {
					max = array[i];
				}
				
				int maxOFarray = findMax(MyArray);
				int minOFarray = findMin(MyArray);
				
			}	
				
			return max ;
			
			System.out.print(mynewarray[i]+ " ");
			
			
		}
}

package Activity1;

public class Question55 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//55.	Write a Java program to find duplicate values in an array of integer values
		
		 int [] arr = new int [] {5,2,1,4,1,5,8,7,8,9,9};  
	        System.out.println("Duplicate elements in given array: ");  
	        //Searches for duplicate element  
	        for(int i = 0; i < arr.length; i++) {  
	            for(int j = i + 1; j < arr.length; j++) {  
	                if(arr[i] == arr[j])  
	                    System.out.println(arr[j]);  
	}

}
}
}
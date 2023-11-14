package Activity1;

public class Q72 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//72.	Write a Java program to remove duplicate elements from a given array and return the updated array length.
		//Sample array: [20, 20, 30, 40, 50, 50, 50]
			//	After removing the duplicate elements the program should return 4 as the new length of the array


		int[] array_nums  = {20, 20, 30, 40, 50, 50, 50};
		int = n;
		 if (n == 0 || n == 1) {
	            return n;
	        }
	 
	        // creating another array for only storing
	        // the unique elements
	        int[] temp = new int[n];
	        int j = 0;
	 
	        for (int i = 0; i < n - 1; i++) {
	            if (a[i] != a[i + 1]) {
	                temp[j++] = a[i];
	            }
	        }
	 
	        temp[j++] = a[n - 1];
	 
	        // Changing the original array
	        for (int i = 0; i < j; i++) {
	            a[i] = temp[i];
	        }
	 
	        return j;
	    }
	    public static void main(String[] args)
	    {
	        int a[] = { 1, 1, 2, 2, 2 };
	        int n = a.length;
	 
	        n = removeduplicates(a, n);
	 
	        // Printing The array elements
	        for (int i = 0; i < n; i++)
	            System.out.print(a[i] + " ");
	    }
	}
			
		}
	}

}

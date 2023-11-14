package Activity1;

public class Q86 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 86.	Write a program to find the sum of the series 1 +11 + 111 + 1111 + .. n terms.  
		
		static int summation(int n)
	    {
	        int sum = 0, j = 1;
	        for (int i = 1; i <= n; i++) 
	        {
	            sum = sum + j;
	            j = (j * 10) + 1;
	        }
	 
	        return sum;
	    }
	 
	  
	    public static void main(String args[])
	    {
	        int n = 5;
	        System.out.println(summation(n));
	    }
	
	 
	
	}

}

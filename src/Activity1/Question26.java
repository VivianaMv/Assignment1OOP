package Activity1;

import java.util.Scanner;

public class Question26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//26.	Write a program to find the discount based on the total purchase amount.
		Scanner kb = new Scanner(System.in);
	    System.out.print("Please give full amount: ");
	    double totalamount = kb.nextDouble();

	    
	    double discountamount = calDiscount(totalamount);
	    System.out.println("your dis is " + discountamount );
	    
	}
	
		public static double calDiscount(double totalamount) {
			double discount = 0;
			
			if(totalamount > 1000) {
				discount = 0.1 * totalamount;
			}else if(totalamount > 500)	{
				discount = 0.05 *totalamount;
			}else {
				 System.out.print("You dont have discount : ");
			}
			
			return discount; 
	}

}

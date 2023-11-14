package Activity1;


import java.util.Scanner;

public class Question22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//22.	Create a program to find the roots of a quadratic equation.

		Scanner kb = new Scanner(System.in);
	    System.out.print("Please give a : ");
	    double a = kb.nextDouble();
	    System.out.print("Please give me b : ");
	    double b = kb.nextDouble();
	    System.out.print("Please give me c : ");
	    double c = kb.nextDouble();
	    
	    double delta = (b * b ) -4 * a * c ;
	    
	    if (delta > 0) {
	    	
	    	double root1 = (-b + Marth.sqrt (delta)) / (2 * a);
	    	double root2 = (-b + Marth.sqrt (delta)) / (2 * a);
	    	System.out.println("The root one is : " + root1);
	    	System.out.println("The root two is : " + root2);
	    	
	    	
	    }else if (delta == 0) {   
	    	double roots = -b / (2 * a);  
	    	System.out.println("the one root is : " + roots);
	    }else {  
	    	System.out.print("You dont have a root"); 
	    
	    
	    
	}

}
}
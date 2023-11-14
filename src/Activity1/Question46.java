package Activity1;

import java.util.Scanner;

public class Question46 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//46.	Create a program to print the multiplication table of a number using a for loop.
		
		
		Scanner kb = new Scanner(System.in);
	    System.out.print("Please give the number: ");
		int num = kb.nextInt();
        for(int i = 1; i <= 10; ++i)
        {
            System.out.printf("%d * %d = %d \n", num, i, num * i);
	}

}
}
package Activity1;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1.	Write a Java program to check if a number is even or odd.
		
		
		Scanner kb = new Scanner(System.in);

        System.out.print("please give me a number: ");
        int num = kb.nextInt();

        if(num % 2 == 0)
            System.out.println(num + "Number is even");
        else
            System.out.println(num + " Number is odd");
        kb.close();
	}

}

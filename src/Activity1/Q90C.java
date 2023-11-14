package Activity1;

import java.util.Scanner;

import java.util.Scanner;
public class Q90C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner kb = new Scanner(System.in);
		System.out.println("Please give me a line");
		int line = kb.nextInt();
		
		for (int i = 0 ; i < line; i ++) {
			for (int j=0; j< i; j++) {
				System.out.print(" ");
			}
				
			for(int k = 0; k <line - i ; k++) {
				System.out.print("* ");
		}
			System.out.println();
	}

	}
}

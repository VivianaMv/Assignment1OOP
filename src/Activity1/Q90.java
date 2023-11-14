package Activity1;

import java.util.Scanner;
public class Q90 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//90.	Print the following patterns using loop getting the number of line from user:
		
		Scanner kb = new Scanner(System.in);
		System.out.println("Please give me a line");
		int line = kb.nextInt();
		
		for (int i = 0 ; i <= line; i ++) {
			for (int j=i; j>=0; j--) {
				System.out.print(line - j);
			}
				System.out.println();
		}
	}
}

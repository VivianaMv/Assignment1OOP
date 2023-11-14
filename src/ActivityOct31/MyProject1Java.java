package ActivityOct31;

import java.util.Scanner;

public class MyProject1Java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner kb = new Scanner(System.in);
		System.out.println("Please give me A : ");
		double num1 = kb.nextDouble();
		System.out.println("Please give me B : ");
		double num2 = kb.nextDouble();
		System.out.println("Please give me C : ");
		double num3 = kb.nextDouble();

		myquadricmethod(num1, num2, num3);

	}

	public static void myquadricmethhod(double a, double b, double c) {
		double delta = (b * b) - 4 * a * c;
		if (delta > 0) {

			double root1 = (-b + Marth.sqrt(delta)) / (2 * a);
			double root2 = (-b + Marth.sqrt(delta)) / (2 * a);
			System.out.println("The root one is : " + root1);
			System.out.println("The root two is : " + root2);

		}
	}
}

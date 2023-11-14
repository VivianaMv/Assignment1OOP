package Activity1;

public class Question34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//34.	Create a program to print the multiplication table of a number using a while loop.
		
		int i = 1;
		
		while(i< 10) {
			int j =1;
			while (j<10) {
				System.out.print(i*j + "  ");
				j++;
			}
			System.out.println();
			i++;
		}
		
		
	}

}

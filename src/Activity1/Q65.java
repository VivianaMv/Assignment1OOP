package Activity1;

public class Q65 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//65.	Write a Java program to move all 0's to the end of an array. Maintain the relative order of the other (non-zero) array elements. 

		
		int[] array_nums = {0, 0, 1, 0, 3, 0, 5, 0, 6};
        int i = 0;

        // Print the original array.
        System.out.print("\nOriginal array: \n");
        for (int n : array_nums)
            System.out.print(n + "  ");

        // Use a loop to move zeros to the end of the array.
        for (int j = 0, l = array_nums.length; j < l;) {
            if (array_nums[j] == 0)
                j++;
            else {
                // Swap the non-zero element with the first available zero.
                int temp = array_nums[i];
                array_nums[i] = array_nums[j];
                array_nums[j] = temp;
                i++;
                j++;
            }
        }

        // Fill the remaining positions with zeros.
        while (i < array_nums.length)
            array_nums[i++] = 0;

        // Print the array after moving zeros to the end.
        System.out.print("\nAfter moving 0's to the end of the array: \n");
        for (int n : array_nums)
            System.out.print(n + "  ");
        System.out.print("\n");
    }
}

	



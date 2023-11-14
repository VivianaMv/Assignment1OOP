package Activity1;

public class Question48 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//48.	Write a Java program to test if an array contains a specific value. 
	
		int[]  nums = {1,9,8,6,32,7};
		
		int chechv = 12;
		boolean isthere = true;
			
		for (int n : nums)
			if(n == chechv) {
				isthere = true;
				break;
			}
	
	if(isthere) {
		System.out.print("yes it contains" + chechv);
	}else {
		System.out.print("NO it is not contains" + chechv);
	
	
	}
	
}
}

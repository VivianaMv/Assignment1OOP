package Activity1;

public class Question52 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] MyArray = {10,20,30,40,50};
		
		int [] mynewarray = insertElement(MyArray, 100,1);
		
		for(int i = 0; i< mynewarray.length; i++) {
			System.out.print(mynewarray[i]+ " ");
	}
}
	
	public static int []insertElement(int []array, int val, int pos){
	
		int mylen =array.length;
		
		int newArray []= new int[mylen + 1];
		
		for(int i = 0, j= 0;  i < mylen+1; i++) {
			if(i== pos) {
				newArray[i] = val;
			}else {
				newArray[i] = array[j];
				j++;
			}
			
		}
			
		
		return newArray;
		
		
		
		
	}		
		
}

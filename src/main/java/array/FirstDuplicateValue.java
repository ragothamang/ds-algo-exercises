package array;

import java.util.Arrays;

public class FirstDuplicateValue {
	
	public static int firstDuplicateValue(int[] array) {
	    // Write your code here.

	    for (int idx = 0; idx < array.length; idx++) {
	      int targetIdx = Math.abs(array[idx]) - 1;
	      System.out.println("targetIdx  "+ targetIdx);
	      if (array[targetIdx] < 0) return Math.abs(array[idx]);

	      array[targetIdx] = -array[targetIdx];
	    }

	    return -1;
	  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ip = {2, 1, 5, 2, 3, 3, 4};
		System.out.println("ip>>  "+ Arrays.toString(ip));
		
		int result = firstDuplicateValue(ip);
		
		System.out.println("result  >  "+ result);
		

	}

}

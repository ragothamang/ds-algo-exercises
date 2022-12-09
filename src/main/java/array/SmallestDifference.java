package array;

import java.util.Arrays;

public class SmallestDifference {
	public static int[] smallestDifference(int[] arrayOne, int[] arrayTwo) {
	    // Write your code here.
	    if (arrayOne == null || arrayTwo == null) return new int[] {};

	    Arrays.sort(arrayOne);
	    Arrays.sort(arrayTwo);

	    System.out.println("arrayOne   "+ Arrays.toString(arrayOne) );
	    System.out.println("arrayTwo   "+ Arrays.toString(arrayTwo));
	    int i = 0, j = 0;
	    int num1 = 0, num2 = 0;
	    int min = Integer.MAX_VALUE, difference = Integer.MAX_VALUE;

	    while (i < arrayOne.length && j < arrayTwo.length) {
	      int val1 = arrayOne[i], val2 = arrayTwo[j];

	      if (val1 < val2) {
	        difference = val2 - val1;	        
	        ++i;
	      } else {
	        difference = val1 - val2;
	        ++j;
	      }
	      
	      System.out.println("val1  "+ val1+"   val2  "+ val2 +" difference>   "+ difference + "   min  "+ min);
	      
	      if (difference < min) {
	        min = difference;
	        num1 = val1;
	        num2 = val2;
	      }
	    }

	    return new int[] {num1, num2};
	  }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arrayOne = {-1, 5, 10, 20, 28, 3};
		int[] arrayTwo = {26, 134, 135, 15, 17};
		
		int[] res = smallestDifference(arrayOne, arrayTwo);
		
		System.out.println(Arrays.toString(res));
	}

}

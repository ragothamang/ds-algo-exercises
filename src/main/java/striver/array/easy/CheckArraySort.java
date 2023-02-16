package striver.array.easy;

import java.util.Arrays;

public class CheckArraySort {

	public static void main(String[] args) {
		int arr1[] =  {2,5,1,3,0};
	    System.out.println("The Largest element in the array is: " + isSorted(arr1));
	   
	    int arr2[] =  {1,7,9,10,10,100};
	    System.out.println("The Largest element in the array is: " + isSorted(arr2));
	  }
	
	  static boolean isSorted(int arr[]) {
		  int leadPointer=1;
		  int trailPointer = 0;
		  while(leadPointer<arr.length) {
			  if(arr[trailPointer]>arr[leadPointer]) {
				  return false;
			  }
			  else {
				leadPointer++;
				trailPointer++;
			  }
		  }
		  
		return true;

	}

}

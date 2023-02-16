package striver.array.easy;

import java.util.Arrays;

public class RemoveDuplicate {

	public static void main(String[] args) {
		int arr1[] =  {2,5,1,3,0};
	    System.out.println("The Largest element in the array is: " + Arrays.toString(remvoeDup(arr1)));
	   
	    int arr2[] =  {5,7,9,10,11,100,11};
	    System.out.println("The Largest element in the array is: " + Arrays.toString(remvoeDup(arr2)));
	  }
	
	  static int[] remvoeDup(int arr[]) {
		  int leadPointer=1;
		  int trailPointer = 0;
		  while(trailPointer < arr.length-1 ) {
			  if(arr[trailPointer]!=arr[leadPointer]) {
				  leadPointer++;
			  }
			  if(leadPointer==arr.length) {
				  trailPointer++;
				  leadPointer = trailPointer+1;
			  }
			  if(arr[trailPointer]==arr[leadPointer]) {
				  arr[trailPointer]=0;
				  trailPointer=leadPointer;
				  leadPointer++;
			  }
		  }
		  
		return arr;

	}
}

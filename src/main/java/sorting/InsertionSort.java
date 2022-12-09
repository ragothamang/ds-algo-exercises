package sorting;

import java.util.Arrays;

public class InsertionSort {
	
	public static int[] insertionSort(int[] array) {
	    // Write your code here.
		int[] tempArray = new int[array.length];
		for(int i=1;i<array.length;i++) {
			for(int j=i;j>0;j--) {				
				if(array[j-1]>array[j]) {
					int temp = array[j-1];
					array[j-1] = array[j];
					array[j] = temp;					
				}				
			}	
			System.out.println(Arrays.toString(array));
		}
		
	    return new int[] {};
	  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] ipArray = {8, 5, 2, 9, 5, 6, 3};
		System.out.println("ip Array "+ Arrays.toString(ipArray));
		
		int[] rst = insertionSort(ipArray);
	}

}

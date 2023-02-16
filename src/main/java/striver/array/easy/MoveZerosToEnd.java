package striver.array.easy;

import java.util.Arrays;

public class MoveZerosToEnd {

	public static void main(String[] args) {
		int arr1[] =  {2,5,0,1,4,8,9,0,77,36,0,73,0};		
		System.out.println("The array is: " + Arrays.toString(arr1));
		moveToEnd(arr1);
		System.out.println("The array is: " + Arrays.toString(arr1));
	}
	
	public static void moveToEnd(int[] arr) {
		int trailPointer = 0;
		int leadPointer = 1;		
		while(leadPointer<arr.length) {						
		}	
	}
	public static void moveToEnd1(int[] arr) {
		int leftPointer = 0;
		int rightPointer = arr.length-1;		
		while(leftPointer<rightPointer) {
			if(arr[rightPointer] !=0 && arr[leftPointer]==0) {				
				arr[leftPointer] = arr[rightPointer];
				arr[rightPointer] = 0;				
			}	
			if(arr[rightPointer]==0) rightPointer--;
			if(arr[leftPointer]!=0) leftPointer++;						
		}	
	}
}

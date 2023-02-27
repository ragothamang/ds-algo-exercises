package recursionBasic;

import java.util.Arrays;

public class BubbleSortRecursion {

	public static void bubble(int [] a, int arrayLength, int index) {
		System.out.print(" arrayLength  "+ arrayLength + " index  "+ index);
		if(arrayLength==0) {
			return;
		}
		if(index < arrayLength) {
			if(a[index] > a[index+1]) {
				int temp = a[index];
				a[index] = a[index+1];
				a[index+1] = temp;
			}
			System.out.println("-->  "+ Arrays.toString(a));
			bubble(a, arrayLength, index+1);
		}else {
			bubble(a, arrayLength-1, 0);
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arr[] = {64, 34, 25, 12, 22, 11, 90};
		 System.out.println("Ip array : " + Arrays.toString(arr));
		 bubble(arr, arr.length-1,0);
         
	        System.out.println("Sorted array : ");
	        System.out.println(Arrays.toString(arr));
	}

}

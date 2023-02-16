package striver.array.easy;

import java.util.Arrays;

public class RotateElementNplace {

	public static void rotate(int [] arr, int k) {
		for(int i=1;i<=k;i++) {
			for(int j=1;j<=arr.length-1;j++) {
				int temp = arr[j-1];
				arr[j-1]=arr[j];
				arr[j]=temp;			
			}
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] =  {2,5,1,3,0};
	    System.out.println("The array is: " + Arrays.toString(arr1));
	    RotateElementNplace.rotate(arr1,3);
	    
	    System.out.println("The array is: result :   " + Arrays.toString(arr1));
	}

}

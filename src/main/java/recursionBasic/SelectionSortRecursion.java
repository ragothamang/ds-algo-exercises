package recursionBasic;

import java.util.Arrays;

public class SelectionSortRecursion {
	public static void selectSort(int [] a, int arrayLength, int index, int maxIndex) {
		System.out.print(" arrayLength  "+ arrayLength + " index  "+ index +" maxIndex "+ maxIndex);
		if(arrayLength==0) {
			return;
		}
		System.out.println("--  "+ Arrays.toString(a));
		if(index < arrayLength  ) {
			if(a[index]> a[maxIndex]) {
				selectSort(a, arrayLength, index+1,index );
			}else {
				selectSort(a, arrayLength, index+1,maxIndex );
			}
		}else {
			int temp = a[maxIndex];
			a[maxIndex] = a[arrayLength-1];
			a[arrayLength-1] = temp;
			selectSort(a, arrayLength-1, 0,0);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {64, 34, 25, 12, 22, 11, 90};
		System.out.println("Ip array : " + Arrays.toString(arr));
		selectSort(arr, arr.length,0,0);

		System.out.println("Sorted array : ");
		System.out.println(Arrays.toString(arr));
	}

}

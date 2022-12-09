package sorting;

import java.util.Arrays;

public class SelectionSort {
	public static int[] selectionSort(int[] array) {
	    // Write your code here.
		for(int i=0;i<array.length;i++) {
			int minIndex = i;
			for(int j=i+1;j<array.length;j++) {
				if(array[j]<array[minIndex]) {
					minIndex = j;
				}
			}
			int temp = array[i];
			array[i]=array[minIndex];
			array[minIndex] = temp;		
			System.out.println(Arrays.toString(array));
		}
		
	    return array;
	  }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ipArray = {8, 5, 2, 9, 5, 6, 3};
		int[] rst = selectionSort(ipArray);
		System.out.println(Arrays.toString(rst));

	}

}

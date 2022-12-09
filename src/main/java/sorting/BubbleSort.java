package sorting;

import java.util.Arrays;

public class BubbleSort {
	public static int[] bubbleSort(int[] array) {
		// Write your code here.
		for(int i=0; i< array.length; i++) {
			for(int j=0; j< array.length-1-i; j++) {
				if(array[j]>array[j+1]){
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
		return array;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {8, 5, 2, 9, 5, 6, 3};
		int temp[] = bubbleSort(a);
	}

}

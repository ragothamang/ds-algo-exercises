package array;

import java.util.Arrays;

public class SortedSquaredArray {
	public static int[] sortedSquaredArray(int[] array) {
	    // Write your code here.
		int leftIndex =0;
		int rightIndex = array.length-1;
		int counter = array.length-1;
		int [] newarray = new int[array.length];
		while(leftIndex <= rightIndex) {
			if(Math.abs(array[leftIndex])>Math.abs(array[rightIndex])) {
				newarray[counter] = array[leftIndex]*array[leftIndex];
				leftIndex++;
			}
			else {
				newarray[counter] = array[rightIndex]*array[rightIndex];
				rightIndex--;
			}
			counter--;
			System.out.println("L->  "+leftIndex);
			System.out.println("R->  "+rightIndex);
		}
		System.out.println(Arrays.toString(newarray));
	    return newarray;
	  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] ar = {-7, -3, 1, 9, 22, 30};
		int[] ar = {-5, -4, -3, -2, -1};
//		int[] ar = {-10, -5, 0, 5, 10};
		System.out.println(Arrays.toString(ar));
		
			int[] nar = sortedSquaredArray(ar);
		
//		System.out.println(nar);
		
	}

}

package array;

import java.util.Arrays;

public class LongestPeak {
	 public static int longestPeak(int[] array) {
		    // Write your code here.
		     int peakLength = 0, i = 1;
		    boolean isPeak = false;

		    while (i < array.length - 1) {
		      isPeak = array[i - 1] < array[i] && array[i] > array[i + 1];
		      
		      System.out.println("isPeak  >  " + isPeak);
		      
		      if (!isPeak) {
		        ++i;
		        continue;
		      }

		      System.out.println("i >>  " + i);
		      
		      int leftIdx = i - 2;
		      while (leftIdx >= 0 && array[leftIdx] < array[leftIdx + 1]) --leftIdx;

		      int rightIdx = i + 2;
		      while (rightIdx < array.length && array[rightIdx - 1] > array[rightIdx]) ++rightIdx;

		      peakLength = Math.max(peakLength, rightIdx - leftIdx - 1);

		      i = rightIdx;
		    }

		    return peakLength;
		  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] ip = {1, 2, 3, 3, 4, 0, 10, 6, 5, -1, -3, 2, 3};
		
		System.out.println(Arrays.toString(ip));
		
		int op = longestPeak(ip);
		System.out.println(op);
	}

}

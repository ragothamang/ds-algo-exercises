package leetCodeQuestions;

import java.util.Arrays;

public class MaximumSumCircularSubarray {

	 public int maxSubarraySumCircular(int[] array) {
	        // variable to keep track of the total sum of the array
	        int acc = 0;
	        // variable to keep track of the maximum sum subarray using kadane's algorithm
	        int max1 = kadane(array);
	        // iterate through the array and negate each element
	        for(int i = 0; i < array.length; i++) {
	            acc += array[i];
	            array[i] = -array[i];
	        }
	        // variable to keep track of the minimum sum subarray using kadane's algorithm on the negated array
	        int min = kadane(array);
	        // variable to keep track of the maximum sum subarray that can be formed by wrapping around the array
	        int max2 = acc + min;
	        // if the maximum sum subarray that can be formed by wrapping around the array is zero, return the maximum sum subarray using kadane's algorithm
	        if(max2 == 0)  return max1;													
	        // return the maximum of the two maximum sum subarrays
	        return Math.max(max1, max2);
	    }
	    // function to calculate the maximum sum subarray using kadane's algorithm
	      public int kadane(int[] array) {
	        // variable to keep track of the maximum sum subarray ending at current index
	        int maxSum = array[0];
	        // variable to keep track of the overall maximum sum subarray
	        int max = array[0];
	        // iterate through the array starting from the second element
	        for(int i = 1; i < array.length; i++) {
	            // update the maximum sum subarray ending at current index 
	            // by taking the maximum between the current element and the sum of the current element and the maximum sum subarray ending at the previous index
	            maxSum = Math.max(maxSum+array[i], array[i]);
	            // update the overall maximum sum subarray by taking the maximum between the current maximum sum subarray ending at current index and the overall maximum sum subarray
	            max = Math.max(max, maxSum);
	        }
	        return max;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaximumSumCircularSubarray obj = new MaximumSumCircularSubarray();
		int[] ip = {1,-2,3,-2};
		System.out.println(Arrays.toString(ip));
		
		int result = obj.maxSubarraySumCircular(ip);
		System.out.println("Max sum of subarray   " + result);
	}

}

/*
 
 1. This is a Java implementation of a solution to the problem of finding the maximum subarray sum in a circular array. The solution uses two different algorithms to solve the problem: the Kadane's algorithm and a modified version of it.

2. The first algorithm used is the Kadane's algorithm, which is a well-known algorithm for finding the maximum subarray sum in a non-circular array. The basic idea of the algorithm is to keep track of the maximum sum ending at each position in the array, and update the maximum sum as we iterate through the array. The maximum sum is initially set to the first element of the array, and then for each subsequent element, it is updated to be the maximum of the current element and the sum of the current element and the maximum sum ending at the previous position. This algorithm is implemented in the "kadane()" method, which takes an array as its input and returns the maximum subarray sum.

3. The second algorithm used is a modified version of the Kadane's algorithm, which is used to find the maximum subarray sum in a circular array. The basic idea of this algorithm is to find the minimum subarray sum of the inverted array (i.e. with all elements negated) and add it to the sum of all elements in the original array. This gives the maximum subarray sum of the circular array, since the minimum subarray sum of the inverted array corresponds to the maximum subarray sum of the original array that "wraps around" the end of the array. This algorithm is implemented in the "maxSubarraySumCircular()" method, which takes an array as its input and returns the maximum subarray sum of the circular array.

4. The "maxSubarraySumCircular()" method first calculates the maximum subarray sum of the original array using the "kadane()" method, and stores it in the variable "max1". Then it negates all elements of the array, and calculates the maximum subarray sum of the inverted array using the "kadane()" method. It then adds the sum of all elements of the original array to this maximum sum, and stores it in the variable "max2". Finally, it returns the maximum of "max1" and "max2", which is the maximum subarray sum of the circular array.

5. If the max2 is 0, it means all elements are negative and maximum sum is at the start of the array itself. In that case it returns max1

 
  
 */

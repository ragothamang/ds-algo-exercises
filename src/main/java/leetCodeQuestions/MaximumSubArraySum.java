package leetCodeQuestions;

public class MaximumSubArraySum {

	 public static  int maxSubArray(int[] nums) {
	        // The array is negative so we are using different approach

	        //let th first element be the maximum sub array

	        int currSum = nums[0];
	        int maxSum = nums[0];

	        //As We have taken the first element 
	        //We will start the loop from 1st index

	        for(int i = 1; i < nums.length;i++){
	            
	            //For currSum we will chek if the 
	            //elment at that index is greater or element at that index + currSum is greater

	            currSum = Math.max(nums[i], nums[i] + currSum);

	            //For maxSum we will check
	            //currSum is greate or maxSum is greater

	            maxSum = Math.max(currSum,maxSum); 
	        }
	        return maxSum;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

/*

Approach
1: First make currSum and MaxSum as first elment of the array
2: now run the loop from 1st index
3: take the maximum of nums[i] and currsum + nums[i] and store in the currsum
4: take the maximum of the currsum and maxsum and store in hthe maximumsum
5: return the maximum sum of the array

Complexity
Time complexity:
O(N)
Space complexity:
O(1)

*/
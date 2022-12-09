package leetCodeQuestions;

import java.util.HashSet;

public class ContainsDuplicateII {
	public static boolean containsNearbyDuplicate(int[] nums, int k) {

		/**
		 * Using HashSet to maintain the sliding window.
		 *
		 * Time Complexity: O(N)
		 *
		 * Space Complexity: O(min(N, K+1))
		 *
		 * N = Length of input array. K = Input window size.
		 */
/*
		class Solution1 {
			public boolean containsNearbyDuplicate(int[] nums, int k) {
				if (nums == null || k < 0) {
					throw new IllegalArgumentException("Input array is null");
				}
				if (nums.length <= 1 || k == 0) {
					return false;
				}

				HashSet<Integer> window = new HashSet<>();
				for (int i = 0; i < nums.length; i++) {
					if (i > k) {
						window.remove(nums[i - k - 1]);
					}
					if (!window.add(nums[i])) {
						return true;
					}
				}

				return false;
			}
		}
*/

		/**
		 * Using HashMap to store the number and its index.
		 *
		 * Time Complexity: O(N)
		 *
		 * Space Complexity: O(N)
		 */
		if (nums == null || k < 0) {
			throw new IllegalArgumentException("Input array is null");
		}
		if (nums.length <= 1 || k == 0) {
			return false;
		}

		HashSet<Integer> window = new HashSet<>();
		for (int i = 0; i < nums.length; i++) {
			System.out.println("i-->   "+i);
			System.out.println(window);
			if (i > k) {
				System.out.println(" before remove >  "+window);
				window.remove(nums[i - k - 1]);
				System.out.println(" after remove >  "+window);
			}
			if (!window.add(nums[i])) {

				return true;
			}
		}

		return false;

		/*
		int left = 0;
		int right = 1;
		int indexDiff = 0;
		while(right< nums.length) {
			if(nums[left]!=nums[right]) {
				right++;
			}else {
				  if((right - left)<=k) {
					  return true;
				  }else {
					  left++;
					  right = left+1;
				  }
			}
		}
		System.out.println("left ->  "+left);
		System.out.println("right ->  "+right);
        return false;
		 */
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar = {1,2,3,0,2,3};
		//		int[] ar = {1,0,1,1 };
		boolean temp = containsNearbyDuplicate(ar, 3);
		System.out.println(temp);
	}

}

package leetCodeQuestions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SubarraySumsDivisibleByK {
	public  int subarraysDivByK(int[] nums, int k) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0, remainder; i < nums.length; i++) {
			if (i > 0) nums[i] += nums[i - 1];
			remainder = (nums[i] % k + k) % k;

			System.out.println("  reminder  " + remainder);
			map.put(remainder, map.getOrDefault(remainder, 0) + 1);
		}
		int result = map.getOrDefault(0, 0);
		System.out.println("Result  "+ result );
		System.out.println("map   "+ map);
		for (int frequency : map.values()) {
			result += frequency * (frequency - 1) / 2;
			System.out.println("Result  -->  "+ result );
		}
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//		int[] ip = {1,-2,3,-2};

		int[] ip = {4,5,0,-2,-3,1};

		System.out.println(Arrays.toString(ip));
		SubarraySumsDivisibleByK obj = new SubarraySumsDivisibleByK();
		int result = obj.subarraysDivByK(ip, 5);

		System.out.println(result);
	}

}
/*

Approach
When it comes to Sum of Subarray, the use of Prefix Sum is especially important.

Prefix Sum is the sum of the current integer with the previous integer in the array (Prefix).

Example: nums = [1,2,3,4,5] has the prefix sum array of prefixSum = [1,3,6,10,15], where the nums[0] + 1 = 1, nums[1] + nums[0] = 2 + 1 = 3, nums[2] + nums[1] = 3 + 3 = 6, and so on.

Using the example above, we can determine the subarray sum of any subarray using prefix sum.

To get the subarray sum of nums[2] to nums[4] == 3 + 4 + 5 == 12, we can get from prefixSum[5] - prefixSum[1] == 15 - 3 == 12.

With Prefix Sum, we can evaluate if any subarray sum is divisible by 'k', if two prefix sums have the same remainder of 'k'.

For Example, nums = [4,2,3], k = 5, with two prefix sum, 4 [4] and 9 [4,2,3].

Both remainders are 4, with the subarray between the prefix sum 9 [4,2,3] - 4 [4] == 5 [2,3], which is divisible by 5.

Prefix Sum & Hash Table
Complexity
Time Complexity: O(n),
where 'n' is the length of 'nums'.
In fact, in actual is '2n' as we traverse 'nums' once and the HashMap once, with the worst time complexity of the HashMap being 'n'.

Space Complexity: O(n),
where 'n' is the length of 'nums'.
The worst case is when all the prefix sums in 'nums' have different remainders with 'k', resulting in the maximum size of the HashMap to be 'n'.

 */
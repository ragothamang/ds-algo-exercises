package striver.array.easy;

import java.util.HashMap;


public class SubarraySumEqualsK {

	public static int isSubarraySum(int[] nums, int k) {
		int count = 0, sum = 0;
		HashMap < Integer, Integer > map = new HashMap < > ();
		map.put(0, 1);

		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
			if (map.containsKey(sum - k))
				count += map.get(sum - k);
			map.put(sum, map.getOrDefault(sum, 0) + 1);
		}
		return count;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//		int[] ip = {1,2,3}; 
		int[] ip = {1,1,1};
		System.out.println(SubarraySumEqualsK.isSubarraySum(ip,2));
		}
}

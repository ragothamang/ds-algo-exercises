package leetCodeQuestions;

import java.util.Arrays;

public class HouseRobber {
	public static int rob(int[] nums) {
        if(nums.length==0) {
            return 0;
        }
        int[] dp = new int[nums.length+1];
        dp[1]=nums[0];
        for(int i=1;i<nums.length;i++) {
            dp[i+1]=Math.max(dp[i],dp[i-1]+nums[i]);
        }
        return dp[nums.length];
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] ip = {3,2,2,3};
		System.out.println(Arrays.toString(ip));
		int result = rob(ip);
		System.out.println("Result :   "+ result);
	}

}

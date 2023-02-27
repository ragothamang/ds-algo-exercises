package striver.recursion.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSumII {

	public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        System.out.println(Arrays.toString(candidates));
        combine(candidates, 0, target, res, new ArrayList<Integer>());
        return res;
    }
    private static void combine(int[] nums, int start, int target, List<List<Integer>> res, List<Integer> path){
        if (target < 0) return;
        if (target == 0){
            res.add(path);
            return;
        }
        for (int i = start; i < nums.length; i++){
        	System.out.println("  i "+ i +" nums[i] "+ nums[i]+ "  start  "+ start +" target " + target);
            if (i > start && nums[i] == nums[i - 1]) continue;
//            System.out.print("  i "+ i +" nums[i] "+ nums[i]+"  nums[i-1] "+ nums[i-1]);
            List<Integer> currentPath = new ArrayList<Integer>(path);
            currentPath.add(nums[i]);
            combine(nums, i + 1, target - nums[i], res, currentPath);
        }
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 5, 5,4 ,6,7,11};
		System.out.println(combinationSum2(arr, 11));
	}

}

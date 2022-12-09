package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeNumberSum {
	 public static List<Integer[]> threeNumberSum(int[] array, int targetSum) {
		    // Write your code here.
		    if (array.length < 3) return new ArrayList<Integer[]>();

		    Arrays.sort(array);
		    List<Integer[]> res = new ArrayList<>();

		    for (int i = 0; i < array.length - 1; i++) {
		      int j = i + 1, k = array.length - 1;

		      while (j < k) {
		        int sum = array[i] + array[j] + array[k];

		        if (sum > targetSum) --k;
		        else if (sum < targetSum) ++j;
		        else {
		          res.add(new Integer[] {array[i], array[j++], array[k--]});

		          while (j < k && array[j] == array[j + 1]) ++j;

		          while (j < k && array[k] == array[k - 1]) --k;
		        }
		      }
		    }

		    return res;
		  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = {12, 3, 1, 2, -6, 5, -8, 6};
		int targetSum =  0;
		
		List<Integer[]> op = new ArrayList<>();
		op = threeNumberSum(array, targetSum);
		
		for(Integer[] a : op) {
			System.out.println(Arrays.toString(a));	
		}
		
	}

}

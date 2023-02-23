package dynamicProgramming;

import java.util.Arrays;

public class NumberOfWaysToMakeChange {

	public static int numberOfWaysToMakeChange(int n, int[] denoms) {
	    // Write your code here.
	    int[] numberOfWays = new int[n + 1];
	    Arrays.fill(numberOfWays, 0);
	    numberOfWays[0] = 1;

	    for (int denom : denoms) {
	      for (int target = 1; target <= n; target++) {
	        if (target >= denom) numberOfWays[target] += numberOfWays[target - denom];
	      }
	    }
	    return numberOfWays[n];
	}

	    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 3, 1, 2 };
		System.out.println(numberOfWaysToMakeChange(7, arr));

	}

}

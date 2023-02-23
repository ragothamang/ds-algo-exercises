package dynamicProgramming;

import java.util.Arrays;

public class MinNumberOfCoinsForChange {
	public static int minNumberOfCoinsForChange(int n, int[] denoms) {
		// Write your code here.
		int[] minCoinsRequired = new int[n + 1];
		Arrays.fill(minCoinsRequired, Integer.MAX_VALUE);

		minCoinsRequired[0] = 0;
		int minCoins = 0;

		for (int denom : denoms) {
			for (int target = 0; target <= n; target++) {
				if (target < denom) continue;

				minCoins =
						minCoinsRequired[target - denom] == Integer.MAX_VALUE
						? Integer.MAX_VALUE
								: 1 + minCoinsRequired[target - denom];

				minCoinsRequired[target] = Math.min(minCoinsRequired[target], minCoins);
			}
		}

		return minCoinsRequired[n] != Integer.MAX_VALUE ? minCoinsRequired[n] : -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ip = {1,5,10};
		System.out.println(minNumberOfCoinsForChange(7, ip));

	}

}

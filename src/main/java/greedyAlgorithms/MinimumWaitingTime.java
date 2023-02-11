package greedyAlgorithms;

import java.util.Arrays;

public class MinimumWaitingTime {
	public static int minimumWaitingTime(int[] queries) {
	    // Write your code here.
		
		Arrays.sort(queries);
	    int minWaitTime = 0, len = queries.length;

	    for (int idx = 0; idx < len; idx++) minWaitTime += queries[idx] * (len - 1 - idx);

	    return minWaitTime;
	  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ip = {3,2,1,2,6}; 
		int result = minimumWaitingTime(ip);
		
		System.out.println("Result   "+ result);

	}

}

package recursion;

public class StairCaseTraversal {
	/**
	   * ? Recursive Approach
	   * * TC: O(k^n), SC: O(k^n)
	   */
	  // public int staircaseTraversal(int height, int maxSteps) {
	  //   if (height <= 1) return 1;

	  //   int numberOfWays = 0;

	  //   for (int step = 1; step <= Math.min(height, maxSteps); step++)
	  //     numberOfWays += staircaseTraversal(height - step, maxSteps);

	  //   return numberOfWays;
	  // }

	  /**
	   * ? Dynamic Programming Approach
	   * * TC: O(k*n), SC: O(n)
	   */
	  // public int staircaseTraversal(int height, int maxSteps) {
	  //   int[] dp = new int[height + 1];
	  // 	dp[0] = 1;
	  // 	dp[1] = 1;

	  // 	for (int currHeight = 2; currHeight <= height; currHeight++) {
	  // 		int step = 1;

	  // 		while (step <= maxSteps && step <= currHeight) {
	  // 			dp[currHeight] += dp[currHeight - step];
	  // 			++step;
	  // 		}
	  // 	}

	  // 	return dp[height];
	  // }

	  /**
	   * ? Sliding Window Approach
	   * * TC: O(n), SC: O(n)
	   */
	  public static int staircaseTraversal(int height, int maxSteps) {
	    // Write your code here.
	    int[] numberOfWays = new int[height + 1];
	    numberOfWays[0] = 1;

	    int currentWays = 0, start = 0, end = 0;

	    for (int currHeight = 1; currHeight <= height; currHeight++) {
	      start = currHeight - maxSteps - 1;
	      end = currHeight - 1;

	      if (start >= 0) currentWays -= numberOfWays[start];

	      currentWays += numberOfWays[end];
	      numberOfWays[currHeight] = currentWays;
	    }

	    return numberOfWays[height];
	  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int height =  5; // 4;
		int maxStep = 3; //3; 
		
		int op = staircaseTraversal(height, maxStep);
		System.out.println("op>>  "+ op);
	}

}

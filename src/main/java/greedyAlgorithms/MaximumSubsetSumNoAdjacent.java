package greedyAlgorithms;

public class MaximumSubsetSumNoAdjacent {
	public static int maxSubsetSumNoAdjacent(int[] array) {
	    // Write your code here.
	    if (array.length <= 1) return array.length == 0 ? 0 : array[0];

	    int first = array[0], second = Math.max(array[0], array[1]);

	    for (int i = 2; i < array.length; i++) {
	      int currentMax = Math.max(second, first + array[i]);
	      first = second;
	      second = currentMax;
	    }

	    return second;
	  }
	
	public static void main(String[] args) {		
		
		int[] ip = {3,2,1,2,6}; 
		int result = maxSubsetSumNoAdjacent(ip);
		
		System.out.println(result);
	}

}

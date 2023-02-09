package algorithm;

import java.util.Arrays;

public class KadanesAlgorithm {

	public static int kadanesAlgo(int[] array) {
		// Write your code here.
		int currentSum = array[0], maximumSum = array[0];

		for (int idx = 1; idx < array.length; idx++) {
			currentSum = Math.max(array[idx], currentSum + array[idx]);
			maximumSum = Math.max(currentSum, maximumSum);
		}

		return maximumSum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] ip = {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(Arrays.toString(ip));


		KadanesAlgorithm kadanesAlgorithm = new KadanesAlgorithm();
		int result = kadanesAlgorithm.kadanesAlgo(ip);
		System.out.println("result "+ result);

	}

}

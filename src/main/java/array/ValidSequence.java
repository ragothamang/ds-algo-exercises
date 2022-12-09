package array;

import java.util.ArrayList;
import java.util.List;

public class ValidSequence {

	public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
		// Write your code here.
		int innerIndex = 0, outerIndex=0;
		boolean result = false;
		if (sequence.size()> array.size()) {
			return false;
		}
		while(outerIndex< array.size()) {
			System.out.println(array.get(outerIndex));

			if(innerIndex < sequence.size() && array.get(outerIndex)==sequence.get(innerIndex)) {
				System.out.println("sub >>  "+ sequence.get(innerIndex));
				outerIndex++;
				innerIndex++;
				result = true;
			}else {

				outerIndex++;
			}
			if(innerIndex < sequence.size()&& outerIndex == array.size()){
				result = false;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> arr = new ArrayList<Integer>();
		List<Integer> seq = new ArrayList<Integer>();
		arr.add(5);
		arr.add(1);
		arr.add(22);
		arr.add(25);
		arr.add(6);
		arr.add(-1);
		arr.add(8);
		arr.add(10);

		seq.add(1);
		seq.add(6);
		seq.add(-1);
		seq.add(10);
		boolean result = isValidSubsequence(arr, seq);

		System.out.println("finla >> "+ result);

	}

}

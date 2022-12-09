package stack;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement {
	
	 public int[] nextGreaterElement(int[] array) {
		    // Write your code here.
		    int len = array.length;
		    Stack<Integer> stack = new Stack<>();
		    int[] res = new int[len];
		    Arrays.fill(res, -1);

		    for (int i = 0; i < 2 * len; i++) {
		      int idx = i % len;

		      while (!stack.isEmpty() && array[idx] > array[stack.peek()]) res[stack.pop()] = array[idx];

		      stack.push(idx);
		      ++idx;
		    }

		    return res;
		  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

package stack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class SunsetViews {

	public ArrayList<Integer> sunsetViews(int[] buildings, String direction) {
	    // Write your code here.
	    Stack<Integer> stack = new Stack<>();
	    ArrayList<Integer> views = new ArrayList<>();

	    int idx = direction.toLowerCase().equals("east") ? buildings.length - 1 : 0;
	    int step = direction.toLowerCase().equals("east") ? -1 : 1;

	    while (idx >= 0 && idx < buildings.length) {
	      if (stack.isEmpty() || buildings[idx] > buildings[stack.peek()]) stack.push(idx);

	      idx += step;
	    }

	    views.addAll(stack);

	    if (step == -1) Collections.reverse(views); 

	    return views;
	  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

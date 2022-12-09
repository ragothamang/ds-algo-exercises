package stack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortStack {

	
	public static ArrayList<Integer> sortStack(ArrayList<Integer> stack) {
	    // Write your code here.
	    if (stack.isEmpty()) return stack;    
	    
	    
	    sort(stack);
	    return stack;
	  }

	  private static void sort(ArrayList<Integer> stack) {
	    if (stack.size() == 1) return;

	    int poppedValue = stack.remove(stack.size() - 1);

	    System.out.println("recursive");
	    
	    sort(stack);

	    insert(stack, poppedValue);
	  }

	  private static void insert(ArrayList<Integer> stack, int value) {
	    if (stack.isEmpty() || stack.get(stack.size() - 1) <= value) {
	      stack.add(value);
	      return;
	    }

	    int poppedValue = stack.remove(stack.size() - 1);

	    insert(stack, value);

	    stack.add(poppedValue);
	  }
	  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		  "stack": [-5, 2, -2, 4, 3, 1]
		
//		List<Integer> ip = new ArrayList<Integer>()
				
//		ArrayList<String> gfg = new ArrayList<String>(Arrays.asList("Geeks", "for","Geeks"));
				
//		List<Integer> ip = new ArrayList<Integer>(List.of(-5,2,-2,4,3,1));
		
		List<Integer> arr = new ArrayList<>();

		arr.add(-5);
		arr.add(2);
		arr.add(-2);
		arr.add(4);
		arr.add(3);
		arr.add(1);
		
		List<Integer> ip = new ArrayList<Integer>(arr);
		System.out.println(ip);
		
		List<Integer> result = sortStack((ArrayList<Integer>) ip); 
		
		
		
		System.out.println(result);
		
		
			  

	}

}

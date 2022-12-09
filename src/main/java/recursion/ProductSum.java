package recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProductSum {
	public static int productSum(List<Object> array) {
	    // Write your code here.
		return calculateInner(array, 1);
	  }
	public static int calculateInner(List<Object> array, int depth) {
		int sum = 0;
		for(Object element : array) {
			sum += element instanceof ArrayList ? calculateInner((ArrayList<Object>)element, depth+1) : (int) element;
		}
		return sum* depth;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Object> ar = new ArrayList<Object>(Arrays.asList(1,4));
		List<Object> ar2 = new ArrayList<Object>(Arrays.asList(6,7));
		ar.add(ar2);
		System.out.println(ar);
		int temp = productSum(ar);
		
		System.out.println(temp);

	}

}

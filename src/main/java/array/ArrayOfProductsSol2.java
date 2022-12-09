package array;

import java.util.Arrays;

public class ArrayOfProductsSol2 {

	public static int[] arrayOfProducts(int[] array) {
	    // Write your code here.
	    if (array == null) return new int[] {};

	    int currentProduct = 1, len = array.length;
	    int[] res = new int[len];

	    for (int i = 0; i < len; i++) {
	      res[i] = currentProduct;
	      currentProduct *= array[i];
	    }
	    
	    System.out.println(Arrays.toString(res));

	    currentProduct = 1;

	    for (int i = len - 1; i >= 0; i--) {
	      res[i] *= currentProduct;
	      currentProduct *= array[i];
	    }

	    return res;
	  }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

          		int [] ip = {5, 1, 4, 2};
//		int [] ip = {2,2,3,4};
		
		int[] op = arrayOfProducts(ip);
		
		System.out.println(Arrays.toString(ip));
		System.out.println(Arrays.toString(op));
	}

}

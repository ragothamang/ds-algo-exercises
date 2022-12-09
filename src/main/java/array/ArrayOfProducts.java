package array;

import java.util.Arrays;

public class ArrayOfProducts {

	public static int[] arrayOfProducts(int[] array) {
	    // Write your code here.
	    int[] products = new int[array.length];
	    for(int i=0;i<array.length;i++) {
	    	int runningProduct = 1;
	    	for(int j=0;j<array.length;j++) {
	    		if(i!=j) {
	    			runningProduct *= array[j];
	    		}
	    	}
	    	products[i] = runningProduct;
	    }

	    return products;
	  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] ip = {5, 1, 4, 2};
//		int [] ip = {1,2,3,4};
		
		int[] op = arrayOfProducts(ip);
		
		System.out.println(Arrays.toString(ip));
		System.out.println(Arrays.toString(op));
	}

}

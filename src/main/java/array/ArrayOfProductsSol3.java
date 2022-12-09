package array;

import java.util.Arrays;

public class ArrayOfProductsSol3 {

	public static int[] arrayOfProducts(int[] array) {
		// Write your code here.
		int[] products = new int[array.length];
		int[] leftProducts = new int[array.length];
		int[] rightProducts = new int[array.length];
		
		int leftProduct =1;
		for(int i=0;i<array.length; i++) {
			leftProducts[i] = leftProduct;
			leftProduct*=array[i];
		}
		System.out.println("leftProduct   >"+ leftProduct);
		System.out.println("left products   "+ Arrays.toString(leftProducts));

		int rightProduct = 1;
		for(int i=array.length-1;i>=0; i--) {
			rightProducts[i] = rightProduct;
			rightProduct*=array[i];
		}
		System.out.println("right products   "+ Arrays.toString(rightProducts));
		
		

		for(int i=0;i<array.length; i++) {
			products[i]=leftProducts[i]*rightProducts[i];
		}


		return products;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] ip = {5, 6};
//				int [] ip = {5, 6, 4, 2};
//		int [] ip = {2,2,3,4};
				System.out.println(Arrays.toString(ip));
		int[] op = arrayOfProducts(ip);

		
		System.out.println(Arrays.toString(op));
	}

}

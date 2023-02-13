package recursion;

import java.util.Arrays;

public class ReverseArray {
	
	public static int[] reverseAr(int l, int r, int[] array) {
		System.out.println(l+"   "+ r);
		if(l>=r) {
			return array;			
		}
		
		swap(l, r, array);
		reverseAr(l+1,r-1,array);
		return array;
	}

	private static void swap(int i, int j, int[] ar) {
		// TODO Auto-generated method stub
		System.out.println(i+"   "+ j);
		System.out.println("swap ");
		int c = ar[i];
		ar[i] = ar[j];
		ar[j] = c;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] ip = {9,5,2,7,6,4};
		System.out.println(ip.length);
		int[] op = ReverseArray.reverseAr(0, ip.length-1, ip);
		
		System.out.println(Arrays.toString(op));
		
	}

}

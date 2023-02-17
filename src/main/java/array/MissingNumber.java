package array;

import java.util.Arrays;

public class MissingNumber {

	public static int missingNum(int[] array) {
		Arrays.sort(array);
		int j=0;
		int i=0;
		while(i<=array.length-1) {
			if((array[i]) != j) {				
				return i;
			}
			i++;
			j++;
		}
		if(i==array.length) return array.length;
		System.out.println(i);
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ip = {0,1};
//		int[] ip = {9,6,4,2,3,5,7,0,1};
		
		System.out.println(MissingNumber.missingNum(ip));
	}

}

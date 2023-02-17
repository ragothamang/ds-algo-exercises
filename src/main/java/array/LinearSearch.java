package array;

public class LinearSearch {

	public static int isLinearSearch(int[] array, int num) {
		int j=array.length-1;
		int i=0;
		while(i<=j) {
			if(array[i]==num || array[j]==num) {
				int temp = (array[i]==num)?  i :  j;
				return temp;
			}
			i++;j--;
		}
		return -1;
	}
	
	public static void main(String[] args) {		
		
		int[] ip = {3,2,1,2,6}; 
		System.out.println(LinearSearch.isLinearSearch(ip,1));
	}

	private static char[] isLinerSearch(int[] ip) {
		// TODO Auto-generated method stub
		return null;
	}

}

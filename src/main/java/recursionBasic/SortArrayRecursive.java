package recursionBasic;

public class SortArrayRecursive {
	
	public static boolean sortArray(int[] ar, int index) {
		if(index == ar.length-1) {
			return true;
		}
		return ar[index] < ar[index+1] && sortArray(ar, index+1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 5, 6,7,11};
		System.out.println(sortArray(arr, 0));

	}

}

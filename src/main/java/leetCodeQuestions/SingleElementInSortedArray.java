package leetCodeQuestions;

public class SingleElementInSortedArray {
	
	public static int singleNonDuplicate(int[] nums) {
		int left = 0, right = nums.length-1;
        while(left < right){
            int mid = (left + right)/2;
            if( (mid % 2 == 0 && nums[mid] == nums[mid +1]) || (mid %2 == 1 && nums[mid] == nums[mid - 1]) )
                left = mid + 1;
            else
                right = mid;
        }
        return nums[left];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ip = {1,1,2,2,3};
		System.out.println(singleNonDuplicate(ip));
	}

}

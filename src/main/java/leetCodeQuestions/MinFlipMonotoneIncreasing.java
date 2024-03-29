package leetCodeQuestions;

public class MinFlipMonotoneIncreasing {
	public static int minFlipsMonoIncr(String s) {
		// Initialize variables to store the minimum number of flips and the number of flips currently needed
		int ans = 0, noOfFlip = 0;

		// Iterate through each character in the input string
		for(int i =0; i < s.length(); i++){
			// If the current character is a '0', update the minimum number of flips and add 1 to the current number of flips
			if(s.charAt(i) == '0') ans = Math.min(noOfFlip,ans+1);
			// If the current character is a '1', increment the number of flips
			else noOfFlip++;
		}
		// Return the minimum number of flips
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "00011000";
		int result = minFlipsMonoIncr(str);
		System.out.println("#flip  "+ result);
	}

}

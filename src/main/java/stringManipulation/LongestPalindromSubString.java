package stringManipulation;

public class LongestPalindromSubString {
	
	private static int expand(String str, int left, int right) {
	    while (left >= 0 && right < str.length() && str.charAt(left) == str.charAt(right)) {
	      --left;
	      ++right;
	    }
	    System.out.println(" exp   "+ (right - left - 1));
	    return right - left - 1;
	  }

	  public static String longestPalindromicSubstring(String str) {
	    // Write your code here.
	    if (str.length() <= 1) return str;

	    int start = 0, maxLength = 1, length = 1;

	    for (int i = 1; i < str.length(); i++) {
	      length = Math.max(expand(str, i, i), expand(str, i, i + 1));

	      if (length > maxLength) {
	        maxLength = length;
	        start = i - (maxLength - 1) / 2;
	      }
	    }

	    return str.substring(start, start + maxLength);
	  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String ip = "abaxyzzyxf";
		
		String op = longestPalindromicSubstring(ip);
		
		System.out.println(ip);
		System.out.println(op);
	}

}

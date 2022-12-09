package stringManipulation;

public class PalindromeCheck {

	public static boolean isPalindrome(String str) {
		// Write your code here.
		int leftIndex=0;
		int rightIndex=(str.length()>1)?str.length()-1:0;
		while(leftIndex<rightIndex) {
			if(str.charAt(rightIndex)==str.charAt(leftIndex)) {
				System.out.println(str.charAt(leftIndex)+"  "+ str.charAt(rightIndex));
				leftIndex++;
				rightIndex--;

			}else {
				break;
			}
		}
		System.out.println((leftIndex)+"  "+ (rightIndex));
		if(str.charAt(rightIndex)==str.charAt(leftIndex)) {
			return true;
		}
		
		return false;  
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPalindrome("abce1cba"));
	}

}

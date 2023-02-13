package recursion;

public class PalindromRecursion {
	
	public static boolean checkPalindrom(String str, int i) {
		if(i>=(str.length()/2)) return true;
		if(str.charAt(i)!= str.charAt(str.length()-i-1)) return false;
		if(i<(str.length()-i-1)) {
			System.out.println("L  "+ i);
			System.out.println("r  "+ (str.length()-i-1));
			return checkPalindrom(str, i+1);	
		}
		
		return true;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String ip = "madam";
		boolean result = PalindromRecursion.checkPalindrom(ip,0);
		
		System.out.println(result);
	}

}

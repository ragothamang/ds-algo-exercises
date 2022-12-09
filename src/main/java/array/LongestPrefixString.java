package array;

public class LongestPrefixString {
	public static String longestCommonPrefix(String[] strs) {
		
		StringBuffer sb = new StringBuffer();
		String firstStr = strs[0];
		int charIndex = 0;
		int strIndex =1;		
//		boolean isMoveToNextChar = false;
		boolean isMoveToNextString = false;
		do {
			if(firstStr.length()==0 || strs.length<2) {
				System.out.println("firstStr len " + firstStr.length());
				System.out.println("strs len " + strs.length);
				break;
			}
			
			if(charIndex>strs[strIndex].length()-1) {
				break;
			}
			if(charIndex<firstStr.length()) {
				if(firstStr.charAt(charIndex)==strs[strIndex].charAt(charIndex)) {
					System.out.println("charIndex-->  "+ charIndex);
					System.out.println("strIndex-->  "+ strIndex);
					strIndex++;
					isMoveToNextString=true;
				}else {
					break;
				}
			}else {
				break;
			}
			
			if(strIndex==strs.length) {
				sb.append(firstStr.charAt(charIndex));
				strIndex = 1;
				charIndex++;
				isMoveToNextString = true;
			}
		}while(isMoveToNextString == true);
		
		System.out.println("sb-->  "+ sb.toString());
		if(sb.length()>0) {
			return sb.toString();
		}else {
			return "";
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String[] strArray = {"dog","racecar","car"};
//		String[] strArray = {""};
//		String[] strArray = {"a"};
		String[] strArray = {"a","ac"};
		System.out.println(strArray.length);
		String temp = longestCommonPrefix(strArray);
	}



}

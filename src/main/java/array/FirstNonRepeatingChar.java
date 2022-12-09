package array;

import jdk.jfr.Frequency;

public class FirstNonRepeatingChar {
	public static int firstNonRepeatingCharacter(String string) {
	    // Write your code here.

		/* start of my solution
		int leftPointer = 0;
		int rightPointer = string.length()-1;
//		int rightPointer = leftPointer+1;;
		
		while(leftPointer<string.length()) {
			System.out.println(leftPointer +  "  " +rightPointer );
			
			if(string.charAt(leftPointer)==string.charAt(rightPointer)) {
				if(rightPointer==(string.length()-1)/2) {
					leftPointer=rightPointer+1;
				}else {
					leftPointer++;	
				}
				
				rightPointer=string.length()-1;
				
			}else {
				rightPointer--;
			}
		}
		System.out.println(leftPointer +  "  " +rightPointer );
	    return (leftPointer==rightPointer)? -1:leftPointer;
	    
	    */ // end of my unsolved
		
		// Solution 1 - Frequency array
		int[] freqArray = new int[26];
		
		for(int index=0; index < string.length() ; index++) {
			freqArray[(string.charAt(index)-'a')]++;
			System.out.println(index+" "+(string.charAt(index)-'a')+" " +freqArray[(string.charAt(index)-'a')]);
		}
		
		for(int index=0; index < string.length() ; index++) {
			if(freqArray[(string.charAt(index)-'a')]==1) {
				return index;
			}
			System.out.println("* "+freqArray[(string.charAt(index)-'a')]);
		}
		return -1;		
	  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sample = "abczzqqabcc";
		int temp = firstNonRepeatingCharacter(sample);
		System.out.println(temp);
	}

}

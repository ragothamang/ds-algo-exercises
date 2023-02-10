package patternPrinting;

public class Symmetry {
	public static void symmetry(int n) {
        // Write your code here
		int spaces = 2*n-2;
		for(int i=1;i<=2*n-1;i++) {
			//stars
			int stars = i;
			if(i>n)stars=2*n-i;
			for(int j=1;j<=stars;j++) {
				System.out.print("*");
			}
			//space
			for(int j=1;j<=spaces;j++) {
				System.out.print(" ");
			}
			//starts
			for(int j=1;j<=stars;j++) {
				System.out.print("*");
			}
			System.out.println();	
			if(i<n) spaces = spaces-2;
			else spaces = spaces+2;
		}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		symmetry(4);
	}
	
	/*

*      *
**    **
***  ***
********
***  ***
**    **
*      *


	 */

}

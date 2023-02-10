package patternPrinting;

public class SymmetricVoid {
	public static void symmetry(int n) {
		// Write your code here
		int init = 0;
		for(int i=1;i<=n;i++) {
			//star
			for(int j=1;j<=n-i;j++) {
				System.out.print("*");
			}
			
			//space			
			for(int j=0;j<init;j++) {
				System.out.print(" ");
			}
			
			//star
			for(int j=1;j<=n-i;j++) {
				System.out.print("*");
			}
			init+=2;
			System.out.println();
		}
		
		init = 2*n-2;
		for(int i=1;i<=n;i++) {
			//star
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			
			//space			
			for(int j=0;j<init;j++) {
				System.out.print(" ");
			}
			
			//star
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			init-=2;
			System.out.println();
		}
		
		/*
		for(int i=n;i>1;i--) {

			for(int j=0;j < i;j++) {
				System.out.print("*");
			}

			for(int k=i;k<n;k++) {
				System.out.print(" ");
			}

			for(int k=i;k<n;k++) {
				System.out.print(" ");
			}
			for(int j=0;j < i;j++) {
				System.out.print("*");
			}

			System.out.println();
		}

		for(int i=1;i<=n;i++) {

			for(int j=0;j < i;j++) {
				System.out.print("*");
			}

			for(int k=i;k<n;k++) {
				System.out.print(" ");
			}

			for(int k=i;k<n;k++) {
				System.out.print(" ");
			}
			for(int j=0;j < i;j++) {
				System.out.print("*");
			}

			System.out.println();
		}
		*/
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		symmetry(5);
	}
	
	/*

**********
****  ****
***    ***
**      **
*        *
**      **
***    ***
****  ****
**********


	 */

}

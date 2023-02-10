package patternPrinting;

public class NumberCrown {
	 public static void numberCrown(int n) {
	        // Write your code here.
		 int space= 2*(n-1);
		 for(int rows=1;rows<=n;rows++) {
			 for(int i=1;i<=rows;i++) {
				 System.out.print(i);
			 }
			 for(int j=1;j<=2*n-2*rows;j++) {
//			 for(int j=1;j<=space;j++) {
				 System.out.print(" ");
			 }
			 for(int j=rows;j>=1;j--) {
				 System.out.print(j);
			 }
			 
			 System.out.println();
//			 space=-2;
		 }
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		numberCrown(4);
	}
/*
 
1      1
12    21
123  321
12344321
 
 */
}

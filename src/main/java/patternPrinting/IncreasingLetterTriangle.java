package patternPrinting;

public class IncreasingLetterTriangle {
	public static void nLetterTriangle(int n) {
        // Write your code here
		for(int i=0;i<n;i++) {
			for(char ch='A';ch <= 'A'+i;ch++) {
				System.out.print(ch+" ");
			}
			System.out.println();
		}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		nLetterTriangle(5);
	}

	/*

A 
A B 
A B C 
A B C D 
A B C D E 
		 
		 */
	
}

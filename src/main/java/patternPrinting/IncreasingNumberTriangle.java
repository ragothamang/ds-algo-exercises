package patternPrinting;

public class IncreasingNumberTriangle {
	public static void nNumberTriangle(int n) {
        // Write your code here
		int counter =1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(counter+" ");
				counter++;
			}
			System.out.println();
		}
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		nNumberTriangle(5);
	}
	/*

1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15 
	 
	 */
}

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

}

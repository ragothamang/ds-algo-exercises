package patternPrinting;

public class ReverseStarTriangle {
	public static void nStarTriangle(int n) {
        // Write your code here
		for(int i=n-1;i>=0;i--){
            for(int f=0;f<n-i-1;f++) {
            	System.out.print(" ");
            }
            for(int m=0;m<2*i+1;m++) {
            	System.out.print("*");
            }
            for(int f=0;f<n-i-1;f++)
            {
            	System.out.print(" ");
            }
            System.out.println("");
        }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		nStarTriangle(5);
	}

}
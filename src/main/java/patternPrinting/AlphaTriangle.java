package patternPrinting;

public class AlphaTriangle {
	public static void alphaTriangle(int n) {
        // Write your code here
		System.out.println("A " + (int)'A');
		System.out.println("Z " + (int)'Z');
		System.out.println("Z-A " + (char)(154-(90-n)));
		for(int i=0;i<=n;i++) {			
//			int ch = 'Z'-(i-1);
			int ch = (char)(154-(90-n));
			for(int j=i;j>=1;j--) {				
				System.out.print((char)ch--+" ");
			}
			System.out.println("");
		}
		
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		alphaTriangle(3);
	}

}

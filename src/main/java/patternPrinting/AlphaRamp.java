package patternPrinting;

public class AlphaRamp {
	public static void alphaRamp(int n) {
		// Write your code here
		for(int i=0;i<n;i++) {
			for(int j=0;j <= i;j++) {
				System.out.print((char)('A'+i)+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		alphaRamp(5);
	}

}

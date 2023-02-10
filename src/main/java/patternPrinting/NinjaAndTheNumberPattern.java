package patternPrinting;

public class NinjaAndTheNumberPattern {

	public static void getNumberPattern(int n) {
        // Write your code here.
		for(int i=0;i<(2*n-1);i++) {
			for(int j=0;j<(2*n-1);j++) {
				int top = i;
				int left = j;
				int right = (2*n-2)-j;
				int down = (2*n-2)-i;
				
				int result = n - Math.min(Math.min(top, down), Math.min(left, right));
				System.out.print(result);								
			}
			System.out.println();
		}
		
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getNumberPattern(4);

	}
	
	/*

4444444
4333334
4322234
4321234
4322234
4333334
4444444

	 */

}

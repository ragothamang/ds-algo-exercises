package patternPrinting;

public class ReverseLetterTriangle {

	public static void nLetterTriangle(int n) {
        // Write your code here
		for(int i=n;i>=1;i--) {
			for(char ch='A';ch < 'A'+i;ch++) {
				System.out.print(ch+" ");
			}
			System.out.println();
		}
		
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		nLetterTriangle(5);
	}

}

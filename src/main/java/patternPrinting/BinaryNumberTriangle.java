package patternPrinting;

public class BinaryNumberTriangle {
	public static void nBinaryTriangle(int n) {
		// Write your code here.
		/*
		int start =1;
		for(int i =0;i<n;i++) {
			if(i%2==0) start=1;
			else start=0;
			for(int j=0;j<=i;j++) {
				System.out.print(start);	
				start = 1-start;
			}
			System.out.println("");
		}
		 */
		for(int i=1; i<=n; i++){
			for(int j=1; j<=i; j++){
				if((i+j)%2==1){
					System.out.print("0");
				}
				else{
					System.out.print("1");
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		nBinaryTriangle(5);
	}

}

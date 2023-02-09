package patternPrinting;

public class ReversNumberTriangle {
	public static void nNumberTriangle(int n) {
        // Write your code here
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j +" ");
            }
            System.out.println("");
        }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		nNumberTriangle(5);
	}

}

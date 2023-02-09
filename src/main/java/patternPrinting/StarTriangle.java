package patternPrinting;

public class StarTriangle {
	public static void nStarTriangle_part_sol(int n) {
        // Write your code here
        for(int i=n;i>=1;i--){
        	int temp = i;
            for(int j=1;j<=n;j++){
            	if(j>=temp) {
            		System.out.print(" " +"*");
            	}else {
            		System.out.print(" ");
            	}
            }
            System.out.println("");
        }
    }
	public static void nStarTriangle(int n) {
        // Write your code here
		for(int i=0;i<n;i++){
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

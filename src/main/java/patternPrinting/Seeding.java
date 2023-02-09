package patternPrinting;

public class Seeding {
	public static void seeding(int n) {
        // Write your code here
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*" +" ");
            }
            System.out.println("");
        }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		seeding(4);
	}

}

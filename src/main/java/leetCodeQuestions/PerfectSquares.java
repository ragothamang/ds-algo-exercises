package leetCodeQuestions;

public class PerfectSquares {
	
	 public static int numSquares(int n) {
		 int resultSum = n;
		 int counter = 0;
		 boolean sqrN = isPerfectSquare(n);
		 System.out.println("n  "+ n);
		 System.out.println("sqrN  "+ sqrN);
		 int i =n;
		 while(i>0) {
			 
			 if(isPerfectSquare(i)) {				 
				 System.out.println("perfect Squares  "+ i);
				 if(n/i<=n) {
					 resultSum++;
				 }
			 }
			 
			 i--;
		 }
		 
	        return resultSum;
	    }

	private static boolean isPerfectSquare(int n) {
		 int i=1;
		while(i<=n){
			if(i*i==n) {
				return true;
			}
			i++;
		}
		
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int op = numSquares(13);
		System.out.println("op >>   "+ op);
 
	}

}

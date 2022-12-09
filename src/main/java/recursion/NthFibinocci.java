package recursion;

public class NthFibinocci {
	public static int getNthFib(int n) {
		// Write your code here.
		if(n==1) {
			return 0;
		}else if(n==2) {
			return 1;
		}else {
			return getNthFib(n-1)+getNthFib(n-2);	
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//0 1 1 2 3 5
		int fibb = getNthFib(7);

		System.out.println("fib >> "+ fibb);
	}

}

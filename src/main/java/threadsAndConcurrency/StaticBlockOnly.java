package threadsAndConcurrency;

public class StaticBlockOnly {
	static {
		System.out.println("this is only static block");
	}
	 public static void main(String[] args) {
	        System.out.println("This is the main method.");
	    }
}

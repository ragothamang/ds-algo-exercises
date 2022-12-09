package sampleCodesForCoreJava;

public class ReturnBreakContinue {

	//break
    public static void printWithBreak() {
        for (int x = 2; x <= 9; x++) {
            for (int y = 1; y <= x; y++) {
                System.out.println(y + "*" + x + "=" + (x * y) + "\t");
            }
            System.out.println();
                         System.out.println ("This is Before Break");
            /**
                          * If the result is Break, end the loop, the following statement will be executed
             */
            break;
//                         return;
        }
                 System.out.println ("Method End");
    }

	public static void printWithReturn() {
		for (int x = 1; x <= 9; x++) {
			for (int y = 1; y <= x; y++) {
				System.out.print(y + "*" + x + "=" + (x * y) + "\t");
			}
			System.out.println("***");
//			return;
			System.out.println ("This is Return before");
			/**
			 * If it is a return, end the method, the following statement will not be executed
			 */
			return;
		}
		System.out.println ("Method End");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printWithReturn();
//		System.out.println("this will continue after return ");
		
//		printWithBreak();
	}

}

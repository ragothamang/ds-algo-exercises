package bitManipulation;

class CountSetBit {
    private static int helper(int n) {
    	 int a = 125, temp = a;
         int setBits = 0;
         
         while (a != 0) {
             if ((a & 1) == 1)
             setBits += 1;
             a = a >> 1;
             System.out.println("Binary "+ Integer.toBinaryString(a) );
             System.out.println(a);
         }
         System.out.println("setBits----"+ setBits);
         System.out.println("----");
    	
        int count = 0;
        while (n > 0) {
        	System.out.println("Binary n  "+ Integer.toBinaryString(n) );
            n &= (n - 1);
            System.out.println(n);
            count++;
        }
        return count;
    }
 
    public static void main(String[] args) {
        int number = 125;
        System.out.println("SetBit Count is : " + helper(number));
    }
}

package bitManipulation;

public class NthBit {

	public static void main(String[] args){
        int num = 81;
        int i = 6;
        int mask = 1 << i;
        System.out.println("num--   "+ Integer.toBinaryString(num));
        System.out.println("num length --   "+ Integer.toBinaryString(num).length());
        String res = ((num & mask) == 0) ? i+" bit is 0" : i+" bit is 1";
        System.out.println(res);
    }
}

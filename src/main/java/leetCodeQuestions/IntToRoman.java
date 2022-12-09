package leetCodeQuestions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class IntToRoman {
	public static String intToRom(int num) {
		System.out.println("num->  "+ num);
		/*
		
		HashMap<Integer, String> intToStrMap = new HashMap<Integer, String>();
		List<Integer> intArr = new ArrayList<Integer>();
		intToStrMap.put(Integer.valueOf(1),"I");
		intToStrMap.put(Integer.valueOf(5),"V");
		StringBuilder sbld = new StringBuilder();
		int divisor = 1;
		int reminder = 0;
		int quotent = num;
		while(quotent!=0) {
			
			reminder = quotent % divisor;
			quotent = quotent / divisor;
			divisor= divisor*10;
			System.out.println("Q  -> "+quotent+"   R -> "+ reminder+ " divisor  > " + divisor );
		}
		
		return "";
		*/
		
		
		/*Optimal solution*/
		if (num < 1 || num > 3999) return "";
		
		StringBuilder result = new StringBuilder();
		
		String[] roman = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
		int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
		
		int i = 0;
	            //iterate until the number becomes zero, NO NEED to go until the last element in roman array
		while (num >0) {
			while ( num >= values[i]) {
				num -= values[i];
				result.append(roman[i]);
			}
			i++;
		}
		return result.toString();
		 
		 
		 /* End of Optimal solution*/
		
		/* Beautiful solution*/
		 
//		String M[] = {"", "M", "MM", "MMM"};
//		String C[] = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
//		String X[] = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
//		String I[] = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
//		return M[num/1000] + C[(num%1000)/100] + X[(num%100)/10] + I[num%10];

		 
		 /* End of Beautiful Solution*/
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String temp = intToRom(3738);
		System.out.println( temp );
	}

}

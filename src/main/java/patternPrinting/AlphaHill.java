package patternPrinting;

import java.util.Scanner;

public class AlphaHill {

	public static void alphaHill(int n) {
		// Write your code here
		for(int i=0;i<n;i++) {
			for(int j=0;j<(n-i-1);j++) {
				System.out.print(" ");
			}
			char ch ='A';
			int breakPoint = (2*i+1)/2;
			for(int j=1;j <= (2*i+1);j++) {
				System.out.print(ch);
				if(j<=breakPoint) {
					ch++;
				}else {				
					ch--;
				}
			}
			for(int j=0;j<n-i-1;j++) {
				System.out.print(" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		alphaHill(5);
		/*
	    A    
	    ABA   
	   ABCBA  
	  ABCDCBA 
	 ABCDEDCBA
	 */
		/*
		 Scanner s= new Scanner(System.in);
	        int n = s.nextInt();
	        int i=1;
	        
	        while(i<=n)
	        {   int j=1;
	         char startingChar = (char)('A'+i-1);
	         while(j<=i)
	         {
	             System.out.print(startingChar);
	             
	             j++;
	         }
	            i++;
	            System.out.println();
	        }
	        */
	}

}

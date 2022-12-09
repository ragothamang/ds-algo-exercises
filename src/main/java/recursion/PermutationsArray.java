package recursion;

import java.util.ArrayList;
import java.util.List;

public class PermutationsArray {
	static int count= 0;
	
	public static List<List<Integer>> getPermutations(List<Integer> array) {
	    // Write your code here.
		List<List<Integer>> permutations = new ArrayList<List<Integer>>();
		getPermutations(array, new ArrayList<Integer>(), permutations);		
	    return permutations;
	  }

	private static void getPermutations(List<Integer> array, List<Integer> currentPermutation,
			List<List<Integer>> permutations) {
		// TODO Auto-generated method stub		
		System.out.println();
		System.out.println( " count " + ++count);
	
	
		System.out.println("Incoming values >  array  "+ array +  "currentPermutation  " + currentPermutation + " perms "+ permutations );
		
		if(array.size() == 0 && currentPermutation.size() > 0){
			System.out.println("**** insertion  ");
			permutations.add(currentPermutation);			
		}else {
			System.out.println(">>>>>>  Before starting For loop  ");
			for(int i=0; i< array.size();i++) {
				System.out.println("i  "+ i);
				System.out.println(" array before assigning  "+ array);
				List<Integer> newArray = new ArrayList<Integer>(array); 
				newArray.remove(i);				
				System.out.println(" newArray immed after remove  "+ newArray);
				System.out.println(" array after assigning  "+ array);
				System.out.println( "  currentPermutation " + currentPermutation );
				List<Integer> newPermutation = new ArrayList<Integer>(currentPermutation);
				System.out.println(" newPermutation before add " + newPermutation);
				newPermutation.add(array.get(i));
			
				System.out.println(" newArray "+ newArray+"   newPermutation  "+ newPermutation+" Permutations "+ permutations);
				getPermutations(newArray, newPermutation, permutations);
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> ip = new ArrayList<Integer>(List.of(1,2,3));
		System.out.println(ip);
		List<List<Integer>> op = getPermutations(ip);
		System.out.println(op);
	}

}

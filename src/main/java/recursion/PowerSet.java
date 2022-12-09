package recursion;

import java.util.ArrayList;
import java.util.List;

public class PowerSet {

	public static List<List<Integer>> powerset(List<Integer> array) {
		 // Iterative solution		
		List<List<Integer>> subsets = new ArrayList<List<Integer>>();
		subsets.add(new ArrayList<Integer>());
		for(Integer ele : array) {
			int length = subsets.size();
			for(int i=0; i<length; i++) {
				List<Integer> currentSubset = new ArrayList<Integer>(subsets.get(i));
				currentSubset.add(ele);
				subsets.add(currentSubset);
			}
		}
		return subsets;
		
		// recursive solution 
//		return powerset(array, array.size()-1);
	}

	private static List<List<Integer>> powerset(List<Integer> array, int idx) {
		// TODO Auto-generated method stub
		
		System.out.println("------------- ");
		System.out.println("idx >  "+ idx);
		if(idx<0) {
			List<List<Integer>> emptySet = new ArrayList<List<Integer>>();
			emptySet.add(new ArrayList<Integer>());
			System.out.println(" after adding element "+ emptySet);
			return emptySet;
			
		}

		int ele = array.get(idx);
		System.out.println(" current  ele to be added to currentSubset >  "+ ele);
		System.out.println(" array >  "+  array);
		List<List<Integer>> subsets = powerset(array, idx-1);	
		System.out.println("After base case subsets   "+  subsets);
		int length = subsets.size();
		System.out.println("  subsets  "+ subsets);
		System.out.println("length > " + length);
		
		for(int i=0 ; i < length; i++) {
			
			System.out.println("i  "+ i);
			List<Integer> currentSubset = new ArrayList<Integer>(subsets.get(i));
			System.out.println(" currentSubset before adding element  "+ currentSubset);
			currentSubset.add(ele);
			subsets.add(currentSubset);
			
			System.out.println(" currentSubset >>  "+ currentSubset);
			System.out.println("after adding currentSubset  >>   "+ subsets);
		}
		
		System.out.println("idx  "+ idx+ "   Major subsets  "+ subsets);
		System.out.println("-----------------------------------------");
		return subsets;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> ip = new ArrayList<>(List.of(6,7,8,9));
		System.out.println(ip);
		  List<List<Integer>> op = powerset(ip);
		 System.out.println(op);
	}

}

package array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PascalTriangle {
	public List<List<Integer>> generate(int numRows) {
		List<List<Integer>> outList = new ArrayList<>();
		//		 List<Integer> innerList = new ArrayList<Integer>();
		for (int i = 1; i <= numRows; i++) {
			List<Integer> innerList = new ArrayList<Integer>();
			System.out.println("row -- "+ i);
			for (int j = 1; j <= i; j++) {
				if (i == j || j == 1) {
					innerList.add(1);
					
				} else {
//					innerList.add(j);
					System.out.println("prev - arr "+outList.get(i-2));
					System.out.println("prev - 2 numbers  "+outList.get(i-2).get(j-2)+"  "+outList.get(i-2).get(j-1));
					System.out.println("-->  "+ (Integer.valueOf(outList.get(i-2).get(j-2))+Integer.valueOf(outList.get(i-2).get(j-1))));
					innerList.add((Integer.valueOf(outList.get(i-2).get(j-2))+Integer.valueOf(outList.get(i-2).get(j-1))));
				}
			}
			outList.add((ArrayList<Integer>) innerList);			
		}
		System.out.println(outList);
		return outList;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PascalTriangle obj = new PascalTriangle();
		List<List<Integer>> lst = obj.generate(5);
		System.out.println();
	}

}

package array;

import java.util.ArrayList;
import java.util.List;

public class MoveElementToEnd {
	
	public static List<Integer> moveElementToEnd(List<Integer> array, int toMove) {
	    int lastIdx = array.size() - 1, firstIdx = 0;

	    while (firstIdx < lastIdx) {
	      while (lastIdx > firstIdx && array.get(lastIdx) == toMove) --lastIdx;

	      if (array.get(firstIdx) == toMove) {
	        array.set(firstIdx, array.get(lastIdx));
	        array.set(lastIdx, toMove);
	        --lastIdx;
	      }

	      ++firstIdx;
	    }

	    return array;
	  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> array = new ArrayList<Integer>(List.of(2, 1, 2, 2, 2, 3, 4, 2));
		  int toMove = 2;
		  
		  System.out.println("IP  >   "+ array);
		  List<Integer> op = moveElementToEnd(array, toMove);
		  System.out.println("op   "+ op);
	}

}

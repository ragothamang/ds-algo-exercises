package sampleCodesForCoreJava;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Demo...");
        int [] [] twoDimArray = new int[][]{
                {1,2}, {3,5}, {8,15}
        };
/*
        List< List<Integer> > nestedLists =
                Arrays.
                //Convert the 2d array into a stream.
                stream(twoDimArray).
                //Map each 1d array (internalArray) in 2d array to a List.
                map(
                        //Stream all the elements of each 1d array and put them into a list of Integer.
                        internalArray -> Arrays.stream(internalArray).boxed().collect(Collectors.toList()
                    )
        //Put all the lists from the previous step into one big list.
        ).collect(Collectors.toList());
*/
        
        List<String> nestedLists = Arrays.stream(twoDimArray)
                .map(Arrays::toString)
                .collect(Collectors.toList());
        nestedLists.forEach(System.out::println);
        
        System.out.println(nestedLists.toString());
	}

}

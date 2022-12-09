package leetCodeQuestions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueNumberOfOccurrences {

	/*
	 // Constant to make elements non-negative.
    final static int K = 1000;
    
    public static boolean uniqueOccurrences(int[] arr) {
        int freq[] = new int[2 * K + 1];
      
        // Store the frequency of elements in the unordered map.
        for (int num : arr) {
            freq[num + K]++;
        }
        
        // Sort the frequency count.
        Arrays.sort(freq);
        
        // If the adjacent freq count is equal, then the freq count isn't unique.
        for (int i = 0; i < 2 * K; i++) {
            if (freq[i] != 0 && freq[i] == freq[i + 1]) {
                return false;
            }
        }
        
        // If all the elements are traversed, it implies frequency counts are unique.
        return true;
    }
*/
	
	 public boolean uniqueOccurrences(int[] arr) {
	        // Store the frequency of elements in the unordered map.
	        Map<Integer, Integer> freq = new HashMap<>();
	        for (int num : arr) {
	            freq.put(num, freq.getOrDefault(num, 0) + 1);
	        }
	        
	        // Store the frequency count of elements in the unordered set.
	        Set<Integer> freqSet = new HashSet<>(freq.values());
	        
	        // If the set size is equal to the map size, 
	        // It implies frequency counts are unique.
	        return freq.size() == freqSet.size();
	    }
	 
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

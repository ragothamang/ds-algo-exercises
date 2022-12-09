package leetCodeQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagram {

	 public static  List<List<String>> groupAnagrams(String[] strs) {
		 if (strs == null || strs.length == 0) return new ArrayList<>();
	        Map<String, List<String>> map = new HashMap<>();
	        for (String s : strs) {
	            char[] ca = s.toCharArray();
	            Arrays.sort(ca);
	            String keyStr = String.valueOf(ca);
	            if (!map.containsKey(keyStr)) map.put(keyStr, new ArrayList<>());
	            map.get(keyStr).add(s);
	        }
	        
	        return new ArrayList<>(map.values());
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> ipStrLst = new ArrayList<String>();
		ipStrLst.add("eat");
		ipStrLst.add("tea");
		ipStrLst.add("tan");
		ipStrLst.add("ate");
		ipStrLst.add("nat");
		ipStrLst.add("bat");
		char[] c1 = {'e','t'};
		String str1 = String.valueOf(c1);
		
		char[] c2 = {'t','e'};
		String str2 = String.valueOf(c2);
		
		System.out.println("str1  "+str1+"   str2  "+ str2);
	}

}

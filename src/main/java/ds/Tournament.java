package ds;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class Tournament<E> {
	public static String tournamentWinner(
//			ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results
			) {
		// Write your code here.
		ArrayList<ArrayList<String>> competitions = new ArrayList<ArrayList<String>>() ;
		ArrayList<Integer> results = new ArrayList<Integer>();
		ArrayList<String> arrayList = new ArrayList<String>() ;
		ArrayList<String> arrayList1 = new ArrayList<String>() ;
		ArrayList<String> arrayList2 = new ArrayList<String>() ;
		/*
		 * ["HTML", "Java"], ["Java", "Python"], ["Python", "HTML"]
		 */
		
		arrayList.add("HTML");
		arrayList.add("Java");
		
		arrayList1.add("Java");
		arrayList1.add("Python");
		
		arrayList2.add("Python");
		arrayList2.add("HTML");
		
		competitions.add(arrayList);
		competitions.add(arrayList1);
		competitions.add(arrayList2);
		
		results.add(Integer.valueOf(0));
		results.add(Integer.valueOf(1));
		results.add(Integer.valueOf(1));
		
		System.out.println(competitions);
		System.out.println(results);
		
		SortedMap<String, Integer> teamToScoreMap = new TreeMap<String, Integer>();
		int i = 0;
		String winner=null;
		String tournamentWinner= null;
		int maxScore = 0;
		for (ArrayList<String> string : competitions) {
			System.out.println(string);
			if(results.get(i)==0) {				
				System.out.println(string.get(1));
				winner=string.get(1);				
			}else {
				System.out.println(string.get(0));
				winner=string.get(0);
			}
			
			if(teamToScoreMap.containsKey(winner)) {
				teamToScoreMap.put(winner, (Integer) (teamToScoreMap.get(winner).intValue()+1));
			}else {
				teamToScoreMap.putIfAbsent(winner, 1);
			}
			
			if(teamToScoreMap.get(winner).intValue()>maxScore) {
				tournamentWinner = winner;
			}
			i++;
			System.out.println("t winner-->   "+tournamentWinner);
		}
		System.out.println(teamToScoreMap);
		System.out.println(teamToScoreMap.firstKey());
		
		for (String string : teamToScoreMap.keySet()) {
			System.out.println("**  "+string);
			if(teamToScoreMap.get(string)>maxScore) {
				System.out.println("v  "+teamToScoreMap.get(string));
				tournamentWinner = string;
				maxScore = teamToScoreMap.get(string).intValue();
			}
		}
		System.out.println("final >> "+ tournamentWinner);
		return "";
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s = tournamentWinner();
	}

}

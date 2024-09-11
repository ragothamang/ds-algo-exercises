package javaCollectionsLearning;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.TreeMap;

public class CollectionFrameworkLearning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<>();
		list.add("Java");
		list.add("Python");
		list.add("C++");
		System.out.println(list.get(1));
		
		System.out.println("***  Iterator sample ***");
		 Iterator<String> iterator = list.iterator();
	        while (iterator.hasNext()) {	            
	            System.out.println(iterator.next());
	        }
		
		Set<Integer>set = new HashSet<>();
		set.add(1);
		set.add(2);
		set.add(1);
		System.out.println(set.size());
		
		Map<String, Integer> map = new HashMap<>();
		map.put("Alice", 30);
		map.put("Bob", 25);
		map.put("Alice", 35);
		System.out.println(map.get("Alice"));
		
		List<String> list1 = Arrays.asList("A", "B", "C", "D");
		for (String s : list1) {
		    System.out.print(s + " ");
		}
		System.out.println();
		
		Queue<Integer> queue = new LinkedList<>();
		queue.add(1);
		queue.add(2);
		queue.add(3);
		System.out.println("LinkedList -> "+queue.peek());
		
		Deque<Integer> deque = new ArrayDeque<>();
		deque.offerFirst(1);
		deque.offerLast(2);
		System.out.println(deque.pollLast());
		
		Map<String, String> map1 = new TreeMap<>();
		map1.put("c", "C");
		map1.put("b", "B");
		map1.put("a", "A");
		for (String key : map1.keySet()) {
		    System.out.print(key + " ");
		}
		
		System.out.println(" \n *** listConvertedFromArrayasList *** ");
		
		List<String> listConvertedFromArrayasList = new ArrayList<>(Arrays.asList("A", "B", "C"));
		listConvertedFromArrayasList.remove("B");
		System.out.println(listConvertedFromArrayasList);
		
		System.out.println(" \n *** setConvertedFromArrayasList *** ");
		Set<String> setConvertedFromArrayasList = new LinkedHashSet<>(Arrays.asList("A", "B", "C"));
		setConvertedFromArrayasList.add("D");
		setConvertedFromArrayasList.add("E");
		System.out.println(setConvertedFromArrayasList);
	}

}

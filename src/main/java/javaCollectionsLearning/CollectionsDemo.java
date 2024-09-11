package javaCollectionsLearning;

import java.util.*;

public class CollectionsDemo {

    public static void main(String[] args) {
        // 1. Sort List of Integers
        List<Integer> numbers = new ArrayList<>(Arrays.asList(5, 3, 9, 1, 7));
        System.out.println("Original List: " + numbers);
        Collections.sort(numbers);
        System.out.println("Sorted List: " + numbers);

        // 2. Binary Search in the Sorted List
        int index = Collections.binarySearch(numbers, 7);
        System.out.println("Index of 7: " + index);

        // 3. Shuffle the List
        Collections.shuffle(numbers);
        System.out.println("Shuffled List: " + numbers);

        // 4. Reverse the List
        Collections.reverse(numbers);
        System.out.println("Reversed List: " + numbers);

        // 5. Copy List
        List<Integer> copyList = new ArrayList<>(Collections.nCopies(numbers.size(), 0)); // Create a list of zeros
        Collections.copy(copyList, numbers);
        System.out.println("Copied List: " + copyList);

        // 6. Fill List with a Value
        Collections.fill(copyList, 100);
        System.out.println("List Filled with 100: " + copyList);

        // 7. Swap Elements in the List
        Collections.swap(numbers, 1, 3);
        System.out.println("List After Swapping: " + numbers);

        // 8. Find Min and Max in the List
        int min = Collections.min(numbers);
        int max = Collections.max(numbers);
        System.out.println("Min: " + min + ", Max: " + max);

        // 9. Unmodifiable List
        List<Integer> unmodifiableList = Collections.unmodifiableList(numbers);
        System.out.println("Unmodifiable List: " + unmodifiableList);
        // Trying to modify the unmodifiable list will throw UnsupportedOperationException
        // unmodifiableList.add(10); // Uncommenting this will throw exception

        // 10. Synchronized List for Thread Safety
        List<String> syncList = Collections.synchronizedList(new ArrayList<>(Arrays.asList("A", "B", "C")));
        synchronized (syncList) {
            syncList.add("D");
            System.out.println("Synchronized List: " + syncList);
        }

        // 11. Empty List
        List<String> emptyList = Collections.emptyList();
        System.out.println("Empty List: " + emptyList);

        // 12. Singleton List
        List<String> singletonList = Collections.singletonList("Single Item");
        System.out.println("Singleton List: " + singletonList);
    }
}

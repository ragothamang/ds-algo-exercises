package javaCollectionsLearning;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Person {
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters for name and age
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // For printing the object in a readable format
    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}


public class ComparatorLearning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 30));
        people.add(new Person("Bob", 25));
        people.add(new Person("Charlie", 35));

        // Sort by age using an anonymous Comparator class
        Comparator<Person> compareByAge = new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return Integer.compare(p1.getAge(), p2.getAge());
            }
        };
        Collections.sort(people, compareByAge);

        System.out.println("Sorted by age:");
        for (Person person : people) {
            System.out.println(person);
        }

        // Sort by name using an anonymous Comparator class
        Comparator<Person> compareByName = new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return p1.getName().compareTo(p2.getName());
            }
        };
        Collections.sort(people, compareByName);

        System.out.println("\nSorted by name:");
        for (Person person : people) {
            System.out.println(person);
        }

	}

}

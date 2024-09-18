package dataForLearning;

import java.util.Arrays;
import java.util.List;

public class Employee {
    private String name;
    private int age;
    private String department;
    private double salary;

    public Employee(String name, int age, String department, double salary) {
        this.name = name;
        this.age = age;
        this.department = department;
        this.salary = salary;
    }

    // Getters for the fields
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getDepartment() { return department; }
    public double getSalary() { return salary; }

    public static List<Employee> getEmployees() {
        return Arrays.asList(
            new Employee("John Doe", 25, "Engineering", 60000),
            new Employee("Jane Smith", 30, "Marketing", 70000),
            new Employee("Peter Parker", 35, "Engineering", 80000),
            new Employee("Bruce Wayne", 40, "Management", 100000),
            new Employee("Clark Kent", 28, "Marketing", 65000)
        );
    }
}

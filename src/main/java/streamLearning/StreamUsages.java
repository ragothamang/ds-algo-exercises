package streamLearning;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import dataForLearning.Employee;

// https://medium.com/@tecnicorabi/top-10-java-stream-api-coding-questions-and-answers-with-practical-examples-2b8612d51290

public class StreamUsages {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> employees = Employee.getEmployees();
		System.out.println(employees.size());
		
		System.out.println(" *** filter employee based on certain Age *** ");
		
		List<Employee> employeeAgeFilter = employees.stream().filter(e -> e.getAge()>30).collect(Collectors.toList());
		employeeAgeFilter.forEach(e -> System.out.println(e.getName()+"  "+e.getAge()));
		
		System.out.println(" *** List employee based on Department *** ");
		List<String> employeeDepartments = employees.stream().map(Employee::getDepartment).distinct().collect(Collectors.toList());
		employeeDepartments.forEach(e -> System.out.println(e));
		
		System.out.println(" ***  employee Max salary *** ");
		Employee EmpWithMaxSal = employees.stream().max(Comparator.comparingDouble(Employee::getSalary)).get();
		System.out.println(EmpWithMaxSal.getName()+" "+EmpWithMaxSal.getSalary());
		
		System.out.println(" ***  employee Average salary *** ");
		Double avgOfEmp= employees.stream().mapToDouble(Employee::getSalary).average().getAsDouble();
		System.out.println("Average salary  "+ avgOfEmp);
		
		System.out.println(" ***  employee group by emp *** ");
		Map<String, List<Employee>> depToEp = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment));
		depToEp.forEach((dep, emps)->{System.out.println(dep); emps.forEach(e-> System.out.println(e.getName()));});
		
		System.out.println(" ***  employee find all match *** ");
		boolean isAllAge = employees.stream().allMatch(e-> e.getAge()>20);
		System.out.println("all are > 20 age "+ isAllAge);
		
		
		System.out.println(" ***  employee filter by department *** ");
		Employee empFromSpecificDepartment = employees.stream().filter(e-> "Marketing".equals(e.getDepartment())).findAny().get();
		System.out.println("empFromSpecificDepartment  (Marketing)  "+ empFromSpecificDepartment.getName());
		
		
		System.out.println(" ***  employee count by department *** ");
		Map<String, Long> depToEmp = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
		depToEmp.forEach((dep, count)-> System.out.println(dep+ "  "   +count));
		
		
		System.out.println(" ***  employee by department *** ");
		List<Employee> sortedEmployees = employees.stream()
			    .sorted(Comparator.comparing(Employee::getName))
			    .collect(Collectors.toList());

		sortedEmployees.forEach(e -> System.out.println(e.getName()));
			
		System.out.println(" ***  employee by department *** ");	
			
		double totalSalary = employees.stream()
			    .mapToDouble(Employee::getSalary)
			    .sum();

		System.out.println("Total Salary: $" + totalSalary);
		
		System.out.println(" ***  sum of salary*** ");
		double totalSumSalary = employees.stream()
			    .mapToDouble(Employee::getSalary)
			    .sum();

			System.out.println("Total Salary: $" + totalSumSalary);
			
	}

}


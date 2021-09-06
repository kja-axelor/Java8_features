package mapDemo;

import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Arrays;
class Employee
{
	int empid;
	String empname;
	int salary;
	
//	constructor
	
	public Employee(int id, String name, int salary) {
		this.empid =  id;
		this.empname = name;
		this.salary = salary;
	}
	
	
	
}
public class Example_filter_map {

	public static void main(String[] args) {
		
//		create collection 
		/*List<Employee> emplist = new ArrayList<Employee>();
		
//		add objects to the list
		emplist.add(new Employee(1,"krjani",25000));
		emplist.add(new Employee(2,"Ayush",13000));
		emplist.add(new Employee(3,"Jenish",17000));*/
		
//		other way also we can add objects to the list
		List<Employee> emplist = Arrays.asList(
				new Employee(1,"krjani",25000),
				new Employee(2,"Ayush",13000),
				new Employee(3,"Jenish",17000)
				);
//		condition is combination of filter and map 
//		filter salary is >  15000
		
		List<Integer> results = new ArrayList<>();
		
		results = emplist.stream()
				.filter(n -> n.salary > 15000)
				.map(n -> n.salary)
				.collect(Collectors.toList());
		
		
//		printing objects
//		for (Employee result: results) {
//			System.out.println(result.salary);
//		}	
		
		System.out.println(results);

		
	}

}

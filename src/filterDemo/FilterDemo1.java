package filterDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class FilterDemo1 {
	public static void main(String args[]) {
//		ArrayList<Integer> numbers = new ArrayList<>();
//		numbers.add(15);
//		numbers.add(20);
//		numbers.add(18);
//		numbers.add(25);
//		we can also create an arrayList using Arrays class
		List<Integer> numbers = Arrays.asList(15,10,54,48);
		System.out.println(numbers);
	 	
//		created empty collection
		List<Integer> results = new ArrayList<>();
		
//		without using stream concept
//		for (int i: numbers) {
//			if (i % 2 == 0) {
//				results.add(i);
//			}
//		}
//	System.out.println(results);
		
//		with Stream Concept
		
////		we have to add collection in Stream (collection.stream)
//		results = numbers.stream().filter(n -> n%2 == 0).collect(Collectors.toList());
//		System.out.println(results);
//		
//		with directly print the  filtered data (forEach will only replacing the lamda expression)
//		numbers.stream().filter(n -> n%2 == 0).forEach(n -> System.out.println(n));

		
//		we can also use System.out method for just only printing
//		numbers.stream().filter(n -> n%2 == 0).forEach(System.out::println);
	
	
	} 

}

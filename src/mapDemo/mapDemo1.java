package mapDemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;

public class mapDemo1 {
	public static void main(String[] args) {
		
		List<String> vehicles = Arrays.asList("bus","car","bicycle","flight","train");
		
//		transform into uppercase latter and store into another collection
		
//		without stream concept
//		
		List<String> results = new ArrayList<String>();
//		
////		using forEach loop
//		
//		for (String result: vehicles) {
//			results.add(result.toUpperCase());
//		}
//		
////		print the results collections
//		
//		System.out.println(results);
		
//		using stream concept
		results = vehicles.stream().map(n->n.toUpperCase()).collect(Collectors.toList());
		
		System.out.println(results);
	}

}

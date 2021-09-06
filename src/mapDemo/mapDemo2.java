package mapDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class mapDemo2 {

	public static void main(String[] args) {
		List<String> vehicles = Arrays.asList("bus","car","bicycle","flight","train");
		
//		calculate all the vehicles length and store into another collection
		
//		without stream concept
		for (String n: vehicles) {
			System.out.println(n.length());
		}
		
//		create empty collection for storing result data
		List<Integer> results = new ArrayList<>();
		
//      with using map concept
		results = vehicles.stream().map(n -> n.length()).collect(Collectors.toList());
		
	}

}

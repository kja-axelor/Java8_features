package filterDemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;

public class filterDemo2 {

	public static void main(String args[]) {
		
		List<String> names = Arrays.asList("Fatehkr","jani","chirag","rohan");
		
//		this condition on based we filter the data 6<len<8
		
//		created a results collection which can be used to store the result data
		List<String> results = new ArrayList<>();
		
		results = names.stream().filter(n -> n.length() > 6 && n.length() < 8).collect(Collectors.toList());
		
		System.out.println(results);
		
	}
}

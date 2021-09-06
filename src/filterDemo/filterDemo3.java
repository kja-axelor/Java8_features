package filterDemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;;

public class filterDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		here we filter collection from null values
		
//		created collections
		List<String> names = Arrays.asList("Fatehkr",null,"chirag","rohan",null);
		
//		remove null this is condition 
		
//		empty collection
		
		List<String> results = new ArrayList<>();
		
//		Stream and apply filter
		
		results = names.stream().filter(n -> n!=null).collect(Collectors.toList());
		
//	    print results
		System.out.println(results);
	
		
	}

}

package streamMethods;

import java.util.List;
import java.util.Arrays;
import java.util.Optional;
public class methodDemo2 {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(2,3,4,5,6,7,8,9,10,11);
		
//		count()
		long even = numbers.stream().filter(n -> n % 2 == 0).count();
		System.out.println(even);
		
//		min
		Optional <Integer> min = numbers.stream().min((val1,val2) -> 
		{
			return val1.compareTo(val2);
		});
		System.out.println(min.get());
		
//		max
		Optional <Integer> max = numbers.stream().max((val1,val2) -> 
		{
			return val1.compareTo(val2);
		});
		System.out.println(max.get());
		
	}

}

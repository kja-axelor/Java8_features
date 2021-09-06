package mapDemo;

import java.util.Arrays;
import java.util.List;

public class mapDemo3 {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(2,3,4,7,9);
		
//		multiply every element with 3 and store it to another collection
		
//		without stream
//		for(Integer n: numbers){
//			System.out.println(n*3);
//		}
		
//		with Stream concept
		
		numbers.stream().map(n -> n*3).forEach(n -> System.out.println(n));
		

	}

}

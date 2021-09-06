package streamMethods;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class methodDemo5 {

	public static void main(String[] args) {
//		String [] arr = new String[] {"A","D","C","72","82","43"};
//		Arrays.stream(arr).sorted().forEach(System.out::println);
		List<Integer> myList = Arrays.asList(2,4,7,3,7,8,9);
		myList.stream().sorted().forEach(System.out::println);//ascending order
		myList.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);//descending order
	}

}

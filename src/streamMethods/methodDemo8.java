package streamMethods;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class methodDemo8 {

	public static void main(String[] args) {
		List<String> vehicle = Arrays.asList("bus","car","bycycle","bus","car","car","bike");
		List<String> driver = Arrays.asList("krjani","ketan","kishor","kirti");
		
//		create stream for each collection
		Stream<String> s1 = vehicle.stream(); 
		Stream<String> s2 = driver.stream(); 
		List<String> conStream = Stream.concat(s1, s2).collect(Collectors.toList());
		System.out.println(conStream);
	}
}

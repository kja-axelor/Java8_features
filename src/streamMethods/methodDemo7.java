package streamMethods;

import java.util.List;
import java.util.Arrays;
import java.util.Optional;

public class methodDemo7 {

	public static void main(String[] args) {
		
		List<String> name = Arrays.asList("Aarti","Amee","Avadhi","Marry","priyanka");
		List<String> empty = Arrays.asList();
		
//		findAny
		Optional<String> result = name.stream().findAny();
		System.out.println(result.get());
		
		
		Optional<String> rslt = empty.stream().findAny();
//		System.out.println(rslt.get()); no value present exceptions
		
		
//		findFirst
		List<String> marks = Arrays.asList("one","two","three","four");
		
		Optional<String> rsl =  marks.stream().findFirst();
		System.out.println(rsl.get());
		
		

	}

}

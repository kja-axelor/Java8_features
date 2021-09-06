package streamMethods;

import java.util.List;
import java.util.Arrays;
import java.util.Optional;
public class methodDemo3 {

	public static void main(String[] args) {
		List<String> myList = Arrays.asList("A","B","C","1","2","3");
		
		Optional<String> result = myList.stream().reduce((val1,val2)->{
			return val1 + val2;
//			return val2 + val1;
		});   
		System.out.println(result.get());
	}

}

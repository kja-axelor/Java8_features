package streamMethods;

// distinct()  limit() non-terminal
// count() forEach() terminal
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class methodDemo1 {

	public static void main(String[] args) {
		List<String> vehicleList = Arrays.asList("bus","car","bycycle","bus","car","car","bike");
		
		
//		only distinct value how to get
		
//		List<String> result = vehicleList.stream().distinct().collect(Collectors.toList());
//		System.out.println(result);
		
//		forEach
		
	    vehicleList.stream().distinct().forEach(n -> System.out.println(n));
	    
//	    count method
	    long count = vehicleList.stream().distinct().count();
	    System.out.println(count);
	    
//	    limit method
	    List<String> limited = vehicleList.stream().limit(4).collect(Collectors.toList());
	    System.out.println("Limited Objects"+limited);
	}
}

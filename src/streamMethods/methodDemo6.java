package streamMethods;

import java.util.HashSet;
import java.util.Set;
public class methodDemo6 {

	public static void main(String[] args) {
		Set<String> fruites = new HashSet<String>();
		fruites.add("one apple");
		fruites.add("one banana");
		fruites.add("two oranges");
		fruites.add("four grapes");
		fruites.add("one Mangoes");
		fruites.add("three guavas");
		
//		anyMatch
		boolean result = fruites.stream().anyMatch(n -> {
			return n.startsWith("one");
		});
		System.out.println(result);
		
//		allMatch
		boolean rslt = fruites.stream().allMatch(n -> {
			return n.startsWith("one");
		});
		System.out.println(rslt);
		
//		noneMatch
		boolean rsl = fruites.stream().noneMatch(n -> {
			return n.startsWith("one");
		});
		System.out.println(rsl);
		
		
		
	}

}

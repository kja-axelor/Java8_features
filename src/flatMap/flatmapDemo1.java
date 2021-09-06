package flatMap;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Arrays;
public class flatmapDemo1 {

	public static void main(String[] args) {
//		created collection
		List<Integer> list1 = Arrays.asList(1,2,3,4,5,6,7);
		
		List<Integer> list2 = new ArrayList<Integer>();
		
//		upadated value using map
		list2 = list1.stream().map(n -> n + 10).collect(Collectors.toList());
		
		System.out.println(list2);
		
//		FlatMap Concept
		List<Integer> lst1 = Arrays.asList(1,2);
		List<Integer> lst2 = Arrays.asList(4,6); 
		List<Integer> lst3 = Arrays.asList(5,7);
		
//		combine all this list into single list
		List<List<Integer>> finalList =  Arrays.asList(lst1, lst2,lst3);
		
		
//		create results collections for storing combined data
		
//		now Process the final list , we just cut big stream into multiple stream
		List<Integer> results = finalList.stream().flatMap(n -> n.stream().map(k -> k + 5)).collect(Collectors.toList()); //so basically 3 streams are created
		
		System.out.println(results);
		

	}

}

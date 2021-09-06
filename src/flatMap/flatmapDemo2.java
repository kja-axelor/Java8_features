package flatMap;

import java.util.List;
import java.util.stream.Collectors;
import java.util.Arrays;
public class flatmapDemo2 {

	public static void main(String[] args) {
		List<String> teamA = Arrays.asList("Krjani","JbLadva","hkjani");
		List<String> teamB = Arrays.asList("Jigar","Chirag","Rohan");
		List<String> teamC = Arrays.asList("Richa","Nishant","Maulik");
		
//		add this collection to some big collection
		List<List<String>> team11 =  Arrays.asList(teamA,teamB,teamC);
		
		System.out.println(team11);
		
/* 	print names of every team using Enhance for loop (before java8)
		
		for (List<String> name11: team11) {
			for (String name: name11) {
				System.out.println(name);
			}
		}
		*/
		
// using flatmap (Stream concept)
		
		List<String> names = team11.stream().flatMap(n -> n.stream()).collect(Collectors.toList());
		System.out.println(names);
		

	}

}

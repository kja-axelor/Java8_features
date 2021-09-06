package streamMethods;

import java.util.Arrays;
import java.util.List;

public class methodDemo4 {

	public static void main(String[] args) {
		List<String> myList = Arrays.asList("A","B","C","1","2","3");
		Object arr [] = myList.stream().toArray();
		System.out.println(arr.length);
		
//		forEach loop to print all the array value
		for(Object data : arr) {
			System.out.println(data);
		}
	}

}

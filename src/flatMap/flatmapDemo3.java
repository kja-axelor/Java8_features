package flatMap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
class Student{
	String name;
	int id;
	char grade;
	
//	constructor
	Student(String name, int id, char grade){
		this.name = name;
		this.id = id;
		this.grade = grade;
	}
}
public class flatmapDemo3 {

	public static void main(String[] args) {
		List<Student> studentList1 = Arrays.asList(
				new Student("krjani",101,'A'),
				new Student("jbladva",102,'B'),
				new Student("hkjani",103,'C')
				);
		
		List<Student> studentList2 = Arrays.asList(
				new Student("phirpara",201,'A'),
				new Student("jsavaliya",202,'B'),
				new Student("hkmoradiya",203,'C')
				);
		
//		now if we want to create big collections
		List<List<Student>> bigCollect = Arrays.asList(studentList1,studentList2);
		
//		retrive only names from bigCollect collections
		
//		before java8
		
//		for (List<Student> data: bigCollect) {
//			for (Student lst : data ) {
//				System.out.println(lst.name);
//			}
//		}
		
//		using stream
//		using flatmap we cut them into small  stream
//		and using map we will get only names from them
		
		List<String> result = bigCollect.stream()
				.flatMap(n -> n.stream())
				.map(n -> n.name)
				.collect(Collectors.toList());
		System.out.println(result);
	}
}

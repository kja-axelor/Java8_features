package parallelStreams;

import java.util.Arrays;
import java.util.List;

class Student{
	int score;
	String name;
	
//	constructor
	
	Student(int score, String name){
		this.name = name;
		this.score = score;
	}
// display
	public String getName() {
		return this.name;
	}
	public int getScore() {
		return this.score;
	}
}

public class parallelstreamDemo {
	public static void main(String args [] ) {
		
		List<Student> studentLst = Arrays.asList(
				new Student(86,"krjani"),
				new Student(46,"rohan"),
				new Student(46,"meet"),
				new Student(96,"hiren"),
				new Student(92,"hardeep"),
				new Student(76,"jagruti"),
				new Student(89,"Disha") 
				);
		
//		using stream (sequential operations)
//		
//		studentLst.stream()
//		.filter(n -> n.score > 80)
//		.limit(3).
//		forEach(n -> System.out.println(n.getName() + " " + n.getScore()));
//		
//		using parallel stream (parallel operations)
//		so parallel stream is a concept which internally create many parallel streams to do execution faster
		
		studentLst.parallelStream()
		.filter(n -> n.score > 80)
		.limit(3)
		.forEach(n -> System.out.println(n.getName()+ " " +n.getScore()));
		
//		how to make normal stream to parallel stream
//		parallel() method --> accessed through Stream class
		
		studentLst.stream()
		.parallel()
		.filter(n -> n.score > 80)
		.limit(3).
		forEach(n -> System.out.println(n.getName() + " " + n.getScore()));
		
		
	}
									
}

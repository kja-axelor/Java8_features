import java.util.ArrayDeque;
public class LearnArrayDeque {
public static void main(String args[]) {
	ArrayDeque<Integer> adq = new ArrayDeque<>();
	adq.offer(15);
	adq.offer(16);
	adq.offer(56);
	System.out.println(adq);
}

}

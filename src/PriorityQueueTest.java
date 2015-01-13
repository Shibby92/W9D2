/**
 * Testna klasa klasu prioritetni red
 * 
 * @author harisarifovic
 *
 */
public class PriorityQueueTest {

	public static void main(String[] args) {
		PriorityQueue test = new PriorityQueue();
		test.push(1, 10);
		System.out.println(test.toString());
		test.push(2, 9);
		System.out.println(test.toString());
		test.push(3, 8);
		System.out.println(test.toString());
		test.push(4, 7);
		test.push(5, 7);
		test.push(7, 7);
		test.push(6, 7);
		test.push(99, 11);
		System.out.println(test.toString());
		test.pop();
		System.out.println(test.toString());

	}

}

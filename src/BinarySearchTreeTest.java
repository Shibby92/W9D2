/**
 * Testiranje Binary search tree klase
 * @author harisarifovic
 *
 */
public class BinarySearchTreeTest {

	public static void main(String[] args) {
		BinarySearchTree test= new BinarySearchTree();
		test.add(5);
		test.add(3);
		test.add(7);
		test.add(3);
		test.add(6);
		test.add(4);
		test.printTree(test.getRoot());
		System.out.println(test.contains(77, test.getRoot()));

	}

}

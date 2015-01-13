/**
 * Kreiranje Binary search tree-a
 * 
 * @author harisarifovic
 *
 */
public class BinarySearchTree {
	private Node root;

	public BinarySearchTree() {
		this.root = null;
	}

	/**
	 * Dodaje novi broj u stablo
	 * 
	 * @param value
	 *            Vrijednost koja se dodaje
	 */
	public void add(int value) {
		// Ukoliko je prazno stablo
		if (root == null) {
			root = new Node(value);
		} else {
			// Poziva funkciju ispod
			add(root, value);
		}
	}

	/**
	 * Dodavanje vrijednosti u stablo
	 * 
	 * @param current
	 *            Trenutni node
	 * @param value
	 *            Vrijednost koja se dodaje
	 */
	public void add(Node current, int value) {
		if (current == null) {
			current = new Node(value);
			return;
		}
		if (value <= current.value) {
			if (current.left == null) {
				current.left = new Node(value);
				return;
			}
			add(current.left, value);
		} else {
			if (current.right == null) {
				current.right = new Node(value);
				return;
			}
			add(current.right, value);

		}
	}

	public Node getRoot() {
		return root;
	}

	/**
	 * Ispisuje vrijednosti stabla
	 * 
	 * @param toPrint
	 *            Node koji se poziva
	 */
	public void printTree(Node toPrint) {
		if (toPrint == null) {
			return;
		}
		printTree(toPrint.left);
		System.out.println(toPrint.value);
		printTree(toPrint.right);
	}

	/**
	 * Ispituje da li se neka vrijednost nalazi u stablu
	 * 
	 * @param value
	 *            Vrijednost koja se trazi
	 * @param find
	 *            Node koji se proslijedjuje
	 * @return True/false ovisno od ishoda
	 */
	public boolean contains(int value, Node find) {
		if (find == null) {
			return false;
		}
		if (find.value == value) {
			return true;
		} else if (value < find.value) {
			return contains(value, find.left);
		} else {
			return contains(value, find.right);
		}
	}

	/**
	 * Klasa Node
	 * 
	 * @author harisarifovic
	 *
	 */
	private class Node {
		public int value;
		public Node left;
		public Node right;

		public Node(int value) {
			this.value = value;
			this.left = null;
			this.right = null;
		}
	}
}

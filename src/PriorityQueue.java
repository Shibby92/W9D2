/**
 * Klasa prioritetni red
 * 
 * @author harisarifovic
 *
 */
public class PriorityQueue {
	Node head;
	Node tail;

	public PriorityQueue() {
		this.head = null;
		this.tail = null;
	}

	/**
	 * Ubacivanje nove vrijednosti u red
	 * 
	 * @param value
	 *            Vrijednost koja se dodaje
	 * @param priority
	 *            Prioritet vrijednosti
	 */
	public void push(int value, int priority) {
		Node newNode = new Node(value, priority);
		if (head == null) {
			head = newNode;
			tail = newNode;
			return;
		}
		Node sort = head;
		if (newNode.priority > head.priority) {
			newNode.next = head;
			head = newNode;
			return;
		}
		while (sort.priority >= newNode.priority && sort != tail) {
			sort = sort.next;
		}
		newNode.next = sort.next;
		sort.next = newNode;
		if (tail.next == newNode) {
			tail = newNode;
		}
	}

	/**
	 * Izbacivanje elementa iz reda
	 * 
	 * @return Izbaceni element
	 */
	public int pop() {
		if (head == null) {
			throw new IndexOutOfBoundsException("Red je prazan!");
		}
		int value;
		if (head == tail) {
			value = head.value;
			Node tmp = head;
			head = head.next;
			tmp.next = null;
			tail = null;
			return value;
		}
		value = head.value;
		Node tmp = head;
		head = head.next;
		tmp.next = null;
		return value;
	}

	/**
	 * Vraca vrijednost vrha reda
	 * 
	 * @return Vrijednost vrha reda
	 */
	public int peek() {
		if (head == null) {
			throw new IndexOutOfBoundsException("Red je prazan!");
		}
		return head.value;

	}

	/**
	 * Vraca velicinu prioritetnog reda
	 * 
	 * @return
	 */
	public int getSize() {
		if (head == null) {
			return 0;
		}
		int counter = 1;
		Node slide = head;
		while (slide.next != null) {
			slide = slide.next;
			counter++;
		}
		return counter;
	}

	/**
	 * Provjerava da li proslijedjeni broj postoji u prioritetnom redu
	 * 
	 * @param value
	 *            Vrijednost koja se trazi
	 * @return True/false u ovisnosti od ishoda
	 */
	public boolean contains(int value) {
		if (head == null) {
			throw new IndexOutOfBoundsException("Stack je prazan!");
		}
		Node find = head;
		while (find != null) {
			if (find.value == value) {
				return true;
			}
			find = find.next;
		}
		return false;
	}

	/**
	 * Ispisuje sve elemente prioritetnog reda
	 */
	public String toString() {
		StringBuilder sb = new StringBuilder();
		Node print = head;
		while (print != null) {
			sb.append(print.value);
			sb.append(" ");
			print = print.next;
		}
		return sb.toString();
	}

	/**
	 * Klasa Node
	 * 
	 * @author harisarifovic
	 *
	 */
	public class Node {
		public int value;
		public Node next;
		public int priority;

		public Node() {
			this.value = 0;
			this.next = null;
			this.priority = 0;
		}

		public Node(int value, int priority) {
			this.value = value;
			this.next = null;
			this.priority = priority;
		}
	}
}
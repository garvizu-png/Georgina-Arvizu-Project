public class IntLinkedList implements IntList {
	
	class Node {
		int data;
		Node next;
		
		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	Node head;
	Node tail;
	int size;

	/**
	 * Construct an IntLinkedList.
	 */
	public IntLinkedList() {
		this.head = null;
		this.tail = null;
		this.size = 0;
	}

	/**
	 * Return the number of elements in the IntLinkedList.
	 *
	 * @return The number of elements in the IntLinkedList.
	 */
	public int size() {
		return 0; // FIXME
	}

	/**
	 * Add an element to the end of the IntLinkedList.
	 *
	 * @param element The element to add.
	 */
	public void add(int element) {
		// FIXME
	}

	/**
	 * Get the element at the specified index.
	 *
	 * This function assumes that the index argument is within range of the IntLinkedList.
	 *
	 * @param index The index to get.
	 * @return The element at the specified index.
	 */
	public int get(int index) {
		return 0; // FIXME
	}

	/**
	 * Remove the element at the specified index.
	 *
	 * This function assumes that the index argument is within range of the IntLinkedList.
	 *
	 * @param index The index to remove.
	 */
	public void remove(int index) {
		// FIXME
	}

	/**
	 * Create a String representation of the IntLinkedList.
	 *
	 * @return A String representation of the IntLinkedList.
	 */
	public String toString() {
		String result = "{";
		if (this.size() > 0) {
			result += this.get(0);
		}
		for (int i = 1; i < this.size; i++) {
			result += ", " + this.get(i);
		}
		result += "}";
		return result;
	}

	/**
	 * Put the IntLinkedList through some simple tests.
	 *
	 * @param args Ignored command line arguments.
	 */
	public static void main(String[] args) {
		IntLinkedList list = new IntLinkedList();
		// FIXME draw memory at this point for CQ1

		// FIXME uncomment the following lines for EQ3
		// list.add(53);
		// list.add(71);
		// list.add(23);
		// list.add(89);
	}

}

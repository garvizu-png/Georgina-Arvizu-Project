public class IntArrayList implements IntList {

	// FIXME add member variables

	/**
	 * Construct an IntArrayList with a given initial length.
	 *
	 * @param initialLength The initial length of the array.
	 */
	public IntArrayList(int initialLength) {
		// FIXME
	}

	/**
	 * Return the number of elements in the IntArrayList.
	 *
	 * @return The number of elements in the IntArrayList.
	 */
	public int size() {
		return 0; // FIXME
	}


	/**
	 * Add an element to the end of the IntArrayList.
	 *
	 * @param element The element to add.
	 */
	public void add(int element) {
		// FIXME
	}

	/**
	 * Get the element at the specified index.
	 *
	 * This function assumes that the index argument is within range of the IntArrayList.
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
	 * This function assumes that the index argument is within range of the IntArrayList.
	 *
	 * @param index The index to remove.
	 */
	public void remove(int index) {
		// FIXME
	}

	/**
	 * Double the size of the internal array.
	 */
	private void resize() {
		//FIXME
	}

	/**
	 * Create a String representation of the IntArrayList.
	 *
	 * @return A String representation of the IntArrayList.
	 */
	public String toString() {
		String result = "{";
		if (this.size() > 0) {
			result += this.get(0);
		}
		for (int i = 1; i < this.size(); i++) {
			result += ", " + this.get(i);
		}
		result += "}";
		return result;
	}

	/**
	 * Put the IntArrayList through some simple tests.
	 *
	 * @param args Ignored command line arguments.
	 */
	public static void main(String[] args) {
		IntArrayList list = new IntArrayList(3);

		// these lines should work after CQ4
		list.add(53);
		list.add(71);
		list.add(23);

		// this line should work after only after CQ7
		// list.add(89);
	}

}

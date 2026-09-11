public class ListNode {

    private int value = 0;
    private ListNode next = null;

    /**
     * Construct a ListNode.
     *
     * @param value The first element.
     * @param rest The rest of the list.
     */
    public ListNode(int value, ListNode next) {
        this.value = value;
        this.next = next;
    }

    /**
     * Get the first element of the list.
     *
     * @return The first element of the list.
     */
    public int getFirst() {
        return this.value;
    }

    /**
     * Get the rest of the list.
     *
     * @return The rest of the list.
     */
    public ListNode getRest() {
        return this.next;
    }

}

public class RecursiveList {

    private class Node {
        int data;
        Node next;

        public Node(int data) {
            // call the other constructor
            this(data, null);
        }

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }

    }

    private Node head = null;

    public RecursiveList() {
        this.head = null;
    }

    public void buildFromArray(int[] numbers) {
        this.head = null;
        for (int i = numbers.length - 1; i >= 0; i--) {
            this.head = new Node(numbers[i], this.head);
        }
    }

    public int loopSum() {
        Node currNode = this.head;
        int total = 0;
        while (currNode != null) {
            total += currNode.data;
            currNode = currNode.next;
        }
        return total;
    }

    public int recurSum() {
        return 0; // FIXME for for EQ2
    }

    public int recurSum(Node currNode, int total) {
        return 0; // FIXME for EQ2
    }

    public String loopToString() {
        String result = ""
        Node currNode = this.head;
        while (currNode != null) {
            result += currNode.data + ", ";
            currNode = currNode.next;
        }
        return result;
    }

    public String recurToString() {
        // FIXME for EQ3
    }

    public String recurToString(Node currNode) {
        // FIXME for EQ3
    }

    public static void main(String[] args) {
        RecursiveList list = new RecursiveList();
        int[] numbers = {4, 8, 15, 16, 23, 42};
        list.buildFromArray(numbers);

        // for EQ2
        System.out.println("sum:");
        System.out.println(list.loopSum());
        System.out.println(list.recurSum());
        System.out.println();

        // for EQ3
        System.out.println("print:");
        list.loopPrint();
        System.out.println();
        list.recurPrint();
    }

}

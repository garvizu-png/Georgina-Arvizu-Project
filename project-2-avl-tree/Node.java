public class Node {
    public String value;
    public Node left;
    public Node right;
    public int height;
    public int balance;

    public Node(String value) {
        this.value = value;
        this.left = null;
        this.right = null;
        this.height = 0;
        this.balance = 0;
    }
}

import java.lang.Math;

public class IntBinaryTree {

    private Node root;
    private int size;

    /**
     * Construct a binary tree of non-negative integers from an array.
     *
     * The array lists the value in "depth-first" order, with negative values
     * meaning there is no node there. So this tree:
     *
     *        54
     *       /  \
     *      /    \
     *     15    62
     *    /     /  \
     *   7     60  67
     *  /
     * 5 
     *
     * would be represented by the array:
     *
     * {54, 15, 62, 7, -1, 60, 67, 5}
     *
     * It is an error for a non-negative integer to have a parent that is
     * negative, so the follow array would cause a runtime error:
     * 
     * {-1, 3, 5}
     *
     * @param values The values of the tree.
     */
    public IntBinaryTree(int[] values) {
        this.checkArray(values);
        this.size = 0;
        this.root = this.fromArray(values, 0);
    }

    /**
     * Check that the input array is valid, ie. does not have "dangling"
     * subtrees.
     *
     * @param values The values of the tree.
     */
    private void checkArray(int[] values) {
        // check that the values are valid (ie. that the tree is connected)
        for (int childIndex = values.length - 1; childIndex > 0; childIndex--) {
            int parentIndex = (childIndex - 1) / 2;
            if (values[childIndex] >= 0 && values[parentIndex] < 0) {
                throw new IllegalArgumentException("Values array specifies node with null parent");
            }
        }
    }

    /**
     * Construct the tree from the array.
     *
     * Students do not have to fully understand this, but the array works in
     * the same was as it does in a binary heap. This means that index 0 is the
     * root, and for any index i, its two children will be at index 2i+1 and
     * 2i+2, with its parent at (i-1)/2.
     *
     * @param values The array of values of the tree.
     * @param index The current index to look at.
     * @return The node representing the current index in the array.
     */
    private Node fromArray(int[] values, int index) {
        // The array does not have to specific trailing non-nodes, so if we go
        // past the end of the array, we know the subtree is empty.
        if (index >= values.length) {
            return null;
        }
        // Since the tree only contains non-negative values, negative values
        // indicate an empty subtree
        if (values[index] < 0) {
            return null;
        }
        // create the node for the current index
        Node node = new Node(values[index]);
        this.size++;
        // create the left subtree and assign it to node.left
        node.left = this.fromArray(values, 2 * index + 1);
        // create the right subtree and assign it to node.right
        node.right = this.fromArray(values, 2 * index + 2);
        // return the current node/subtree
        return node;
    }

    /**
     * Return the size of the tree.
     *
     * Note that this is the number of elements in the tree, which is smaller
     * than the length of the input array (since some array elements could be
     * negative).
     *
     * @return The size of the tree.
     */
    public int size() {
        return this.size;
    }

    /**
     * Return the root of the tree.
     *
     * @return The root node of the tree.
     */
    public Node getRoot() {
        return this.root;
    }

    /**
     * Convert the tree to an array.
     *
     * Note that this array may not be the exact same as the array used to
     * create the tree. For example, both of the follow arrays lead to the same
     * tree:
     *
     * {2, 1, 3}
     * {2, 1, 3, -1, -1, -1, -1}
     *
     * This method will always return an array as though the deepest layer is
     * filled (ie. that the tree is perfect).
     *
     * @return The array representation of the tree.
     */
    public int[] toArray() {
        int depth = this.getDepth(this.root);
        int length = ((int) Math.pow(2, depth)) - 1;
        int[] result = new int[length];
        for (int i = 0; i < length; i++) {
            result[i] = -1;
        }
        this.toArray(this.root, result, 0);
        return result;
    }

    /**
     * Calculate the depth of the tree.
     *
     * We need this to turn a tree back into an array.
     *
     * @param node The current node.
     * @return The depth of this node.
     */
    private int getDepth(Node node) {
        if (node == null) {
            return 0;
        }
        int leftDepth = this.getDepth(node.left);
        int rightDepth = this.getDepth(node.right);
        if (leftDepth > rightDepth) {
            return 1 + leftDepth;
        } else {
            return 1 + rightDepth;
        }
    }

    /**
     * The recursive toArray helper method.
     *
     * @param node The current node.
     * @param result The array to output to
     * @param index The index to save the current node.
     */
    private void toArray(Node node, int[] result, int index) {
        if (node == null) {
            return;
        }
        result[index] = node.value;
        this.toArray(node.left, result, 2 * index + 1);
        this.toArray(node.right, result, 2 * index + 2);
    }

    /**
     * Visualize the tree.
     *
     * This prints out a visualization of the tree "sideways", so the following
     * tree:
     *
     *        54
     *       /  \
     *      /    \
     *     15    62
     *    /     /  \
     *   7     60  67
     *  /
     * 5 
     *
     * will be printed as
     *
     *     67
     *   62
     *     60
     * 54
     *     null
     *   15
     *       null
     *     7
     *       5
     */
    public void visualize() {
        this.visualize(this.root, 0);
    }

    /**
     * Create a String of spaces twice the input length.
     *
     * @param depth The depth of the indentation
     * @return The blankspace indent String.
     */
    private String createIndent(int depth)  {
        String result = "";
        for (int i = 0; i < depth; i++) {
            result += "  ";
        }
        return result;
    }

    /**
     * The recursive visualization helper method.
     *
     * @param node The current node.
     * @param depth The depth of the current node.
     */
    private void visualize(Node node, int depth) {
        String indent = this.createIndent(depth);
        if (node == null) {
            System.out.println(indent + "null");
        } else if (node.left == null && node.right == null) {
            System.out.println(indent + String.valueOf(node.value));
        } else {
            this.visualize(node.right, depth + 1);
            System.out.println(indent + String.valueOf(node.value));
            this.visualize(node.left, depth + 1);
        }
    }

    public static void main(String[] args) {
        int[] values = {54, 15, 62, 7, -1, 62, 67};
        IntBinaryTree tree = new IntBinaryTree(values);

        int[] array = tree.toArray();
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println();
        tree.visualize();
    }

}

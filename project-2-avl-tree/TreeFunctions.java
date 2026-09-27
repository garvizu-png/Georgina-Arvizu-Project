import java.util.Arrays;
import java.lang.AssertionError;

public class TreeFunctions {

    private static void printIndented(int depth, String string) {
        System.out.println("  ".repeat(depth) + string);
    }

    private static String quote(String string) {
        return "\"" + string.replaceAll("\"", "\\\"") + "\"";
    }

    public static String[] toSortedArray(StringAVLTreeSet tree) {
        String[] result = new String[tree.size()];
        toSortedArray(tree.root, result, 0);
        return result;
    }

    private static int toSortedArray(Node node, String[] result, int index) {
        if (node == null) {
            return index;
        }
        index = toSortedArray(node.left, result, index);
        result[index] = node.value;
        return toSortedArray(node.right, result, index + 1);
    }

    public static void prettyPrint(StringAVLTreeSet tree) {
        prettyPrint(tree.root, 0);
    }
    
    private static void prettyPrint(Node node, int depth) {
        if (node == null) {
            printIndented(depth, "null");
            return;
        }
        prettyPrint(node.right, depth + 1);
        printIndented(depth, quote(node.value));
        prettyPrint(node.left, depth + 1);
    }

    public static String toStructureString(StringAVLTreeSet tree) {
        return toStructureString(tree.root);
    }

    private static String toStructureString(Node node) {
        if (node == null) {
            return "()";
        } else {
            return "(" + quote(node.value) + " " + toStructureString(node.left) + " " + toStructureString(node.right) + ")";
        }
    }

    public static void assertEquals(boolean actual, boolean expected) {
        if (actual != expected) {
            throw new AssertionError("Expected " + expected + " but got " + actual);
        }
    }

    public static void assertEquals(int actual, int expected) {
        if (actual != expected) {
            throw new AssertionError("Expected " + expected + " but got " + actual);
        }
    }

    public static void assertEquals(String actual, String expected) {
        if (!actual.equals(expected)) {
            throw new AssertionError("Expected " + expected + " but got " + actual);
        }
    }

    public static void assertEquals(String[] actual, String[] expected) {
        if (!Arrays.equals(actual, expected)) {
            throw new AssertionError("Expected " + Arrays.toString(expected) + " but got " + Arrays.toString(actual));
        }
    }

    public static void treeAddTest(StringAVLTreeSet tree, String[] values) {
        int prevSize = tree.size();
        int duplicates = 0;
        for (String value : values) {
            if (tree.contains(value)) {
                duplicates++;
            }
            tree.add(value);
        }
        TreeFunctions.assertEquals(tree.size(), prevSize + values.length - duplicates);
        for (String value : values) {
            TreeFunctions.assertEquals(tree.contains(value), true);
        }
    }

    public static void treeAddTest(StringAVLTreeSet tree, String[] values, String structureString) {
        TreeFunctions.treeAddTest(tree, values);
        TreeFunctions.assertEquals(TreeFunctions.toStructureString(tree), structureString);
    }

}

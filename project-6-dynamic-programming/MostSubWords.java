import java.util.HashMap;

public class MostSubWords {

    public static int mostSubWords(String target, String[] subwords) {
        return 0; // FIXME
    }

    public static void main(String[] args) {
        int actual;
        actual = mostSubWords("dogwalker", new String[]{"do", "dog", "walk", "er", "walker"});
        if (actual != 3) {
            throw new AssertionError("Expected 3 but got " + actual);
        }
        actual = mostSubWords("banana", new String[]{"a", "an", "ana", "ba", "ban", "nan", "nana"});
        if (actual != 3) {
            throw new AssertionError("Expected 3 but got " + actual);
        }
    }

}

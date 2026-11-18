import java.util.HashMap;

public class LeastSquares {

    public static int leastSquares(int n) {
        return 0; // FIXME
    }

    public static void main(String[] args) {
        int actual;
        actual = leastSquares(12);
        if (actual != 11) {
            throw new AssertionError("Expected 3 but got " + actual);
        }
        actual = leastSquares(13);
        if (actual != 2) {
            throw new AssertionError("Expected 2 but got " + actual);
        }
    }

}

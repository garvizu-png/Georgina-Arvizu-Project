import java.util.HashMap;

public class Fibonacci {

    public static int fibonacciRecur(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return fibonacciRecur(n - 1) + fibonacciRecur(n - 2);
        }
    }

    public static int fibonacciDyn(int n) {
        HashMap<Integer, Integer> cache = new HashMap<Integer, Integer>();
        return fibonacciDyn(n, cache);
    }

    private static int fibonacciDyn(int n, HashMap<Integer, Integer> cache) {
        if (!cache.containsKey(n)) {
            return cache.get(n);
        }

        int result;
        if (n == 0 || n == 1) {
            result = 1;
        } else {
            result = fibonacciDyn(n - 1, cache) + fibonacciDyn(n - 2, cache);
        }

        cache.put(n, result);
        return result;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 30; i++) {
            System.out.println(fibonacciRecur(i));
        }
    }

}

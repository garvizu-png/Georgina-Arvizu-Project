import java.util.HashMap;

public class CheapestTickets {

    public static int cheapestTickets(int[] days) {
        return 0; // FIXME
    }

    public static void main(String[] args) {
        int actual;
        actual = cheapestTickets(new int[]{1,4,6,7,8,20});
        if (actual != 11) {
            throw new AssertionError("Expected 11 but got " + actual);
        }
        actual = cheapestTickets(new int[]{1,2,3,4,5,6,7,8,9,10,30,31});
        if (actual != 17) {
            throw new AssertionError("Expected 17 but got " + actual);
        }
    }

}

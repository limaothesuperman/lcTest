import java.util.HashSet;
import java.util.Set;

public class HappyNumber_202 {
    public static void testCase() {
        int n = 100;
        System.out.println(isHappy(n));
    }

    public static boolean isHappy(int n) {

        Set<Integer> record = new HashSet<>();
        while (n != 1 && !record.contains(n)) {
            record.add(n);
            n = getNextNum(n);
        }
        return n == 1;
    }

    private static int getNextNum(int n) {
        int sum = 0;
        while (n > 0) {
            sum = sum + (n % 10) * (n % 10);
            n = n / 10;
        }
        return sum;
    }
}

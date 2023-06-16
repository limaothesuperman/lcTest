import java.util.HashMap;
import java.util.Map;

public class NumberOfGoodPairs_1512 {

    public static void main(String[] args) {
        int[] nums1 = {1, 1, 1, 1, 1, 1};

        int[] nums2 = {1, 2, 3, 1, 1, 3};

        System.out.println(numIdenticalPairs(nums1));
        System.out.println(numIdenticalPairs(nums2));
    }

    public static int numIdenticalPairs(int[] nums) {
        int res = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            res += map.getOrDefault(num, 0);
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        return res;
    }
}

import java.util.HashMap;

public class TwoSum_1 {
    public static void testCase() {
        int[] nums = {1, 2, 3};
        int[] res = twoSum(nums, 5);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        if (nums == null || nums.length == 0)
            return result;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int temp = target - nums[i];
            if (map.containsKey(temp)) {
                result[1] = i;
                result[0] = map.get(temp);
            }
            map.put(nums[i], i);

        }
        return result;

    }
}

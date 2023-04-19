import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicateII_219 {
    public static void main(String[] args) {
        System.out.println(
                new ContainsDuplicateII_219().containsNearbyDuplicate(
                        new int[]{1, 2, 3, 1}, 4));
    }

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int temp = nums[i];
            if (map.containsKey(temp)) {
                if (Math.abs(i - map.get(nums[i])) <= k)
                    return true;
            }
            map.put(nums[i], i);
        }
        return false;
    }
}

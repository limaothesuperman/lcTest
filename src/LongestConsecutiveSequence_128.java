import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence_128 {
    public static void main(String[] args) {
        System.out.println(longestConsecutive(new int[]{1, 2, 3, 4, 5, 100, 200, 300}));
    }

    public static int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }

        int longest = 0;
        for (int i = 0; i < nums.length; i++) {
            if (!set.contains(nums[i] - 1)) {
                int length = 1;
                int temp = nums[i] + 1;
                while (set.contains(temp)) {
                    length++;
                    temp++;
                }
                longest = Math.max(length, longest);
            }
        }
        return longest;

    }
}

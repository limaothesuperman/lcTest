import java.util.Arrays;

public class MinimumDifferenceBetweenHighestandLowestofKScores_1894 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        System.out.println(minimumDifference(nums, k));
    }

    public static int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int left = 0;
        int right = k - 1;
        int result = Integer.MAX_VALUE;

        while (right < nums.length) {
            result = Math.min(result, nums[right] - nums[left]);
            left++;
            right++;
        }

        return result;

    }
}

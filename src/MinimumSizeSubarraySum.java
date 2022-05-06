public class MinimumSizeSubarraySum {
    public int minSubArrayLen(int target, int[] nums) {
        int result = Integer.MAX_VALUE;
        int sum = 0;
        int start = 0;
        int subLength = 0;
        for (int j = 0; j < nums.length; j++) {
            sum = sum + nums[j];
            while (sum >= target) {
                subLength = (j - start + 1);
                if (result < subLength)
                    result = result;
                else
                    result = subLength;
                sum = sum - nums[start++];

            }
        }
        if (result != Integer.MAX_VALUE)
            return result;
        return 0;
    }
}

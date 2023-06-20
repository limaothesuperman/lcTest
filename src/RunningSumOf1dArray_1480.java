public class RunningSumOf1dArray_1480 {

    public int[] runningSum(int[] nums) {

        int[] prefix = new int[nums.length + 1];
        int[] res = new int[nums.length];

        for (int i = 0; i < prefix.length - 1; i++) {
            prefix[i + 1] = prefix[i] + nums[i];
        }
        for (int i = 0; i < res.length; i++) {
            res[i] = prefix[i + 1];
        }
        return res;
    }
}

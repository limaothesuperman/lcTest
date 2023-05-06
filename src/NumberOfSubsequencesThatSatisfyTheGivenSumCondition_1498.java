import java.util.Arrays;

public class NumberOfSubsequencesThatSatisfyTheGivenSumCondition_1498 {

//    Input: nums = [3,3,6,8], target = 10
//    Output: 6
//    Explanation: There are 6 subsequences that satisfy the condition. (nums can have repeated numbers).
//    [3] , [3] , [3,3], [3,6] , [3,6] , [3,3,6]

    public static void main(String[] args) {
        int[] nums = new int[]{3, 3, 6, 8};
        int target = 10;
        int res = new NumberOfSubsequencesThatSatisfyTheGivenSumCondition_1498().numSubseq(nums, target);
        System.out.println(res);

    }

    public int numSubseq(int[] nums, int target) {
        Arrays.sort(nums);

        int res = 0;
        int modulo = (int) (Math.pow(10, 9) + 7);
        int right = nums.length - 1;

        for (int i = 0; i < nums.length; i++) {
            int left = nums[i];
            while (right >= 0 && left + nums[right] > target && i <= right) {
                --right;
            }
            if (i <= right) {
                res += (int) (quickPow(right - i));
                res = res % modulo;
            }
        }
        return res;

    }

    private long quickPow(int n) {
        int MOD = 1_000_000_007;

        if (n == 0) {
            return 1;
        }
        long t = 2;
        long res = 1;

        while (n > 0) {
            if ((n & 1) == 1) {
                res = (res * t) % MOD;
            }

            t = (t * t) % MOD;
            n >>= 1;
        }

        return res % MOD;
    }
}

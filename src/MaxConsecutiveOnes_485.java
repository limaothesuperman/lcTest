public class MaxConsecutiveOnes_485 {

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1};
        System.out.println(findMaxConsecutiveOnes(nums));

    }


    public static int findMaxConsecutiveOnes(int[] nums) {
        int res = 0;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count++;
                res = Math.max(res, count);
            } else {
                count = 0;
            }
        }
        return res;

    }
}

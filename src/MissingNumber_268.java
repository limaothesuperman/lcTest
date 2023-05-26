public class MissingNumber_268 {
    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4,6};

        System.out.println(missingNumber(nums));
    }
    public static int missingNumber(int[] nums) {
        int addition = 0;
        for (int i = 0; i <= nums.length; i++) {
            addition = addition + i;
        }
        int numsSum = 0;
        for (int num : nums) {
            numsSum += num;
        }

        return addition - numsSum;

    }
}

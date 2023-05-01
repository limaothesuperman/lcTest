import java.util.Arrays;

public class ConcatenationOfArray_1929 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int[] res = new ConcatenationOfArray_1929().getConcatenation(nums);

        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(res));

    }
    public int[] getConcatenation(int[] nums) {
        int[] res = new int[nums.length * 2];
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            res[i] = nums[i];
            res[i + n] = nums[i];
        }
        return res;

    }
}

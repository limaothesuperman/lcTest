import java.util.Arrays;

public class KRadiusSubarrayAverages_2090 {

    public static void main(String[] args) {
        int[] nums = {7,4,3,9,1,8,5,2,6};
        int k = 3;
        System.out.println(Arrays.toString(getAverages(nums, k)));

    }


    public static int[] getAverages(int[] nums, int k) {
        int[] res = new int[nums.length];
        int length = 2 * k + 1;
        Arrays.fill(res, -1);
        if (nums.length < k) {
            return res;
        }
        else {
            long[] prefix = new long[nums.length + 1];
            for (int i = 0; i < nums.length; i++) {
                prefix[i + 1] = prefix[i] + nums[i];
            }

            for (int i = k; i + k < nums.length; i++) {
                res[i] = (int) ((prefix[i + k + 1] - prefix[i - k]) / length);
            }
        }
        return res;
    }

//    public int[] getAverages(int[] nums, int k) {
//        int[] res = new int[nums.length];
//        if (nums.length < k) {
//            Arrays.fill(res, -1);
//        }
//        else {
//            for (int i = 0; i < k; i++) {
//                res[i] = -1;
//            }
//            for (int i = res.length - 1; i > res.length - 1 - k; i--) {
//                res[i] = -1;
//            }
//            int left = k;
//            int right = res.length - k;
//
//            while (left < right) {
//                long sum = 0;
//                for (int i = left - k; i < left - k + k * 2 + 1; i++) {
//                    sum += nums[i];
//                }
//                res[left] = (int) sum / (k * 2 + 1);
//                left++;
//            }
//        }
//        return res;
//    }
}



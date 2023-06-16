import java.util.Arrays;

public class SortArrayByParity_905 {

//    Given an integer array nums, move all the even integers
//    at the beginning of the array followed by all the odd integers.
//
//    Return any array that satisfies this condition.
//    Input: nums = [3,1,2,4]
//    Output: [2,4,3,1]

    public static void main(String[] args) {
        int[] nums = {3, 1, 2, 4};
        System.out.println(Arrays.toString(new SortArrayByParity_905().sortArrayByParity(nums)));
    }

    public int[] sortArrayByParity(int[] nums) {
        int[] res = new int[nums.length];
        int left = 0;
        int right = nums.length - 1;

        for (int num : nums) {
            if (num % 2 == 0) {
                res[left] = num;
                left++;
            } else {
                res[right] = num;
                right--;
            }
        }
        return res;
    }
}

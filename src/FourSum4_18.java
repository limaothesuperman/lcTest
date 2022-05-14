import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum4_18 {
    public static void testCase() {
        int[] temp = {-1, 0, 1, 2, -1, -4, 5, 6, -11};
        System.out.println(fourSum(temp,0));
    }
    public static List<List<Integer>> fourSum(int[] nums, int target) {

        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);

        for (int j = 0; j < nums.length; j++) {
            if (j > 0 && nums[j] == nums[j - 1])
                continue;

            for (int i = j + 1; i < nums.length; i++) {

                if (i > j + 1 && nums[i] == nums[i - 1])
                    continue;

                int left = i + 1;
                int right = nums.length - 1;

                while (right > left) {
                    if (nums[j] + nums[i] > target - nums[left] - nums[right])
                        right--;
                    else if (nums[j] + nums[i] < target - nums[left] - nums[right])
                        left++;
                    else {
                        res.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                        while (right > left && nums[right] == nums[right - 1]) right--;
                        while (right > left && nums[left] == nums[left + 1]) left++;
                        right--;
                        left++;
                    }
                }
            }
        }


        return res;
    }

}

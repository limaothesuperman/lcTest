import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SortAnArray_912 {
    public static void main(String[] args) {
        int[] nums = {2, 3, 4, 1, 21, 12, 3, 11, 8, 9};
        System.out.println(Arrays.toString(new SortAnArray_912().sortArray(nums)));
    }

    public int[] sortArray(int[] nums) {
        //counting sort
        int minVal = nums[0], maxVal = nums[0];
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            minVal = Math.min(minVal, nums[i]);
            maxVal = Math.max(maxVal, nums[i]);
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }
        int index = 0;
        for (int i = minVal; i <= maxVal; i++) {
            while (map.getOrDefault(i, 0) > 0) {
                nums[index] = i;
                index++;
                map.put(i, map.get(i) - 1);
            }
        }
        return nums;

    }
}

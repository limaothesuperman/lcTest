import java.util.ArrayList;
import java.util.List;

public class SummaryRanges_228 {

    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 3, 5, 6, 7, 9, 11, 13};
        System.out.println(summaryRanges(nums));

    }

    public static List<String> summaryRanges(int[] nums) {
        List<String> res = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int start = nums[i];
            while (i + 1 < nums.length && nums[i] + 1 == nums[i + 1]) {
                i++;
            }
            if (start != nums[i]) {
                res.add(start + "->" + nums[i]);
            } else {
                res.add(String.valueOf(start));
            }
        }
        return res;

    }
}

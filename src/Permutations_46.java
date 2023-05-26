import java.util.ArrayList;
import java.util.List;

public class Permutations_46 {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        System.out.println(permute(nums));

    }


    public static List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();

        permuteHelper(nums, result, new ArrayList<>());

        return result;

    }


    private static void permuteHelper(int nums[], List<List<Integer>> result, List<Integer> temp) {

        if (temp.size() == nums.length) {
            result.add(new ArrayList<>(temp));
            return;
        }

        for (int num : nums) {

            if (temp.contains(num)) {
                continue;
            }

            temp.add(num);

            permuteHelper(nums, result, temp);

            temp.remove(temp.size() - 1);
        }

    }
}

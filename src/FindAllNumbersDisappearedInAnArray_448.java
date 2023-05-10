import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindAllNumbersDisappearedInAnArray_448 {

    //Input: nums = [4,3,2,7,8,2,3,1]
    //Output: [5,6]
    public static void main(String[] args) {
        int[] input = {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println(new FindAllNumbersDisappearedInAnArray_448().findDisappearedNumbers(input));

    }

    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> res = new ArrayList<>();

        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        for (int i = 0; i < nums.length; i++) {
            if (set.contains(i + 1)) {
                continue;
            } else {
                res.add(i + 1);
            }
        }
        return res;

    }
}

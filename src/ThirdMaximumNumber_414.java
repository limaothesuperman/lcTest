import java.util.*;

public class ThirdMaximumNumber_414 {

    public int thirdMax(int[] nums) {

        if (nums == null || nums.length == 0) return -1;

        Set<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();

        for (int num : nums) {
            set.add(num);
        }

        for (int num : set) {
            list.add(num);
        }

        Collections.sort(list);
        if (list.size() >= 3) return list.get(list.size() - 3);
        if (list.size() == 2) return list.get(1);
        if (list.size() == 1) return list.get(0);

        return -1;
    }
}

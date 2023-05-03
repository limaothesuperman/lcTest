import java.util.*;

public class FindtheDifferenceOfTwoArrays_2215 {
    public static void main(String[] args) {
        System.out.println(findDifference(new int[]{1, 2, 3}, new int[]{2, 4, 6}));
    }

    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> res2 = new HashSet<>();
        Set<Integer> temp = new HashSet<>();

        for (int num : nums1) {
            set1.add(num);
        }
        for (int num : nums2) {
            if (set1.add(num)) {
                set1.remove(num);
                res2.add(num);
            } else {
                temp.add(num);
            }
        }
        for (int num : temp) {
            set1.remove(num);
        }

        return Arrays.asList(new ArrayList<>(set1), new ArrayList<>(res2));
    }
}

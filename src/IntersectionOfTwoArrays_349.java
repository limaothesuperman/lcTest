import java.util.HashSet;
import java.util.Set;


public class IntersectionOfTwoArrays_349 {
    public static void testCase() {
        int[] nums1 = {1, 2, 3, 4, 5};
        int[] nums2 = {2, 3, 6, 5};
        for (int i = 0; i < intersection(nums1, nums2).length; i++) {
            System.out.print(intersection(nums1, nums2)[i] + " ");

        }
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        if (nums1 == null)
            return new int[0];
        else if (nums2 == null)
            return new int[0];
        else if (nums1.length == 0)
            return new int[0];
        else if (nums2.length == 0)
            return new int[0];

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int i : nums1)
            set1.add(i);
        for (int i : nums2)
            if (set1.contains(i))
                set2.add(i);
        int[] result = new int[set2.size()];
        int temp = 0;
        for (int i : set2)
            result[temp++] = i;

        return result;

    }
}

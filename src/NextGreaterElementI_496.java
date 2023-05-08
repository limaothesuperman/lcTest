import java.util.Arrays;

public class NextGreaterElementI_496 {

    public static void main(String[] args) {
        // nums1 = [4,1,2], nums2 = [1,3,4,2]
        // nums1 = [2,4], nums2 = [1,2,3,4]
        int[] nums11 = {4, 1, 2};
        int[] nums12 = {1, 3, 4, 2};
        System.out.println(Arrays.toString(nextGreaterElement(nums11, nums12)));

        int[] nums21 = {2, 4};
        int[] nums22 = {1, 2, 3, 4};
        System.out.println(Arrays.toString(nextGreaterElement(nums21, nums22)));

    }

    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] res = new int[nums1.length];

        for (int i = 0; i < res.length; i++) {
            res[i] = checkFunction(nums1[i], nums2);
        }
        return res;
    }

    public static int checkFunction(int temp, int[] nums2) {
        for (int i = 0; i < nums2.length; i++) {
            if (nums2[i] == temp) {
                for (int j = i + 1; j < nums2.length; j++) {
                    if (nums2[j] > temp) {
                        return nums2[j];
                    } else continue;
                }
            }
        }
        return -1;
    }
}

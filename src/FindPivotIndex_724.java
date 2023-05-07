public class FindPivotIndex_724 {
    public static void main(String[] args) {
        int[] nums1 = {1, 7, 3, 6, 5, 6};
        int[] nums2 = {1, 2, 3};
        System.out.println(pivotIndex(nums1));
        System.out.println(pivotIndex(nums2));

    }

    public static int pivotIndex(int[] nums) {
        int totalSum = 0;
        for (int num : nums) {
            totalSum = totalSum + num;
        }
        int leftSum = 0;
        for (int i = 0; i < nums.length; i++) {
            int rightSum = totalSum - leftSum - nums[i];
            if (rightSum == leftSum) return i;
            leftSum += nums[i];
        }

        return -1;
    }
}

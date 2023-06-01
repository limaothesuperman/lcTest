public class FindMinimumInRotatedSortedArray_153 {
    public static void main(String[] args) {
        int[] nums = {7, 1, 2, 3, 4, 5, 6};

        System.out.println(findMin(nums));

    }

    public static int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > nums[right]) left = mid + 1;
            if (nums[mid] < nums[right]) right = mid;

        }
        return nums[left];
    }
}

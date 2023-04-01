import java.util.Arrays;

public class TwoSumII_InputArrayIsSorted_167 {
    public static void main(String[] args) {
        TwoSumII_InputArrayIsSorted_167 two = new TwoSumII_InputArrayIsSorted_167();

        int[] numbers = {1, 2, 3, 4, 5, 6, 8, 9};
        int target = 9;

        System.out.println(Arrays.toString(two.twoSum(numbers, target)));


    }

    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while (left <= right) {
            if (numbers[left] + numbers[right] > target) {
                right--;
            } else if (numbers[left] + numbers[right] < target) {
                left++;
            } else if (numbers[left] + numbers[right] == target) {
                return new int[]{left + 1, right + 1};
            }
        }

        return new int[2];

    }
}

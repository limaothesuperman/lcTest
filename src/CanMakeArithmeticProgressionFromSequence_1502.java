import java.util.Arrays;


public class CanMakeArithmeticProgressionFromSequence_1502 {
    public static void main(String[] args) {
        CanMakeArithmeticProgressionFromSequence_1502 var = new CanMakeArithmeticProgressionFromSequence_1502();

        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 4, 5, 6};
        int[] arr3 = {0, -2, 2, 4, 6, 8};
        System.out.println(var.canMakeArithmeticProgression(arr1)); // true
        System.out.println(var.canMakeArithmeticProgression(arr2)); // false
        System.out.println(var.canMakeArithmeticProgression(arr3)); // true
    }

    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);

        int diff = arr[1] - arr[0];

        for (int i = 2; i < arr.length; i++) {
            if (arr[i] - arr[i - 1] != diff) return false;
        }
        return true;

    }
}

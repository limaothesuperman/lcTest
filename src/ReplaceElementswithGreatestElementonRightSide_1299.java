import java.util.Arrays;

public class ReplaceElementswithGreatestElementonRightSide_1299 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(Arrays.toString(replaceElements(arr)));

    }

    private static int[] replaceElements(int[] arr) {
        int rightMax = -1;

        for (int i = arr.length - 1; i >= 0; i--) {
            int newMax = Math.max(rightMax, arr[i]);
            arr[i] = rightMax;
            rightMax = newMax;
        }
        return arr;
    }
}

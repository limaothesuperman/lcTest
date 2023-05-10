public class RangeSumQueryImmutable_303 {
    public static void main(String[] args) {
        NumArray numArray = new NumArray(new int[]{-2, 0, 3, -5, 2, -1});
        int temp1 = numArray.sumRange(0, 2); // return (-2) + 0 + 3 = 1
        int temp2 = numArray.sumRange(2, 5); // return 3 + (-5) + 2 + (-1) = -1
        int temp3 = numArray.sumRange(0, 5); // return (-2) + 0 + 3 + (-5) + 2 + (-1) = -3
        System.out.println(temp1);
        System.out.println(temp2);
        System.out.println(temp3);
    }
}

class NumArray {

    private int[] numArray;

    public NumArray(int[] nums) {
        this.numArray = nums;

    }

    public int sumRange(int left, int right) {
        int res = 0;
        for (int i = left; i <= right; i++) {
            res += numArray[i];
        }
        return res;
    }
}
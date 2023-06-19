public class FindTheHighestAltitude_1732 {

    public static void main(String[] args) {
        int[] gain = {-5, 1, 5, 0, -7};
        System.out.println(largestAltitude(gain));
    }

    public static int largestAltitude(int[] gain) {
        int res = 0;
        int temp = 0;

        for (int num : gain) {
            temp = temp + num;
            res = Math.max(res, temp);
        }
        return res;
    }
}

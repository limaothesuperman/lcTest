public class RichestCustomerWealth_1672 {

    public static void main(String[] args) {
        int[][] accounts = {{1,2,3},{3,2,1}};
        System.out.println(maximumWealth(accounts));

    }
    public static int maximumWealth(int[][] accounts) {
        int res = 0;
        for (int[] customer: accounts) {
            int wealth = 0;
            for (int temp : customer) {
                wealth += temp;
            }
            res = Math.max(res, wealth);
        }
        return res;
    }
}

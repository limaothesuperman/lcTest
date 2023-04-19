class BestTimeToBuyAndSellStock_121 {
    public static void main(String[] args) {
        System.out.println(maxProfit(new int[] {1,2,3,7,2,11}));

    }
    public static int maxProfit(int[] prices) {
        int left = 0;
        int right = 1;
        int maxProfit = 0;
        while (right < prices.length) {
            if (prices[left] < prices[right]) {
                int profit = prices[right] - prices[left];
                maxProfit = Math.max(profit, maxProfit);
            } else {
                left = right;
            }
            right++;
        }
        return maxProfit;

    }
}
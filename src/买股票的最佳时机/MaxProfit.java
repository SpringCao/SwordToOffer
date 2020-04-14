package 买股票的最佳时机;

public class MaxProfit {
    public static void main(String[] args) {
        int[] a = {7,1,5,3,6,4};
        System.out.println(max(a));
    }
    private static int max(int[] prices){
        int min = prices[0];
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < min){
                min = prices[i];
            }
            profit = Math.max(profit,prices[i] - min);
        }
        return profit;
    }
}

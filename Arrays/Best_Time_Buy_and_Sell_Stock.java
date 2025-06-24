public class Best_Time_Buy_and_Sell_Stock {
    public static int bestTimeToBuyAndSellStock(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price; // Buy at lowest
            } else {
                maxProfit = Math.max(maxProfit, price - minPrice); // Sell for max profit
            }
        }

        return maxProfit;
    }
}
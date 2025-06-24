public class Stock_Buy_and_Sell {

    public static int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price; // Update minimum price so far
            } else {
                maxProfit = Math.max(maxProfit, price - minPrice); // Update profit if better
            }
        }

        return maxProfit;
    }
}

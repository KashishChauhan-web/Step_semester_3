package class_problems;

public class BestTimeToBuyAndSellStock {

    public static int maxProfit(int[] prices) {

        int minPrice = prices[0];
        int profit = 0;

        for (int i = 1; i < prices.length; i++) {

            if (prices[i] < minPrice) {
                minPrice = prices[i];
            }

            int currentProfit = prices[i] - minPrice;

            if (currentProfit > profit) {
                profit = currentProfit;
            }
        }

        return profit;
    }

    public static void main(String[] args) {

        int[] prices = {7, 1, 5, 3, 6, 4};

        System.out.println(maxProfit(prices));
    }
}
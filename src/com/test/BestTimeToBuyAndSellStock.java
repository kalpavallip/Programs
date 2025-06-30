package com.test;

import java.util.HashSet;

public class BestTimeToBuyAndSellStock {

    public static int maxProfit(int[] prices) {
        if (prices.length == 0) return 0;

        int minPrice = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            // Track minimum price so far
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } else {
                // Calculate potential profit
                int profit = prices[i] - minPrice;
                maxProfit = Math.max(maxProfit, profit);
            }
        }

        return maxProfit;
    }

    // Example usage
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        int profit = maxProfit(prices);
        System.out.println("Maximum profit: " + profit);
    }
}

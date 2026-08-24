class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = prices[0];
        int maxProfit =0;
        for (int i=0; i<prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            }
            int profit = prices[i] - minPrice;
            if (profit > maxProfit) {
                maxProfit = profit;
            }

        }
        // set min price to the first unit of the array
        // loop through each price in the array
        // update min price if the current price is lower than current min price
        // calculate the profit if u sell at the current price (current - min)
        // update max profit if its bigger than current profit
        return maxProfit;
    }
}

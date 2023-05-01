class Solution {
    public int maxProfit(int[] prices) {
        int bp = Integer.MAX_VALUE;
        int maxP = 0;

        for(int i=0; i<prices.length; i++){
            if(bp<prices[i]){
                int profit = prices[i] - bp;
                maxP = Math.max(profit,maxP);
            }
            else{
                bp = prices[i];
            }
           
        }
         return maxP;
    }
}

/*
This Java code defines a class named Solution, which contains a single method named maxProfit. The purpose of the maxProfit method is to calculate the maximum profit that can be obtained by buying and then selling a stock at different prices on different days.

The maxProfit method takes an integer array prices as its input parameter, which represents the price of the stock on each day. The method initializes two integer variables bp and maxP to Integer.MAX_VALUE and 0 respectively.

The bp variable represents the lowest price at which the stock was purchased, while the maxP variable represents the maximum profit that can be obtained. The for loop iterates through the prices array to check the profit that can be earned by buying the stock on a day and selling it on a later day.

Within the for loop, if the current price of the stock is greater than the bp variable, the method calculates the profit that can be obtained by subtracting the current price from the bp variable. If the profit is greater than maxP, the maxP variable is updated with the new profit.

If the current price is less than or equal to the bp variable, the method updates the bp variable to the current price. This represents the new lowest price at which the stock can be purchased.

After the for loop has completed, the method returns the maxP variable, which represents the maximum profit that can be obtained by buying and selling the stock.

Overall, the maxProfit method implements a simple algorithm that efficiently finds the maximum profit that can be earned by buying and selling a stock at different prices on different days.
*/

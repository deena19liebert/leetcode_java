class Solution {
    public int maxProfit(int[] prices) {
        // Greedy Approach Works Here!
        int profit = 0;
        int sum = 0;
        for(int i=1; i<prices.length; i++){
            sum = prices[i] - prices[i-1];
            if(sum > 0){
                profit += sum;
            }
        }
        return profit;
    }
}
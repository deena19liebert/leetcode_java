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

// class Solution {
//     public int f(int i, int canBuy, int[] prices){
//         if(i == prices.length){
//             return 0;
//         } 
//         if(canBuy == 1){
//             int buy = -prices[i] + f(i+1, 0, prices);
//             int notBuy = 0 + f(i+1, 1, prices);
//             return Math.max(buy, notBuy);
//         } else {
//             int sell = prices[i] + f(i+1, 1, prices);
//             int notSell = 0 + f(i+1, 0, prices); 
//             return Math.max(sell, notSell);           
//         }
//     }
//     public int maxProfit(int[] prices) {
//         return f(0, 1, prices);
//     }
// }
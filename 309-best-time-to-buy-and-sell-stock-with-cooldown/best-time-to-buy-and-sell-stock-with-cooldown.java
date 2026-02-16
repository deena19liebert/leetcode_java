class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int[][] dp = new int[n+2][2];
        for(int i=n-1; i>=0; i--){
            for(int buy=0; buy <=1; buy++){
                if(buy == 1){
                    dp[i][buy] = Math.max(-prices[i] + dp[i+1][0], dp[i+1][1]);
                } else {
                    dp[i][buy] = Math.max(prices[i] + dp[i+2][1], dp[i+1][0]);
                }
            }
        }
        return dp[0][1];
    }
}
// RECURSION
// class Solution {
//     public int f(int i, int canBuy, int[] prices){
//         if(i >= prices.length) return 0;

//         if(canBuy == 1){
//             int buy = -prices[i] + f(i+1, 0, prices);
//             int notBuy = 0 + f(i+1, 1, prices);
//             return Math.max(buy, notBuy);
//         } else {
//             int sell = prices[i] + f(i+2, 1, prices);
//             int notSell = 0 + f(i+1, 0, prices);
//             return Math.max(sell, notSell);            
//         }
//     }
//     public int maxProfit(int[] prices) {
//         return f(0, 1, prices);
//     }
// }
class Solution {
    public int maxProfit(int k, int[] prices) {
        int n = prices.length;
        int[][][] dp = new int[n+1][2][k+1];

        for(int i=n-1; i>=0; i--){
            for(int canBuy = 0; canBuy <=1; canBuy++){
                for(int t=1; t<=k; t++){
                    if(canBuy == 1){
                        dp[i][canBuy][t] = Math.max(-prices[i] + dp[i+1][0][t], dp[i+1][1][t]);
                    } else {
                        dp[i][canBuy][t] = Math.max(prices[i] + dp[i+1][1][t-1], dp[i+1][0][t]);
                    }
                }
            }
        }
        return dp[0][1][k];
    }
}
// RECURSION O(2 ^ N)
// class Solution {
//     public int f(int i, int canBuy, int k, int[] prices){
//         if(i == prices.length || k == 0){
//             return 0;
//         } 
//         if(canBuy == 1){
//             int buy = -prices[i] + f(i+1, 0, k, prices);
//             int notBuy = 0 + f(i+1, 1, k, prices);
//             return Math.max(buy, notBuy);
//         } else {
//             int sell = prices[i] + f(i+1, 1, k-1, prices);
//             int notSell = 0 + f(i+1, 0, k, prices); 
//             return Math.max(sell, notSell);           
//         }
//     }
//     public int maxProfit(int k, int[] prices) {
//         return f(0, 1, k, prices);
//     }
// }
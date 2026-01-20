class Solution {
    public int coinChange(int[] coins, int amount) {
        int INF = (int) 1e9;
        int[] dp = new int[amount + 1];

        Arrays.fill(dp, INF);
        dp[0] = 0;
    
        for(int i=0; i<coins.length; i++){
            int coin = coins[i];
            for(int j=coin; j<=amount; j++){
                dp[j] = Math.min(dp[j], 1 + dp[j-coins[i]]);
            }
        }
        return dp[amount] >= INF ? -1 : dp[amount];
    }
}
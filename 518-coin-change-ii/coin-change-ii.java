class Solution {
    public int change(int amount, int[] coins) {
        int n = coins.length;
        int[] dp = new int[amount + 1];

        dp[0] = 1;

        for(int a=0; a<=amount; a++){
            if(a % coins[0] == 0) 
                dp[a] = 1;
        }
        for(int i=1; i<n; i++){
            int coin = coins[i];
            for(int a=coin; a<=amount; a++){
                dp[a] += dp[a - coin];
            }
        }
        return dp[amount];
    }
}
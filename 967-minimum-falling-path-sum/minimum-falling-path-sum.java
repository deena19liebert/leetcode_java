class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int n = matrix.length;
        int[] dp = new int[n];

        for(int j=0; j<n; j++){
            dp[j] = matrix[0][j];
        }
        for(int i=1; i<n; i++){
            int[] prev = dp.clone();
            for(int j=0; j<n; j++){
                if(j==0) 
                    dp[j] = matrix[i][j] + Math.min(prev[j], prev[j+1]);
                else if(j==n-1)
                    dp[j] = matrix[i][j] + Math.min(prev[j], prev[j-1]);
                else 
                    dp[j] = matrix[i][j] + Math.min(prev[j-1], Math.min(prev[j], prev[j+1]));
            }
        }
        int ans = Integer.MAX_VALUE;
        for(int j=0; j<n; j++){
            ans = Math.min(ans, dp[j]);
        }
        return ans;
    }
}
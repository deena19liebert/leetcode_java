class Solution {
    public int maximumWealth(int[][] accounts) {
        int n = accounts.length;
        int m = accounts[0].length;
        int max = 0;
        for(int i=0; i<n; i++){
            int result = 0;
            for(int j=0; j<m; j++){
                result += accounts[i][j];
            }
            max = Math.max(result, max);
        }
        return max;
    }
}
// Memoization
class Solution {
    private int f(int i, int prevIndex, int[] nums, int[][] dp){
        if(i == nums.length){
            return 0;
        }
        if(dp[i][prevIndex + 1] != -1) return dp[i][prevIndex + 1];
        int notPick = f(i+1, prevIndex, nums, dp);
        int pick = 0;
        if(prevIndex == -1 || nums[i] > nums[prevIndex]) {
            pick = 1 + f(i+1, i, nums, dp);
        }
        return dp[i][prevIndex + 1] = Math.max(pick, notPick);
    }
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        // index -> 0 to n-1
        // prevIndex -> -1 to n-1 (shift position) => 0 to n
        int[][] dp = new int[n][n+1];
        for(int i=0; i<n; i++){
            Arrays.fill(dp[i], -1);
        }
        return f(0, -1, nums, dp);

    }
}
// RECURSION
// class Solution {
//     public int f(int i, int prevIndex, int[] nums){
//         if(i == nums.length){
//             return 0;
//         }
//         int notPick = f(i+1, prevIndex, nums);
//         int pick = 0;
//         if(prevIndex == -1 || nums[i] > nums[prevIndex]) {
//             pick = 1 + f(i+1, i, nums);
//         }
//         return Math.max(pick, notPick);
//     }
//     public int lengthOfLIS(int[] nums) {
//         return f(0, -1, nums);
//     }
// }
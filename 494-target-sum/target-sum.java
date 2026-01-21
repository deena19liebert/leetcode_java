class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int n = nums.length;
        int total=0;
        for(int num : nums){
            total += num;
        }

        if((total + target) % 2 != 0 || Math.abs(target) > total) return 0; 

        int k = (total + target) / 2;
        int[] dp = new int[k+1];
        dp[0] = 1;
        for(int i=0; i<n; i++){
            for(int j = k; j>=nums[i]; j--){
                dp[j] += dp[j - nums[i]];
            }
        }
        return dp[k];
    
    }
}
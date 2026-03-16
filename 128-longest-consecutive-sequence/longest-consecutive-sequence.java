class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        int maxLen = 0;
        if(nums.length == 1) return 1;
        Arrays.sort(nums);
        int count = 1;
        for(int i=1; i<n; i++){
            if(nums[i] == nums[i-1]+1){
                count++;
            } else if(nums[i] != nums[i-1]){
                count = 1;
            }
            maxLen = Math.max(maxLen, count);
        }
        return maxLen;
    }
}
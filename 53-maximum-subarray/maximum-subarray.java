class Solution {
    public int maxSubArray(int[] nums) {
        int currSum = nums[0];
        int maxSum = nums[0];
        for(int i = 1; i < nums.length; i++){
            currSum = Math.max(nums[i], currSum + nums[i]);
            maxSum = Math.max(currSum, maxSum);
        }
        return maxSum;
    }
}
//BRUTE FORCE SOLUTION 
// class Solution {
//     public int maxSubArray(int[] nums) {
//         int maxElement = Integer.MIN_VALUE;
//         for(int i=0; i<nums.length; i++){
//             int sum = 0;
//             for(int j=i; j<nums.length; j++){
//                 sum += nums[j];
//                 maxElement = Math.max(maxElement, sum);
//             }
//         }
//         return maxElement;
//     }
// }
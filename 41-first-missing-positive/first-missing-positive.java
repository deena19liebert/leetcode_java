class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        //For an array of size n, the smallest missing positive integer must fall within the range [1, n + 1]
          //If the array contains all numbers from 1 to n perfectly, the missing number is n+1
          //Otherwise, the missing number is somewhere between 1 and n.

        for(int i=0; i<nums.length; i++){
            // Keep swapping until the current number is in its correct spot
            while(nums[i] > 0 && nums[i] <= n && nums[nums[i] - 1] != nums[i]){
                int targetIndex = nums[i] - 1;
                int temp = nums[i];
                nums[i] = nums[targetIndex];
                nums[targetIndex] = temp;
            }
        }
        //Find the first index where the value doesn't match the index + 1
        for(int i=0; i<n; i++){
            if(nums[i] != i+1) return i+1;
        }
    return n+1;
    }
}
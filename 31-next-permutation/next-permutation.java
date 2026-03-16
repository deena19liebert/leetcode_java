// Step 1: Find the first decreasing element from the right
           // Traverse from right and find the first index i such that: nums[i] < nums[i+1]
// Step 2: Find the number just greater than nums[i]
// Step 3: Reverse the remaining right part

// Input: 1 3 5 4 2

// Step 1 (find break): 3 < 5

// Step 2 (swap): 1 4 5 3 2

// Step 3 (reverse): 1 4 2 3 5

// Final answer: 1 4 2 3 5

class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int i = n-2;
        while(i >= 0 && nums[i] >= nums[i+1]){
            i--;
        }
        if(i >= 0){
            int j = n-1;
            while(nums[j] <= nums[i]){
                j--;
            }
            swap(nums, i, j);
        }
        reverse(nums, i+1,n-1);
    }
    public void swap(int[] nums, int start, int end){
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }
    public void reverse(int[] nums, int start, int end){
        while(start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }
}
class Solution {
    public boolean search(int[] nums, int target) {
        int left=0, right=nums.length - 1;

        while(left <= right) {
            int mid = (left + right) / 2;
            if(nums[mid] == target) {
                return true;
            }
            //HANDLE DUPLICATES
            if(nums[left] == nums[mid] && nums[mid] == nums[right]) {
                left++;
                right--;
            }
            // CASE:1 LEFT HALF IS SORTED
            else if(nums[left] <= nums[mid]) {
                //TARGET IS IN THE LEFT HALF
                if(nums[left] <= target && target < nums[mid]) {
                    right = mid-1;
                } else {
                    left = mid + 1;
                    }
            }
        // CASE:2 RIGHT HALF IS SORTED
        else {
            //TARGET IS IN THE RIGHT HALF
            if(nums[mid] < target && target <= nums[right]) {
                left = mid + 1;
            } else {
                right = mid-1;
            }
        }
        }
        return false;
    }
}
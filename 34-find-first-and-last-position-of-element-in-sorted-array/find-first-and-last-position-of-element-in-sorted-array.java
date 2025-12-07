class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = firstandlastOccurence(nums, target, true);
        int last = firstandlastOccurence(nums, target, false);
        return new int[]{first, last};
    }
        private int firstandlastOccurence(int[] nums, int target, boolean isFirst) {
        int low = 0, high = nums.length - 1;
        int ans = -1;
        while(low <= high){
            int mid = low + (high - low) / 2;
            if(nums[mid] == target) {
                ans = mid;
                if (isFirst) high = mid - 1;
                else low = mid + 1;
            }
            else if(nums[mid] < target){
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;

    
    }
    
}
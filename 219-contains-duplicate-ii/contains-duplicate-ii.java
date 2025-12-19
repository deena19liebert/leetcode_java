class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int left=0, diff = 0;
        for (int right = 0; right < nums.length; right++){
            map.put(nums[right], map.getOrDefault(nums[right], 0) + 1);
            while(map.get(nums[right]) > 1) {
                diff = right - left;
                if(diff > k) {
                    map.put(nums[left], map.getOrDefault(nums[left], 0) - 1);
                    left++;
                } else return true;
            }
        }
        return false; 
    }
}
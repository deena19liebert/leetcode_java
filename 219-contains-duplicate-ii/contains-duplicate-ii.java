class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {

        // A HashMap is used to store each element’s latest index.

        Map<Integer, Integer> intMap = new HashMap<>();
        for(int i=0; i<nums.length; i++){
             // As we iterate through the array, we check if the current element has been seen before.
             if(intMap.containsKey(nums[i])){
                if(i-intMap.get(nums[i]) <= k) {
                    return true;
                }
             }
             intMap.put(nums[i], i);
        }
        return false;
    }
}
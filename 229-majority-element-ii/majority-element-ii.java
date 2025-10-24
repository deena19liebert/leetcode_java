class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer, Integer> countElement = new HashMap<>();
        
        // For each number in the array, increase its count in the map by 1. If it’s not in the map yet, start its count at 1

        for(int i=0; i < nums.length; i++){
            countElement.put(nums[i],countElement.getOrDefault(nums[i], 0) + 1);
        }
        List<Integer> majorityElements = new ArrayList<>();
        int threshold = nums.length/3;

        for(Map.Entry<Integer, Integer> entry : countElement.entrySet()) {
            int element = entry.getKey();
            int count = entry.getValue();
            if(count > threshold) {
                majorityElements.add(element);
            }

        }
    return majorityElements;
    }
}
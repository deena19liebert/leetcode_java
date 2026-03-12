class Solution {
    public int majorityElement(int[] nums) {
        int ans = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        for(int num : nums){
            if(map.get(num) > nums.length / 2){
                ans = num;
            }
        }
        return ans;
    }
}
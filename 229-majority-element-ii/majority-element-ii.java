// BETTER APPROACH, TC: O(N), SC: O(1)
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> result = new ArrayList<>();
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for(int num : map.keySet()){
            if(map.get(num) > n / 3) {
                result.add(num);
            }
        }
        return result;
    }
}

// BRUTE FORCE, TC: O(N^2), SC: O(1)
// class Solution {
//     public List<Integer> majorityElement(int[] nums) {
//         List<Integer> result = new ArrayList<>();
//         for(int i=0; i<nums.length; i++){
//             int count = 0;
//             for(int j=0; j<nums.length; j++){
//                 if(nums[i] == nums[j]) count++;
//             }
//             if(count > nums.length / 3 && !result.contains(nums[i])) result.add(nums[i]);
//         }
//         return result;
//     }
// }
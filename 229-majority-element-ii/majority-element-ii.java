// OPTIMAL SOLUTION, TC: O(N), SC: O(1)
//MOORE'S VOTING ALGORITHM
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> result = new ArrayList<>();
        int n = nums.length;
        int ans1 = 0, ans2 = 0;
        int count1 = 0, count2 = 0;

        // Step 1: Find candidates
        for(int i=0; i<n; i++){
            if(nums[i] == ans1){
                count1++;
            }
            else if(nums[i] == ans2){
                count2++;
            } 
            else if(count1 == 0){
                ans1 = nums[i];
                count1++;
            } 
            else if(count2 == 0){
                ans2 = nums[i];
                count2++;
            }
            else{
                count1--;
                count2--;
            }
        }
        // Step 2: Verify candidates
        count1=0; 
        count2=0;
        for(int num : nums){
            if(num == ans1) count1++;
            else if(num == ans2) count2++;
        }
        if(count1 > n/3) result.add(ans1);
        if(count2 > n/3) result.add(ans2);
        return result;
    }
}

// BETTER APPROACH, TC: O(N), SC: O(N)
// class Solution {
//     public List<Integer> majorityElement(int[] nums) {
//         List<Integer> result = new ArrayList<>();
//         int n = nums.length;
//         Map<Integer, Integer> map = new HashMap<>();
//         for(int num : nums){
//             map.put(num, map.getOrDefault(num, 0) + 1);
//         }
//         for(int num : map.keySet()){
//             if(map.get(num) > n / 3) {
//                 result.add(num);
//             }
//         }
//         return result;
//     }
// }

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
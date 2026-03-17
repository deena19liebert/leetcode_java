//OPTIMAL SOLUTION
class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        Set<Integer> set = new HashSet<>();
        int maxLen = 0;
        for(int num : nums){
            set.add(num);
        }
        for(int num : set){
            if(!set.contains(num - 1)){
                int currNum = num;
                int count = 1;
                while(set.contains(currNum + 1)){
                    currNum++;
                    count++;
                }
                maxLen = Math.max(maxLen, count);
            }
        }
        return maxLen;
    }
}
//BETTER SOLUTION
// class Solution {
//     public int longestConsecutive(int[] nums) {
//         int n = nums.length;
//         int maxLen = 0;
//         if(nums.length == 1) return 1;
//         Arrays.sort(nums);
//         int count = 1;
//         for(int i=1; i<n; i++){
//             if(nums[i] == nums[i-1]+1){
//                 count++;
//             } else if(nums[i] != nums[i-1]){
//                 count = 1;++
//             }
//             maxLen = Math.max(maxLen, count);
//         }
//         return maxLen;
//     }
// }
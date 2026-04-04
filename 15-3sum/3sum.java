//OPTIMAL TC:O(N^2)
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);
        int sum = 0;
        for(int i=0; i<n-2; i++){
            if(i > 0 && nums[i] == nums[i-1]) continue;
            if(nums[i] > 0) break; // IF nums[i] > 0, THERE'S NO WAY U CAN GET A SUM = 0
            int j=i+1, k = n-1;
            while(j < k) {
                sum = nums[i] + nums[j] + nums[k];
                if(sum == 0){
                    List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k]);
                    result.add(temp);
                    j++;
                    k--;
                    while(j < k && nums[j] == nums[j-1]) j++;
                    while(j < k && nums[k] == nums[k+1]) k--;
                }  
                else if(sum > 0) k--;
                else j++;
            }
        }
        return result;
    }
}

// BETTER APPROACH TC: O(N^2), SC: O(n + K)
// class Solution {
//     public List<List<Integer>> threeSum(int[] nums) {
//         Set<List<Integer>> set = new HashSet<>();
//         int n = nums.length;
//         for(int i=0; i<n; i++){
//             Set<Integer> seenSet = new HashSet<>();
//             for(int j=i+1; j<n; j++){
//                 int target = -(nums[i] + nums[j]);
//                 if(seenSet.contains(target)){
//                     List<Integer> result = Arrays.asList(nums[i], nums[j], target);
//                     Collections.sort(result);
//                     set.add(result);
//                 }
//                 seenSet.add(nums[j]);
//             }
//         }
//         return new ArrayList<>(set);
//     }
// }

// BRUTE FORCE  TC: O(N^3), SC: O(K), worst case: O(n^2)
// class Solution {
//     public List<List<Integer>> threeSum(int[] nums) {
//         Set<List<Integer>> set = new HashSet<>();
//         int n = nums.length;
//         for(int i=0; i<n; i++){
//             for(int j=i+1; j<n; j++){
//                 for(int k=j+1; k<n; k++){
//                     if(nums[i] + nums[j] + nums[k] == 0) {
//                         List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k]);
//                         Collections.sort(temp);
//                         set.add(temp);
//                     }
//                 }
//             }
//         }
//         return new ArrayList<>(set);
//     }
// }

// STILL BRUTEFORCE BUDDY
// class Solution {
//     public List<List<Integer>> threeSum(int[] nums) {
//         Set<List<Integer>> set = new HashSet<>();
//         int n = nums.length;
//         int left = 0;
//         while (left < n) {
//             for(int right=left+1; right<n; right++){
//                 int target = -(nums[left] + nums[right]);
//                 for(int j=right+1; j<n; j++)
//                     if(nums[j] == target){
//                         List<Integer> result = Arrays.asList(nums[left], nums[right], nums[j]);
//                         Collections.sort(result);
//                         set.add(result);
//                     }
//             } 
//             left++;
//         }
//         return new ArrayList<>(set);
//     }
// }
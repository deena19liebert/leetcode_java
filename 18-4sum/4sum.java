// OPTIMAL APPROACH
class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);
        for(int i=0; i<n-3; i++){
            // SKIP DUPLICATE i
            if(i > 0 && nums[i] == nums[i-1]) continue;
            for(int j=i+1; j<n-2; j++){
                // SKIP DUPLICATE j
                if(j > i+1 && nums[j] == nums[j-1]) continue;
                int left=j+1, right=n-1;
                while(left < right){
                    long sum = (long)nums[i] + (long)nums[j] + (long)nums[left] + (long)nums[right];
                    if(sum == target){
                        List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[left], nums[right]);
                        result.add(temp);
                        left++;
                        right--;
                        while(left < right && nums[left] == nums[left-1]) left++;
                        while(left < right && nums[right] == nums[right+1]) right--;
                    }
                    else if(sum < target) left++;
                    else right--;
                }
            }
        }
        return result;
    }
}
// BETTER APPROACH
// class Solution {
//     public List<List<Integer>> fourSum(int[] nums, int target) {
//         Set<List<Integer>> set = new HashSet<>();
//         int n = nums.length;
//         for(int i=0; i<n; i++){
//             for(int j=i+1; j<n; j++){
//                 Set<Long> seenSet = new HashSet<>();
//                 for(int k=j+1; k<n; k++){
//                     long sum = (long) nums[i] + nums[j] + nums[k];
//                     if(seenSet.contains((long) target - sum)){
//                         List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k], (int) (target-sum));
//                         Collections.sort(temp);
//                         set.add(temp);
//                     }
//                     seenSet.add((long) nums[k]);
//                 }
//             }
//         }
//         return new ArrayList<>(set);
//     }
// }
// BRUTE FORCE
// class Solution {
//     public List<List<Integer>> fourSum(int[] nums, int target) {
//         Set<List<Integer>> set = new HashSet<>();
//         int n = nums.length;
//         for(int i=0; i<n; i++){
//             for(int j=i+1; j<n; j++){
//                 for(int k=j+1; k<n; k++){
//                     for(int l=k+1; l<n; l++){
//                         if(nums[i]+nums[j]+nums[k]+nums[l] == target){
//                             List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k], nums[l]);
//                             Collections.sort(temp);
//                             set.add(temp);
//                         }
//                     }
//                 }
//             }
//         }
//         return new ArrayList<>(set);
//     }
// }
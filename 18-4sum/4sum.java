// BETTER APPROACH
class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Set<List<Integer>> set = new HashSet<>();
        int n = nums.length;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                Set<Long> seenSet = new HashSet<>();
                for(int k=j+1; k<n; k++){
                    long sum = (long) nums[i] + nums[j] + nums[k];
                    if(seenSet.contains((long) target - sum)){
                        List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k], (int) (target-sum));
                        Collections.sort(temp);
                        set.add(temp);
                    }
                    seenSet.add((long) nums[k]);
                }
            }
        }
        return new ArrayList<>(set);
    }
}
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
//OPTIMAL APPROACH- O(N) O(1)
class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        if(n == 0) return 0;

        int i = 0;
        for(int j=1; j<n; j++){
            if(nums[i] != nums[j]){
                nums[i+1] = nums[j];
                i++;
            }
        }
        return i+1;
    }
}
//Brute Force
// class Solution { // TC-0(N), SC-O(N)
//     public int removeDuplicates(int[] nums) {
//         Set<Integer> set = new HashSet<>();
//         int j=0;
//         for(int i=0; i<nums.length; i++){
//             if(!set.contains(nums[i])){
//                 set.add(nums[i]);
//                 nums[j] = nums[i];
//                 j++;
//             }
//         }
//         return set.size();
//     }
// }

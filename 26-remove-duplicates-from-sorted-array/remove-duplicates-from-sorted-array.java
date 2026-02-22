//BETTER APPROACH
class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        if(n == 0) return 0;

        int left = 0, i = 1;
        for(int right=0; right<n; right++){
            if(nums[left] != nums[right]){
                nums[i] = nums[right];
                left = right;
                i++;
            }
        }
        return i;
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

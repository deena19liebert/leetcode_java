class Solution {
    public int missingNumber(int[] nums) {
        int totSum = 0, sum = 0;
        for(int i=0; i <= nums.length; i++){
            totSum += i;
        }
        for(int num : nums){
            sum += num;
        }
        return totSum - sum;
    }
}

// class Solution {
//     public int missingNumber(int[] nums) {
//         Set<Integer> set = new HashSet<>();
//         for(int i=0; i<=nums.length; i++){
//             set.add(i);
//         }
//         for(int num : nums){
//             set.remove(num);
//         }
//         return set.iterator().next();
//     }
// }
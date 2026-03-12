class Solution { // MOORE'S VOTING ALGORITHM
    public int majorityElement(int[] nums) {
        int count=0, num=0;
        for(int i=0; i<nums.length; i++){
            if(count == 0){
                count = 1;
                num = nums[i];
            } else if(num == nums[i]){
                count++;
            } else {
                count--;
            }
        }
        return num;
    }
}
// class Solution {
//     public int majorityElement(int[] nums) {
//         int ans = 0;
//         Map<Integer, Integer> map = new HashMap<>();
//         for(int num : nums){
//             map.put(num, map.getOrDefault(num, 0)+1);
//         }
//         for(int num : nums){
//             if(map.get(num) > nums.length / 2){
//                 ans = num;
//             }
//         }
//         return ans;
//     }
// }
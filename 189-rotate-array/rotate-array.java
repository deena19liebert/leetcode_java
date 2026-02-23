//BETTER APPROACH
class Solution {
    public void reverse(int start, int end, int[] nums){
        while(start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        reverse(0, n - 1, nums);
        reverse(0, k - 1, nums);
        reverse(k, n - 1, nums);
    }
}

//BRUTE FORCE   TC:O(N*K) SC:O(N)
// class Solution {
//     public void rotate(int[] nums, int k) {

//         for(int i=1; i<=k; i++){
//             int lastElement = nums[nums.length-1];
//             for(int j=nums.length-1; j>0; j--){
//                 nums[j] = nums[j-1];
//             }
//             nums[0] = lastElement;
//         }
//     }
// }
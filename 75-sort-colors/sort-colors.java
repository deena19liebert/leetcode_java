//OPTIMAL APPROACH (DUTCH NATIONAL FLAG ALGORITHM)
class Solution { //TC: O(N), SC: O(1)
    public void swap(int i, int j, int[] nums){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public void sortColors(int[] nums) {
        int n = nums.length;
        int low =0, mid = 0, high = n-1;
        while(mid <= high){
                if(nums[mid] == 0){
                    swap(low, mid, nums);
                    low++;
                    mid++;
                }
                else if(nums[mid] == 1){
                    mid++;
                } else {
                    swap(mid, high, nums);
                    high--;
                }
        }
    }
}
//BETTER APPROACH
// class Solution { //TC: O(N), SC: O(1)
//     public void sortColors(int[] nums) {
//         int zeroCount = 0, one = 0, two = 0;
//         for(int i=0; i<nums.length; i++){
//             if(nums[i] == 0) zeroCount++;
//             else if(nums[i] == 1) one++;
//             else two++;
//         }
//         for(int i=0; i<zeroCount; i++){
//             nums[i] = 0;
//         }
//         for(int i=zeroCount; i<one+zeroCount; i++){
//             nums[i] = 1;
//         }
//         for(int i=one+zeroCount; i<nums.length; i++){
//             nums[i] = 2;
//         }
//     }
// }
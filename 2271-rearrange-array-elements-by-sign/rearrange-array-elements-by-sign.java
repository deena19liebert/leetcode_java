//OPTIMAL SOLUTION, TC: O(N) + O(N), SC: O(N)
class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int posIndex = 0, negIndex = 0;
        for (int i=0; i<n; i++){
            if(nums[i] > 0){
                result[2 * posIndex] = nums[i];
                posIndex++;
            } else {
                result[2 * negIndex + 1] = nums[i];
                negIndex++;
            }
        }
        return result;
    }
}
//BRUTE FORCE, TC: O(N) + O(N), SC: O(N)
// class Solution {
//     public int[] rearrangeArray(int[] nums) {
//         int n = nums.length;
//         int[] pos = new int[n/2];
//         int[] neg = new int[n/2];
//         int pIndex=0, nIndex=0;
//         for(int i=0; i<n; i++){
//             if(nums[i] > 0){
//                 pos[pIndex] = nums[i]; //STORE ONLY POSITIVE
//                 pIndex++; 
//             } else {
//                 neg[nIndex] = nums[i]; //STORE ONLY NEGATIVE
//                 nIndex++;
//             }
//         }
//         for(int i=0; i<n/2; i++){ 
//             nums[2 * i] = pos[i]; // even indices (0,2,4) contain positive values
//             nums[2 * i + 1] = neg[i]; // odd indices (1,3,5) contain negative values
//         }
//         return nums;
//     }
// }
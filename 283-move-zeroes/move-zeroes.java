class Solution {
    public void swap(int i, int j, int[] nums){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int j = -1;
        for(int i=0; i<n; i++){
            if(nums[i] == 0){
                j = i;
                break;
            }
        }
        if(j == -1) return;

        for(int i=j+1; i<n; i++){
            if(nums[i] != 0){
                swap(i, j, nums);
                j++;
            }
        }
    }
}
//BRUTE FORCE
// class Main {
//     public static void main(String[] args) {
//         int[] arr = {1, 0, 2, 3, 2, 0, 0, 4, 5, 1};
//         int n = arr.length;
//         int[] temp = new int[n];
//         int j = 0;
//         for(int i=0; i<n; i++){
//             if(arr[i] != 0){
//                 temp[j] = arr[i];
//                 j++;
//             }
//         }
//         for(int i=0; i<n; i++){
//             arr[i] = temp[i];
//         }
//         for(int i=0; i<n; i++) {
//         System.out.print(arr[i] + " ");
//         }

//     } 
// }

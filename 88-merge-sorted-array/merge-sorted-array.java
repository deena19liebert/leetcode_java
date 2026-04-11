//OPTIMAL SLUTION / BETTER SLUTION 
// TC: O(N+M), SC:O(1)
class Solution {
    public void merge(int[] nums1, int n, int[] nums2, int m) {
        int i = n-1;
        int j = m-1;
        int k = n+m-1;
        while(i >=0 && j >= 0){
            if(nums1[i] > nums2[j]){
                nums1[k--] = nums1[i--];
            }
            else {
                nums1[k--] = nums2[j--];
            }
        }
        while(j >=0){
            nums1[k--] = nums2[j--];
        }
    }
}

//BRUTE FORCE
// class Solution {
//     public void merge(int[] nums1, int n, int[] nums2, int m) {
//         for(int j=0; j<m; j++){
//             nums1[n+j] = nums2[j];
//         }
//         Arrays.sort(nums1);
//     }
// }
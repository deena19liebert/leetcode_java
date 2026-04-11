//BRUTE FORCE
class Solution {
    public void merge(int[] nums1, int n, int[] nums2, int m) {
        int[] result = new int[m+n];
        for(int j=0; j<m; j++){
            nums1[n+j] = nums2[j];
        }
        Arrays.sort(nums1);
    }
}
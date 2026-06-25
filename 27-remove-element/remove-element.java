class Solution {
    public int removeElement(int[] nums, int val) {
        int n = nums.length;
        int count = 0;
        int i=0;
        for(int j=0; j<n; j++){
            if(nums[j] != val){
                nums[i] = nums[j];
                i++;
            }

        }
        return i;
    }
}


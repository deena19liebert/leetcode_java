class NumArray {

// PREFIX SUM - We do preprocessing inorder to save time
int[] prefix;

    public NumArray(int[] nums) {
        // u gotta add every element and store it in the array
        prefix = new int[nums.length];
        prefix[0] = nums[0];
        for(int i=1; i<nums.length; i++){
            prefix[i] = prefix[i-1] + nums[i];
        }
    }
    
    public int sumRange(int left, int right) {
        //u gotta find the sum of the given range of elements
        if(left == 0) {
            return prefix[right];
        }
        return prefix[right] - prefix[left - 1];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */
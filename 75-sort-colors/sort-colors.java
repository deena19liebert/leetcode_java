class Solution {
    public void sortColors(int[] nums) {
        int zeroCount = 0, one = 0, two = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == 0) zeroCount++;
            else if(nums[i] == 1) one++;
            else two++;
        }
        for(int i=0; i<zeroCount; i++){
            nums[i] = 0;
        }
        for(int i=zeroCount; i<one+zeroCount; i++){
            nums[i] = 1;
        }
        for(int i=one+zeroCount; i<nums.length; i++){
            nums[i] = 2;
        }
    }
}
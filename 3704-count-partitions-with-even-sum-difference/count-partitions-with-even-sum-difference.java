class Solution {
    public int countPartitions(int[] nums) {
        int totSum = 0;
        for(int num : nums){
            totSum += num;
        }
        if(totSum % 2 != 0) return 0;

        int sum = 0, remainingSum = 0;
        int count = 0;
        for(int i=0; i<nums.length-1; i++){
                sum += nums[i];
                remainingSum = totSum - sum;
                if((remainingSum - sum) % 2 == 0){
                    count++;
                }
        }
        return count;
    }
}
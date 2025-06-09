class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int expectedSum = n * (n+1) / 2;
        int actualSum = 0;
        for(int num : nums) {
            actualSum += num;
        }
        return expectedSum - actualSum;
    }
}

// using XOR
/* 
    int allXOR = 0;
    for(int i=0; i <= nums.length; i++) {
        allXOR = allXOR ^ i;
    }

    for(int num : nums){
        allXOR = allXOR ^ num;
    }
    return allXOR;

*/
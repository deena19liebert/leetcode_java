class Solution {
    public int singleNumber(int[] nums) {

        // ones keeps track of bits seen exactly once.

        //twos keeps track of bits seen exactly twice.

        //when a bit is seen a third time, both ones and twos clear it out.
        int ones = 0, twos = 0;
        for(int num : nums) {
            ones = (ones ^ num) & ~twos;
            twos = (twos ^ num) & ~ones;
        }
        return ones;
}
}
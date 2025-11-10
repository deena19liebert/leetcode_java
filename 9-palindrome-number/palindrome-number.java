class Solution {
    public boolean isPalindrome(int x) {
        int originalNum = x;
        int reversedNum = 0;
        int remainder;

        if(x < 0) return false;

        while(x != 0) {
            remainder = x % 10;
            reversedNum = reversedNum * 10 + remainder;
            x /= 10;
        }
        return originalNum == reversedNum;
    }
}
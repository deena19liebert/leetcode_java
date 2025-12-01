class Solution {
    public int mySqrt(int x) {
        if (x == 0) return 0;
        int low=0, high=x;
        while(low <= high) {
            long mid = low + (high - low) / 2;
            long value = mid * mid;

            if (value == x) return (int) mid;
            else if(value <= x) low = (int) mid+1;
            else high = (int) mid - 1;
        }
        return high;
    }
}
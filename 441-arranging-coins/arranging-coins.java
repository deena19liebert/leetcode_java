class Solution {
    public int arrangeCoins(int n) {
        int low=0, high = n;
        while(low <= high){
            long mid = low +(high - low) /2;
            if(mid * (mid+1) / 2 <= n){
              low = (int)mid+1;
            } else {
              high = (int)mid-1;
            }
        }
        return low - 1;
    }
}
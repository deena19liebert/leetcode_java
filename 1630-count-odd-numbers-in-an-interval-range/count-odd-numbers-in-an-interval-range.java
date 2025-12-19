class Solution {
    public int countOdds(int low, int high) {
        int n = high - low + 1;
        int count=0;
        if(low % 2 == 1 || high % 2 == 1) {
            count = (high - low )/2 + 1;
        } else {
            count = (high - low )/2;
        }
        return count;
    }
}
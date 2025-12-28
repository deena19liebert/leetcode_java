class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int n = letters.length;
        char ans = letters[0];
        int low=0, high=n-1;
        while(low <= high) {
            int mid = (low + high) / 2;
            if(letters[n-1] <= target) return letters[0];
            if(letters[mid] > target) {
                ans = letters[mid];
                high = mid-1;
            }
            else {
                low = mid+1;
            }
        }
    return ans;
    }
}
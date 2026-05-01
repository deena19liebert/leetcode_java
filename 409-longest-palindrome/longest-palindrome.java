class Solution {
    public int longestPalindrome(String s) {
        int[] count = new int[128]; 
        for(char c : s.toCharArray()){
            count[c]++;
        }
        int length = 0;
        for(int c : count){
            length += (c / 2) * 2;
        }
        if(s.length() > length){
            length += 1;
        }
        return length;
    }
}
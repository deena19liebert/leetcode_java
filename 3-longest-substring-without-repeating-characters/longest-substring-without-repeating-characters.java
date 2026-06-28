class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] freq = new int[128]; // ASCII Characters
        int maxCount = 0;
        int left = 0;

        // s = "abcabcbb"

        for(int right=0; right<s.length(); right++){ 
            char ch = s.charAt(right);               // ch = a, b, c, a
            freq[ch]++;                              // freq[a]=1, freq[b]=1, freq[c]=1
                                                    // 4th loop => freq[a]=2
            while(freq[ch] > 1){                     
                freq[s.charAt(left)]--;             // freq[a] = 1;
                left++;                             // left = 1 
            }                                       // window becomes: [b, c, a]
            
            maxCount = Math.max(maxCount, right - left + 1);
        }
        return maxCount;
    }
}
class Solution {
    public String minWindow(String s, String t) {
        if(s.length() < t.length() || s.length() == 0 || t.length() == 0) return "";
        int[] freq = new int[128];
        
        for(char c : t.toCharArray()){
            freq[c]++;
        }

        int left = 0, right = 0;
        int required = t.length();
        int minLength = Integer.MAX_VALUE;
        int startIndex = 0;

        while(right < s.length()){
            char r = s.charAt(right);
            if(freq[r] > 0){
                required--;
            }                
            freq[r]--;      //the characters not in t will become -1
            right++;

            while(required == 0){
                if((right - left) < minLength){
                    minLength = right - left;
                    startIndex = left;
                }
                char l = s.charAt(left);
                freq[l]++;
                if(freq[l] > 0){
                    required++;
                }
                left++;
            }
        }
        return minLength == Integer.MAX_VALUE ? "" : s.substring(startIndex, startIndex + minLength);
    }
}
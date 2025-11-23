class Solution {
    public String minWindow(String s, String t) {
        if(s.length() == 0 || t.length() == 0) return "";
        int[] need = new int[128];
        for(char c : t.toCharArray()) {
            need[c]++;
        }
        int required=t.length();
        int startIndex = 0;
        int minLen = Integer.MAX_VALUE;
        int left=0, right=0;

        while (right < s.length()){
            char r = s.charAt(right);
            if(need[r] > 0){
                required--;
            }
            need[r]--;
            right++;

            while(required == 0){
                if(right - left < minLen) {
                    minLen = right - left;
                    startIndex = left;
                }
                char l = s.charAt(left);
                need[l]++;
                if(need[l] > 0) {
                    required++;
                }
                left++;
            }
        }
        return minLen == Integer.MAX_VALUE ? "" : s.substring(startIndex, startIndex + minLen);
    }
}
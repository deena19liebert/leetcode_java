class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int left=0, maxLen=0;

        for(int right=0; right<s.length(); right++){
            char r = s.charAt(right);
            map.put(r, map.getOrDefault(r,0)+1);

while (map.get(r) > 1) {
    char l = s.charAt(left);
    map.put(l, map.get(l) - 1);
    left++;
}
            maxLen = Math.max(maxLen, right-left+1);
        }
        return maxLen;
    }
}
class Solution {
    public int maxVowels(String s, int k) {
        Set<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        int left=0; 
        int count=0, maxLen=0;
        for(int right=0; right < s.length(); right++){
            if(vowels.contains(s.charAt(right))) {
                count++;
            }
            if((right - left + 1) > k) {
                if(vowels.contains(s.charAt(left))) {
                    count--;
                }
                left++;
            }
            maxLen = Math.max(maxLen, count);
        }
        return maxLen;
    }
}
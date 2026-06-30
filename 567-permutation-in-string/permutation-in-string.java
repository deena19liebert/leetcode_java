class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] count1 = new int[26];
        int[] count2 = new int[26];
        for(char ch : s1.toCharArray()){
            count1[ch - 'a']++;
        }
        int left = 0;
        for(int right = 0; right < s2.length(); right++){
            char r = s2.charAt(right);
            count2[r - 'a']++;

            if(right-left+1 > s1.length()){
                char l = s2.charAt(left);
                count2[l - 'a']--;
                left++;

                if(Arrays.equals(count1, count2)){
                    return true;
                }
            }
            if(right - left + 1 == s1.length()){
                if(Arrays.equals(count1, count2)){
                    return true;
                }
            }
        }
        return false;
    }
}
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int[] count1 = new int[26];
        int[] count2 = new int[26];

        List<Integer> result = new ArrayList<>();
        for(char c : p.toCharArray()){
            count1[c - 'a']++;
        }
        //SILDING WINDOW
        for(int i=0; i<s.length(); i++){
            count2[s.charAt(i) - 'a']++;

            // Remove the character out of the window
            if(i >= p.length()){
                count2[s.charAt(i - p.length()) - 'a']--;
            }
            if(Arrays.equals(count1, count2)) {
                result.add(i - p.length() + 1);
            }
        }
        return result;
    }
}
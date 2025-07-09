class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder result = new StringBuilder();
        Arrays.sort(strs);
        
        // we compare only the first and the last string

        char[] first = strs[0].toCharArray();
        char[] last = strs[strs.length-1].toCharArray();

        for(int i=0; i < first.length; i++){
            if(first[i] != last[i])
            break;
            result.append(first[i]);
        }
        return result.toString();
        }
    }

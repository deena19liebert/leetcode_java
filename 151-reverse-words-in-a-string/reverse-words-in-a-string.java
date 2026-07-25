class Solution {
    public String reverseWords(String s) {       // s = "the sky is blue"
        String[] words = s.trim().split("\\s+"); // words = [the, sky, is, blue]
        
        StringBuilder sb = new StringBuilder();
        for(int i = words.length - 1; i>=0; i--){
            sb.append(words[i]);
            if(i > 0) sb.append(" ");
        }
        return sb.toString();
    }
}
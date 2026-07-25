class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] word = s.split(" ");

        if(pattern.length() != word.length) return false;

        Map<Character, String> charToString = new HashMap<>();
        Map<String, Character> stringToChar = new HashMap<>();

        for(int i=0; i<pattern.length(); i++){
            char c = pattern.charAt(i);
            String w = word[i];
            
            if(charToString.containsKey(c)){
                if(!charToString.get(c).equals(w)){
                    return false;
                }
            } else {
                    charToString.put(c, w);
                }
                if(stringToChar.containsKey(w)){
                    if(stringToChar.get(w) != c){
                        return false;
                    }
                } else {
                        stringToChar.put(w, c);
                }
        }
        return true;
    }
}
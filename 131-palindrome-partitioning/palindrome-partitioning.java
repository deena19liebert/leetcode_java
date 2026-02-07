class Solution {
    public void backtrack(int start, String s, List<List<String>> result, List<String> path){
        if(start == s.length()){
            result.add(new ArrayList<>(path));
            return;
        }

        // i starts from 0 loops till s.length()-1
        for(int i=start; i < s.length(); i++){
            if(isPalindrome(start, i, s)){
                path.add(s.substring(start, i+1));
                backtrack(i+1, s, result, path);
                path.remove(path.size() - 1);
            }
        }
    }
    public static boolean isPalindrome(int left, int right, String s){
        //pass (0, 0, "abc")....0 !< 0...return true ("a")
        //pass (0, 1, "abc")....0 < 1...check condition....
        while(left < right){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            } else {
                left++;
                right--;
            }
        }
        return true;
    }
    public List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        backtrack(0, s, result, new ArrayList<>());
        return result;
    }
}
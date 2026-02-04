class Solution {
    public void backtrack(String current, int start, int end, int n, List<String> result){
        if(current.length() == 2*n) {
            result.add(current);
            return;
        }
        if(start < n){
            backtrack(current + "(", start+1, end, n, result);
        }

        if(end < start){
            backtrack(current + ")", start, end+1, n, result);
        }
    }
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backtrack("", 0, 0, n, result);
        return result;
    }
}
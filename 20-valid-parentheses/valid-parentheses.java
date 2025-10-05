class Solution {
    public boolean isValid(String s) {
        //stackkkkk
        Stack<Character> stack = new Stack<>();

        //we’re looping through each character c in the string s, one by one.
        for(char c : s.toCharArray()) {
            if(c == '(' || c == '[' || c == '{') stack.push(c);
            else if (stack.isEmpty() || (c == ')' && stack.pop() != '(') || (c == ']' && stack.pop() != '[') || (c == '}' && stack.pop() != '{')) return false;
           
        }
      return stack.isEmpty();
    }
}
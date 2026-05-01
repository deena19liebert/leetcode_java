// OPTIMAL
class Solution {
    public int longestPalindrome(String s) {
        int[] count = new int[128]; 
        for(char c : s.toCharArray()){
            count[c]++;
        }
        int length = 0;
        for(int c : count){
            length += (c / 2) * 2;
        }
        if(s.length() > length){
            length += 1;
        }
        return length;
    }
}
// Using hashset
// class Solution {
//     public int longestPalindrome(String s) {
//         Set<Character> set = new HashSet<>(); 

//         int length = 0;

//         for(char c : s.toCharArray()){
//             if(set.contains(c)){
//                 length += 2;
//                 set.remove(c);
//             } else {
//                 set.add(c);
//             }
//         }
//         if(!set.isEmpty()){
//             length += 1;
//         }
//         return length;
//     }
// }
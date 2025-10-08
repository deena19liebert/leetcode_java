class Solution {
    public String countAndSay(int n) {
        // ["3322251"] -> ["2 3s, 3 2s, 1 5 & 1 1"] -> ["23321511"]

        String result ="1"; // base case
        for(int i=2; i<=n; i++){
            StringBuilder sb = new StringBuilder();
            int count = 1;
            for(int j=1; j<result.length(); j++) {
                if(result.charAt(j) == result.charAt(j-1)) {
                    count++;
                } else {
                    sb.append(count).append(result.charAt(j-1));
                    count = 1;
                }
            }
            sb.append(count).append(result.charAt(result.length() - 1));
            result = sb.toString();
        }
        return result;
    }
}
class Solution {
    public int hammingWeight(int n) {
        StringBuilder binary = new StringBuilder();
        int count=0;
        while(n > 0){
            binary.append(n % 2);
            if(n % 2 == 1) count++;
            n /= 2;
        }
        return count;
    }
}
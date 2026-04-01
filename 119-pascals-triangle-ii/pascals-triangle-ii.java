class Solution {
    public List<Integer> getRow(int rowIndex) {
        // nC3 = n/1 * n-1/2 * n-2/3 
        List<Integer> result = new ArrayList<>();
        long res = 1;
        for(int i=0; i<=rowIndex; i++){
            result.add((int) res);
            res = res * (rowIndex - i) / (i + 1);
        }
        return result;     
    }
}
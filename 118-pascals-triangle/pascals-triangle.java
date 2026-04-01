class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> resultList = new ArrayList<>();
        
        for(int i=0; i<numRows; i++){
            long res = 1;
            List<Integer> row = new ArrayList<>();
            for(int j=0; j<=i; j++){
                row.add((int) res);
                res = res * (i - j) / (j + 1);
            }
            resultList.add(row);
        }

        return resultList;
    }
}
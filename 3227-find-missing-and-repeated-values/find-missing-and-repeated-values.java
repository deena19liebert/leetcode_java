// TC: O(n^2) + O(n * n) = O(n^2)+ O(n^2) = O(2n^2) = O(n^2) (remove constant)
// SC: O(n^2)
class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                int num = grid[i][j];
                map.put(num, map.getOrDefault(num, 0)+1);
            }
        }
        int duplicate = 0;
        int missing = 0;
        for(int i=1; i<=n * n; i++){
            Integer count = map.get(i);
            if(count != null && count == 2){
                duplicate = i;
            } else if(count == null){
                missing = i;
            }
        } return new int[]{duplicate, missing};
    }
}
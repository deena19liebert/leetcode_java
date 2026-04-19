// OPTIMAL SOLUTION, TC: O(n^2), SC: O(1)
class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        long N = (long) n * n;

        long expectedSum = N * (N+1) / 2;
        long expectedSquareSum = N * (N + 1) * (2*N + 1) / 6;

        long actualSum = 0, actualSquareSum = 0;

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                long value = grid[i][j];
                actualSum += value;
                actualSquareSum += value * value;
            }
        }

        long diff = actualSum - expectedSum;
        long diffSquare = actualSquareSum - expectedSquareSum;

        long sumDupMiss = diffSquare / diff;

        int duplicate = (int) ((diff + sumDupMiss)/2);
        int missing = (int) (sumDupMiss - duplicate);

    return new int[]{duplicate, missing};
    }
}